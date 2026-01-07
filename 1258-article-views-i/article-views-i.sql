# Write your MySQL query statement below
select distinct(v.author_id) as id
from Views v
where author_id = viewer_id
order by id;