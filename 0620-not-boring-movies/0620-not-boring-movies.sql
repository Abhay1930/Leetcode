select c.id, c.movie, c.description, c.rating
from Cinema c
where id%2 != 0 AND description != "boring"
order by c.rating desc;