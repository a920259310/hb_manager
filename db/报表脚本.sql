-- ---------------近七天收益查询--------------
SELECT 
b_species,
DATE_FORMAT(order_dt,'%Y-%m-%d') o_dt,
profit
FROM `ods_tb_order` 


WHERE DATE_FORMAT(order_dt,'%Y-%m-%d') >= DATE_FORMAT(DATE_ADD(NOW(),INTERVAL -7 DAY),'%Y-%m-%d')  
;



-- ----------------组合年化收益分析--------------
SELECT 
SUM(v5.week_one_price) * 7 AS week_all_price_rmb,
SUM(v5.week_one_price) AS week_all_price_usdt,
SUM(v5.week_profit) AS week_all_profit,
SUM(v5.week_profit) / SUM(v5.week_one_price) AS qi_rate,
SUM(v5.week_profit) / SUM(v5.week_one_price) * (365 / 7) AS year_rate

FROM (
SELECT 
v4.b_species ,
v4.pai_ming,
AVG(v4.one_price) * 51 AS week_one_price,
SUM(v4.day_profit) AS week_profit,

AVG(v4.one_price) * 51 / SUM(v4.day_profit) AS tou_chan_rate,
SUM(v4.day_profit) / (AVG(v4.one_price) * 51)  AS chan_tou_rate,

SUM(v4.day_profit) / (AVG(v4.one_price) * 51) * (365 / 7) AS last_year_rate

FROM 
(
SELECT 
DATE_FORMAT(v1.order_dt,'%Y-%m-%d') AS order_dt
,v1.`b_species`
,v2.pai_ming

,MAX(v3.one_price) AS one_price
,SUM(v1.profit) AS day_profit

FROM `ods_tb_order` AS v1
LEFT JOIN `b_base_info` AS v2 ON v1.b_species = CONCAT(v2.b_name,'/USDT')
LEFT JOIN `b_buy_price_detail` v3 ON v2.id = v3.fk_b_id AND v1.order_dt >= v3.create_time AND v1.order_dt < end_time

WHERE 1 = 1
AND DATE_FORMAT(v1.order_dt,'%Y-%m-%d') >= DATE_FORMAT(DATE_ADD(NOW(),INTERVAL -7 DAY),'%Y-%m-%d')  
AND v2.is_hava_chi_cang = '是'
GROUP BY DATE_FORMAT(v1.order_dt,'%Y-%m-%d'),v2.pai_ming,v1.`b_species`

) v4
GROUP BY v4.b_species,v4.pai_ming

) v5

;

-- -----------资金分配分析---------------
SELECT 
v2.fk_b_id,
v2.one_price,
v3.`b_name`
FROM (
		SELECT
                v1.fk_b_id,
                v1.one_price              
            FROM
                `b_buy_price_detail` v1              
            WHERE
                v1.`end_time` = '2030-12-31 12:00:00'
) v2 
LEFT JOIN `b_base_info` v3 ON v2.fk_b_id = v3.`id`;


-- 宽表查询语句
SELECT 
* 
FROM `dws_cru_open_profit_analysis` AS v1

WHERE 1 = 1

$IF(open_price_dayu_his_price_rate)$
	AND open_price_dayu_his_price_rate <= $open_price_dayu_his_price_rate$
$endif$

$IF(open_price_dayu_his_price_rate_9)$
	AND open_price_dayu_his_price_rate_9 <= $open_price_dayu_his_price_rate_9$
$endif$

$IF(open_price_dayu_his_price_rate_8)$
	AND open_price_dayu_his_price_rate_8 <= $open_price_dayu_his_price_rate_8$
$endif$

$IF(open_price_dayu_his_price_rate_7)$
	AND open_price_dayu_his_price_rate_7 <= $open_price_dayu_his_price_rate_7$
$endif$

$IF(open_price_dayu_his_price_rate_6)$
	AND open_price_dayu_his_price_rate_6 <= $open_price_dayu_his_price_rate_6$
$endif$

$IF(open_price_dayu_his_price_rate_5)$
	AND open_price_dayu_his_price_rate_5 <= $open_price_dayu_his_price_rate_5$
$endif$

$IF(cru_price_dayu_his_price_rate)$
	AND cru_price_dayu_his_price_rate <= $cru_price_dayu_his_price_rate$
$endif$

$IF(cru_price_dayu_his_price_rate_9)$
	AND cru_price_dayu_his_price_rate_9 <= $cru_price_dayu_his_price_rate_9$
$endif$

$IF(cru_price_dayu_his_price_rate_8)$
	AND cru_price_dayu_his_price_rate_8 <= $cru_price_dayu_his_price_rate_8$
$endif$

$IF(cru_price_dayu_his_price_rate_7)$
	AND cru_price_dayu_his_price_rate_7 <= $cru_price_dayu_his_price_rate_7$
$endif$

$IF(cru_price_dayu_his_price_rate_6)$
	AND cru_price_dayu_his_price_rate_6 <= $cru_price_dayu_his_price_rate_6$
$endif$

$IF(cru_price_dayu_his_price_rate_5)$
	AND cru_price_dayu_his_price_rate_5 <= $cru_price_dayu_his_price_rate_5$
$endif$

;



-- ---插入新的维度
INSERT INTO b_buy_price_detail(fk_b_id,one_price,create_time,end_time) VALUES 
(13,30,CONCAT(DATE_FORMAT(NOW(),'%Y-%m-%d'),' 23:59:59'),'2030-12-31 12:00:00');




-- 修改指定B的是否持仓状态
UPDATE `b_base_info` SET is_hava_chi_cang = '否' WHERE id IN ('5');

-- ---将过期的配置置零
UPDATE b_buy_price_detail v1
SET v1.end_time = CONCAT(DATE_FORMAT(NOW(),'%Y-%m-%d'),' 23:59:59')
WHERE v1.id IN (

SELECT id FROM (
	SELECT id FROM b_buy_price_detail v2
	WHERE 1 = 1
	AND v2.end_time = '2030-12-31 12:00:00'
	AND v2.fk_b_id IN ('5')
) v3

);

-- 修改指定B的开仓价格和开仓记录是否有效
UPDATE `ods_open_detail` SET open_price = 0,enable_flag = 0 WHERE fk_b_id IN ('5');




-- 删除B的基本信息
DELETE FROM `b_base_info` WHERE id > 5;

-- 删除B的一手价交易信息
DELETE FROM `b_buy_price_detail` WHERE fk_b_id > 5;

-- 删除B的历史数据信息
DELETE FROM `ods_bb_price_his` WHERE fk_b_id > 5;

-- 删除B的开仓价格信息
DELETE FROM `ods_open_detail` WHERE fk_b_id > 5;



SELECT * FROM `` WHERE b_species

DELETE FROM `ods_tb_order` WHERE b_species NOT IN ('BTC/USDT','ETH/USDT','BCH/USDT','XRP/USDT') ;



