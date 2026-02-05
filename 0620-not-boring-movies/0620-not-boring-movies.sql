SELECT id,movie,description,rating 
FROM Cinema 
where id%2!=0 AND description!='boring'
ORDER BY rating DESC;