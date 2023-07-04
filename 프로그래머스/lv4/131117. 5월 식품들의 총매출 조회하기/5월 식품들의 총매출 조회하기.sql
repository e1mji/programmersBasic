-- 코드를 입력하세요
--  2022년 5월인 식품들의 식품 ID, 식품 이름,
-- 총매출을 조회하는 SQL문을 작성해주세요.
SELECT 
    fp.product_id , fp.product_name, sum(fp.price * fo.amount) as totalsales 
    from food_product fp
    join food_order fo
    -- join의 조건 
    on fp.product_id = fo.product_id
    -- 이때 결과는 총매출을 기준으로 내림차순 정렬해주시고 
    -- 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬해주세요.
    where to_char(produce_date, 'yyyy-mm') = '2022-05'
    group by fp.product_id, fp.product_name 
    order by totalsales desc, fp.product_id

