 SELECT orders.order_id, customers.first_name, customers.last_name, customers.email FROM orders
 JOIN customers  ON orders.customer_id =  customers.customer_id;

SELECT customers.first_name, customers.last_name, SUM(total_amount) AS revenue FROM
orders JOIN customers USING(customer_id) GROUP BY customer_id ORDER BY revenue DESC;


SELECT products.product_name, orders.order_date, customers.last_name FROM products JOIN orders USING(product_id)
JOIN customers USING(customer_id)
WHERE orders.order_date < "2023-09-24";
