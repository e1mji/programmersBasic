-- 코드를 입력하세요
select 
    h.flavor
    from first_half h
    join july j
    on h.flavor = j.flavor
    group by h.flavor
    order by sum(h.total_order + j.total_order) desc
    fetch first 3 row only;
    
