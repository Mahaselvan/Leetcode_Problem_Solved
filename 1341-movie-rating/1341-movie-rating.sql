(SELECT name AS results
 FROM Users u
 JOIN MovieRating USING(user_id)
 GROUP BY user_id
 ORDER BY COUNT(*) DESC, name
 LIMIT 1)

UNION ALL

(SELECT title AS results
 FROM Movies m
 JOIN MovieRating USING(movie_id)
 WHERE created_at LIKE '2020-02%'
 GROUP BY movie_id
 ORDER BY AVG(rating) DESC, title
 LIMIT 1);