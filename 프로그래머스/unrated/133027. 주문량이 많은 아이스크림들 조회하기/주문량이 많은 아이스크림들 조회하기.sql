-- 코드를 입력하세요
select 
    j.flavor
    from first_half h
    join july j
    on h.flavor = j.flavor
    group by j.flavor
    order by sum(h.total_order + j.total_order) desc
    fetch first 3 row only;