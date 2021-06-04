-- ALTER TABLE ods_bb_price_his ADD INDEX INS_BNAME(b_name);
-- ALTER TABLE ods_bb_price_his ADD INDEX INS_DATE(DATE);

-- 分析当前价格在历史价格的百分位数
DROP TABLE IF EXISTS dwd_cru_price_rate;
CREATE TABLE dwd_cru_price_rate
AS
SELECT 
* 
FROM b_base_info r1 
LEFT JOIN (

	SELECT 
	v4.*,
	(
	(v4.cru_price_dayu_his_price_rate - 50) + 
	(v4.cru_price_dayu_his_price_rate_9 - 50) + 
	(v4.cru_price_dayu_his_price_rate_8 - 50) + 
	(v4.cru_price_dayu_his_price_rate_7 - 50) + 
	(v4.cru_price_dayu_his_price_rate_6 - 50) + 
	(v4.cru_price_dayu_his_price_rate_5 - 50)
	) AS cru_price_dayu_his_sum_50
	FROM (


		SELECT 
		v3.fk_b_id,
		v3.price_today,
		COUNT(1) AS days,
		(SUM(v3.cru_price_dayu_his_price) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate,
		(SUM(v3.cru_price_xiaoyu_his_price) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate,
		
		(SUM(v3.cru_price_dayu_his_price_9) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate_9,
		(SUM(v3.cru_price_xiaoyu_his_price_9) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate_9,
		
		(SUM(v3.cru_price_dayu_his_price_8) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate_8,
		(SUM(v3.cru_price_xiaoyu_his_price_8) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate_8,
		
		(SUM(v3.cru_price_dayu_his_price_7) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate_7,
		(SUM(v3.cru_price_xiaoyu_his_price_7) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate_7,
		
		(SUM(v3.cru_price_dayu_his_price_6) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate_6,
		(SUM(v3.cru_price_xiaoyu_his_price_6) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate_6,
		
		(SUM(v3.cru_price_dayu_his_price_5) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate_5,
		(SUM(v3.cru_price_xiaoyu_his_price_5) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate_5,
		
		(SUM(v3.cru_price_dayu_his_price_4) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate_4,
		(SUM(v3.cru_price_xiaoyu_his_price_4) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate_4,
		
		(SUM(v3.cru_price_dayu_his_price_3) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate_3,
		(SUM(v3.cru_price_xiaoyu_his_price_3) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate_3,
		
		(SUM(v3.cru_price_dayu_his_price_2) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate_2,
		(SUM(v3.cru_price_xiaoyu_his_price_2) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate_2,
		
		(SUM(v3.cru_price_dayu_his_price_1) / COUNT(1)) * 100 AS cru_price_dayu_his_price_rate_1,
		(SUM(v3.cru_price_xiaoyu_his_price_1) / COUNT(1)) * 100 AS cru_price_xiaoyu_his_price_rate_1
		FROM (
			SELECT 
			v1.* ,
			v2.price_today,
			IF(v2.price_today >= v1.end_price,1,0) AS cru_price_dayu_his_price,
			IF(v2.price_today < v1.end_price,1,0) AS cru_price_xiaoyu_his_price,
			
			IF(v2.price_today_9 >= v1.end_price,1,0) AS cru_price_dayu_his_price_9,
			IF(v2.price_today_9 < v1.end_price,1,0) AS cru_price_xiaoyu_his_price_9,
			
			IF(v2.price_today_8 >= v1.end_price,1,0) AS cru_price_dayu_his_price_8,
			IF(v2.price_today_8 < v1.end_price,1,0) AS cru_price_xiaoyu_his_price_8,
			
			IF(v2.price_today_7 >= v1.end_price,1,0) AS cru_price_dayu_his_price_7,
			IF(v2.price_today_7 < v1.end_price,1,0) AS cru_price_xiaoyu_his_price_7,
			
			IF(v2.price_today_6 >= v1.end_price,1,0) AS cru_price_dayu_his_price_6,
			IF(v2.price_today_6 < v1.end_price,1,0) AS cru_price_xiaoyu_his_price_6,
			
			IF(v2.price_today_5 >= v1.end_price,1,0) AS cru_price_dayu_his_price_5,
			IF(v2.price_today_5 < v1.end_price,1,0) AS cru_price_xiaoyu_his_price_5,
			
			IF(v2.price_today_4 >= v1.end_price,1,0) AS cru_price_dayu_his_price_4,
			IF(v2.price_today_4 < v1.end_price,1,0) AS cru_price_xiaoyu_his_price_4,
			
			IF(v2.price_today_3 >= v1.end_price,1,0) AS cru_price_dayu_his_price_3,
			IF(v2.price_today_3 < v1.end_price,1,0) AS cru_price_xiaoyu_his_price_3,
			
			IF(v2.price_today_2 >= v1.end_price,1,0) AS cru_price_dayu_his_price_2,
			IF(v2.price_today_2 < v1.end_price,1,0) AS cru_price_xiaoyu_his_price_2,
			
			IF(v2.price_today_1 >= v1.end_price,1,0) AS cru_price_dayu_his_price_1,
			IF(v2.price_today_1 < v1.end_price,1,0) AS cru_price_xiaoyu_his_price_1
			FROM (
				-- 近三年的数据
				SELECT 
				* 
				FROM ods_bb_price_his 
				WHERE 1 = 1 
				AND DATE >= DATE_ADD(DATE_FORMAT(NOW(),'%Y-%m-%d'), INTERVAL -1095 DAY)
			) v1 LEFT JOIN (
				-- 最新价格
				SELECT 
				b_name,
				end_price AS price_today,
				end_price * 0.9 AS price_today_9,
				end_price * 0.8 AS price_today_8,
				end_price * 0.7 AS price_today_7,
				end_price * 0.6 AS price_today_6,
				end_price * 0.5 AS price_today_5,
				end_price * 0.4 AS price_today_4,
				end_price * 0.3 AS price_today_3,
				end_price * 0.2 AS price_today_2,
				end_price * 0.1 AS price_today_1
				FROM ods_bb_price_his AS t1
				-- , ods_open_detail as t2
				WHERE 1 = 1
				-- and t2.enable_flag = 0
				AND DATE = DATE_ADD(DATE_FORMAT(NOW(),'%Y-%m-%d'), INTERVAL -1 DAY)
				-- and t1.fk_b_id = t2.fk_b_id
			) v2 ON v1.b_name = v2.b_name
		) v3 
		GROUP BY v3.fk_b_id,v3.price_today
	) v4
	
) r2 ON r1.`id` = r2.fk_b_id ;




-- 分析开仓价格在历史价格的百分位数
DROP TABLE IF EXISTS dwd_open_price_rate;
CREATE TABLE dwd_open_price_rate
AS
SELECT 
* 
FROM b_base_info r1 
LEFT JOIN (


	SELECT 
	v4.*,
	(
	(v4.open_price_dayu_his_price_rate - 50) + 
	(v4.open_price_dayu_his_price_rate_9 - 50) + 
	(v4.open_price_dayu_his_price_rate_8 - 50) + 
	(v4.open_price_dayu_his_price_rate_7 - 50) + 
	(v4.open_price_dayu_his_price_rate_6 - 50) + 
	(v4.open_price_dayu_his_price_rate_5 - 50)
	) AS open_price_dayu_his_sum_50
	FROM (
		SELECT 
		v3.fk_b_id,
		v3.open_price,
		COUNT(1) AS days,
		(SUM(v3.open_price_dayu_his_price) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate,
		(SUM(v3.open_price_xiaoyu_his_price) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate,
		
		(SUM(v3.open_price_dayu_his_price_9) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate_9,
		(SUM(v3.open_price_xiaoyu_his_price_9) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate_9,
		
		(SUM(v3.open_price_dayu_his_price_8) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate_8,
		(SUM(v3.open_price_xiaoyu_his_price_8) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate_8,
		
		(SUM(v3.open_price_dayu_his_price_7) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate_7,
		(SUM(v3.open_price_xiaoyu_his_price_7) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate_7,
		
		(SUM(v3.open_price_dayu_his_price_6) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate_6,
		(SUM(v3.open_price_xiaoyu_his_price_6) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate_6,
		
		(SUM(v3.open_price_dayu_his_price_5) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate_5,
		(SUM(v3.open_price_xiaoyu_his_price_5) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate_5,
		
		(SUM(v3.open_price_dayu_his_price_4) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate_4,
		(SUM(v3.open_price_xiaoyu_his_price_4) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate_4,
		
		(SUM(v3.open_price_dayu_his_price_3) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate_3,
		(SUM(v3.open_price_xiaoyu_his_price_3) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate_3,
		
		(SUM(v3.open_price_dayu_his_price_2) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate_2,
		(SUM(v3.open_price_xiaoyu_his_price_2) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate_2,
		
		(SUM(v3.open_price_dayu_his_price_1) / COUNT(1)) * 100 AS open_price_dayu_his_price_rate_1,
		(SUM(v3.open_price_xiaoyu_his_price_1) / COUNT(1)) * 100 AS open_price_xiaoyu_his_price_rate_1
		FROM (
			SELECT 
			v1.* ,
			v2.open_price,
			IF(v2.open_price >= v1.end_price,1,0) AS open_price_dayu_his_price,
			IF(v2.open_price < v1.end_price,1,0) AS open_price_xiaoyu_his_price,
			
			IF(v2.open_price_9 >= v1.end_price,1,0) AS open_price_dayu_his_price_9,
			IF(v2.open_price_9 < v1.end_price,1,0) AS open_price_xiaoyu_his_price_9,
			
			IF(v2.open_price_8 >= v1.end_price,1,0) AS open_price_dayu_his_price_8,
			IF(v2.open_price_8 < v1.end_price,1,0) AS open_price_xiaoyu_his_price_8,
			
			IF(v2.open_price_7 >= v1.end_price,1,0) AS open_price_dayu_his_price_7,
			IF(v2.open_price_7 < v1.end_price,1,0) AS open_price_xiaoyu_his_price_7,
			
			IF(v2.open_price_6 >= v1.end_price,1,0) AS open_price_dayu_his_price_6,
			IF(v2.open_price_6 < v1.end_price,1,0) AS open_price_xiaoyu_his_price_6,
			
			IF(v2.open_price_5 >= v1.end_price,1,0) AS open_price_dayu_his_price_5,
			IF(v2.open_price_5 < v1.end_price,1,0) AS open_price_xiaoyu_his_price_5,
			
			IF(v2.open_price_4 >= v1.end_price,1,0) AS open_price_dayu_his_price_4,
			IF(v2.open_price_4 < v1.end_price,1,0) AS open_price_xiaoyu_his_price_4,
			
			IF(v2.open_price_3 >= v1.end_price,1,0) AS open_price_dayu_his_price_3,
			IF(v2.open_price_3 < v1.end_price,1,0) AS open_price_xiaoyu_his_price_3,
			
			IF(v2.open_price_2 >= v1.end_price,1,0) AS open_price_dayu_his_price_2,
			IF(v2.open_price_2 < v1.end_price,1,0) AS open_price_xiaoyu_his_price_2,
			
			IF(v2.open_price_1 >= v1.end_price,1,0) AS open_price_dayu_his_price_1,
			IF(v2.open_price_1 < v1.end_price,1,0) AS open_price_xiaoyu_his_price_1
			FROM (
				-- 近三年的数据
				SELECT 
				* 
				FROM ods_bb_price_his 
				WHERE 1 = 1 
				AND DATE >= DATE_ADD(DATE_FORMAT(NOW(),'%Y-%m-%d'), INTERVAL -1095 DAY)
			) v1 RIGHT JOIN (
				-- 开仓价格
				SELECT 
				v2.b_name,
				v1.open_price AS open_price,
				v1.open_price * 0.9 AS open_price_9,
				v1.open_price * 0.8 AS open_price_8,
				v1.open_price * 0.7 AS open_price_7,
				v1.open_price * 0.6 AS open_price_6,
				v1.open_price * 0.5 AS open_price_5,
				v1.open_price * 0.4 AS open_price_4,
				v1.open_price * 0.3 AS open_price_3,
				v1.open_price * 0.2 AS open_price_2,
				v1.open_price * 0.1 AS open_price_1
				FROM ods_open_detail AS v1
				LEFT JOIN b_base_info AS v2 ON v1.fk_b_id = v2.id
				WHERE 1 = 1
				AND v1.enable_flag = 1
				
			) v2 ON v1.b_name = v2.b_name
		) v3 
		GROUP BY v3.fk_b_id,v3.open_price
	) v4
	
	
	
	
) r2 ON r1.`id` = r2.fk_b_id
WHERE 1 = 1;


-- ----------------盈利投产比分析--------------
DROP TABLE IF EXISTS dwd_profit_analysis;
CREATE TABLE dwd_profit_analysis
AS
SELECT 
v4.b_species ,
v4.id,
MAX(v4.one_price) AS one_price,
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
,v2.id

,MAX(v3.one_price) AS one_price
,SUM(v1.profit) AS day_profit

FROM `ods_tb_order` AS v1
LEFT JOIN `b_base_info` AS v2 ON v1.b_species = CONCAT(v2.b_name,'/USDT')
LEFT JOIN `b_buy_price_detail` v3 ON v2.id = v3.fk_b_id AND v1.order_dt >= v3.create_time AND v1.order_dt < end_time

WHERE 1 = 1

AND DATE_FORMAT(v1.order_dt,'%Y-%m-%d') >= DATE_FORMAT(DATE_ADD(NOW(),INTERVAL -7 DAY),'%Y-%m-%d')  

-- AND DATE_FORMAT(v1.order_dt,'%Y-%m-%d') >= $start_date$ 
-- AND DATE_FORMAT(v1.order_dt,'%Y-%m-%d') <= $end_date$ 

GROUP BY DATE_FORMAT(v1.order_dt,'%Y-%m-%d'),v2.id,v1.`b_species`

) v4
GROUP BY v4.b_species,v4.id

;


-- ----------------盈利投产比-价格百分位-开仓价格百分位-分析--------------
DROP TABLE IF EXISTS dws_cru_open_profit_analysis;
CREATE TABLE dws_cru_open_profit_analysis
AS
SELECT 
v1.* ,
v2.`open_price`,
v2.`days` AS open_price_days,
v2.`open_price_dayu_his_price_rate`,
v2.`open_price_xiaoyu_his_price_rate`,
v2.`open_price_dayu_his_price_rate_9`,
v2.`open_price_xiaoyu_his_price_rate_9`,
v2.`open_price_dayu_his_price_rate_8`,
v2.`open_price_xiaoyu_his_price_rate_8`,
v2.`open_price_dayu_his_price_rate_7`,
v2.`open_price_xiaoyu_his_price_rate_7`,
v2.`open_price_dayu_his_price_rate_6`,
v2.`open_price_xiaoyu_his_price_rate_6`,
v2.`open_price_dayu_his_price_rate_5`,
v2.`open_price_xiaoyu_his_price_rate_5`,
v2.`open_price_dayu_his_price_rate_4`,
v2.`open_price_xiaoyu_his_price_rate_4`,
v2.`open_price_dayu_his_price_rate_3`,
v2.`open_price_xiaoyu_his_price_rate_3`,
v2.`open_price_dayu_his_price_rate_2`,
v2.`open_price_xiaoyu_his_price_rate_2`,
v2.`open_price_dayu_his_price_rate_1`,
v2.`open_price_xiaoyu_his_price_rate_1`,
v2.`open_price_dayu_his_sum_50`,

v3.`price_today` AS cru_price,
v3.`days` AS cru_price_days,
v3.`cru_price_dayu_his_price_rate`,
v3.`cru_price_xiaoyu_his_price_rate`,
v3.`cru_price_dayu_his_price_rate_9`,
v3.`cru_price_xiaoyu_his_price_rate_9`,
v3.`cru_price_dayu_his_price_rate_8`,
v3.`cru_price_xiaoyu_his_price_rate_8`,
v3.`cru_price_dayu_his_price_rate_7`,
v3.`cru_price_xiaoyu_his_price_rate_7`,
v3.`cru_price_dayu_his_price_rate_6`,
v3.`cru_price_xiaoyu_his_price_rate_6`,
v3.`cru_price_dayu_his_price_rate_5`,
v3.`cru_price_xiaoyu_his_price_rate_5`,
v3.`cru_price_dayu_his_price_rate_4`,
v3.`cru_price_xiaoyu_his_price_rate_4`,
v3.`cru_price_dayu_his_price_rate_3`,
v3.`cru_price_xiaoyu_his_price_rate_3`,
v3.`cru_price_dayu_his_price_rate_2`,
v3.`cru_price_xiaoyu_his_price_rate_2`,
v3.`cru_price_dayu_his_price_rate_1`,
v3.`cru_price_xiaoyu_his_price_rate_1`,
v3.`cru_price_dayu_his_sum_50`,

v4.`one_price`,
v4.`week_one_price`,
v4.`week_profit`,
v4.`tou_chan_rate`,
v4.`chan_tou_rate`,
v4.`last_year_rate`


FROM `b_base_info` v1
LEFT JOIN `dwd_open_price_rate` v2 ON v1.id = v2.id
LEFT JOIN `dwd_cru_price_rate` v3 ON v1.id = v3.id
LEFT JOIN `dwd_profit_analysis` v4 ON v1.id = v4.id
;





