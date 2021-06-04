-- 查询脚本

-- 查询指定币种近三年指定价格百分位的价格是多少?
SELECT * FROM (
	SELECT 
	@num := @num+1 num,
	v1.`b_name`,
	v1.`end_price`
	FROM ods_bb_price_his v1, (SELECT @str := '', @num := 0) v2
	WHERE 1 = 1 
	AND b_name = 'ATOM'
	AND DATE >= DATE_ADD(DATE_FORMAT(NOW(),'%Y-%m-%d'), INTERVAL -1095 DAY)
	ORDER BY v1.`end_price` DESC
) v3
WHERE 1 = 1
-- and v3.num = ROUND(1095*0.3,0)
AND v3.end_price >=6.08
;


SELECT 
COUNT(1)
FROM ods_bb_price_his v1
WHERE 1 = 1 
AND b_name = 'ATOM';

