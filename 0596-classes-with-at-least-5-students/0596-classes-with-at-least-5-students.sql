select class
from Courses
group by class
HAVING COUNT(class)>=5;

