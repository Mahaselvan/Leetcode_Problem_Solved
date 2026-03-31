select id ,movie,description,rating from Cinema having id %2 <>0 && description <> "boring" order by rating desc;
