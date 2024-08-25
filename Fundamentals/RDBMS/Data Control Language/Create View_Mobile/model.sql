CREATE VIEW customer_mobile_details AS 
SELECT c.customer_id, c.customer_name, c.mobile, s.salesid, s.net_amount, m.model_name, m.manufacturer
FROM customer_info AS c, sales_info AS s, mobile_master AS m
WHERE c.customer_id = s.salesid 
AND s.ime_no = m.ime_no
ORDER BY c.customer_id, c.customer_name, s.salesid 
ASC;
