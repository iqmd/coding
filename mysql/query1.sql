 select orders.order_id, customers.first_name, customers.last_name, customers.email
 from orders
 join customers  on orders.customer_id =  customers.customer_id;

select customers.first_name, customers.last_name, SUM(total_amount) as revenue from
orders JOIN customers using(customer_id) group by customer_id order by revenue desc;


select products.product_name, orders.order_date, customers.last_name from products join orders using(product_id)
join customers using(customer_id)
where orders.order_date < "2023-09-24";
