-- 코드를 입력하세요
--select count(a.name)
--from (SELECT name
--        from ANIMAL_INS
--       group by name   ) a

select count(distinct name) as count
    from  animal_ins
    where name is not null 
