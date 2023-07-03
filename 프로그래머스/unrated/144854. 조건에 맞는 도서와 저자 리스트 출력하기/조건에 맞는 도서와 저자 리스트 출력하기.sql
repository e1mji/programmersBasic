-- 코드를 입력하세요
select 
    b.book_id, a.author_name, to_char(published_date, 'yyyy-mm-dd')
    from author a
    join book b
        on a.author_id = b.author_id
        where b.category = '경제'
    order by b.published_date
    