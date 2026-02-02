SELECT product_name,year,price
FROM Sales
LEFT JOIN Product 
ON Product.Product_id = Sales.Product_id
