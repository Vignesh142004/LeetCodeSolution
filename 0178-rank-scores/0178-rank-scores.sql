select score,DENSE_RANK() OVER(order by score desc) AS 'rank' from Scores order by score desc;
