-- 코드를 입력하세요
-- 보호소에 들어온 기록이 없는 동물의 ID와 이름을 ID 순으로 조회
SELECT 
    a.animal_id, a.name
    from animal_outs a
    left join animal_ins b
    on a.animal_id = b.animal_id
    where b.datetime is null
    order by a.animal_id, a.name
    

    