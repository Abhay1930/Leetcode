# Write your MySQL query statement below
SELECT a.player_id , min(a.event_date) as first_login
FROM Activity a
group by player_id;
