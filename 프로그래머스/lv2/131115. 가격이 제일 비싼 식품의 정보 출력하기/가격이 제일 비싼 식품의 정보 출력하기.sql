-- 코드를 입력하세요

--SELECT max(price) from food_product

--전체목록 중에서 가격이 최대가격과 일치하는 내용 
select * from food_product
    where
        price = (select max(price) from food_product)
