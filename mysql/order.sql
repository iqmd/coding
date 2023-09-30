CREATE TABLE orders (
       order_id INT PRIMARY KEY,
       customer_id INT REFERENCES customers(customer_id),
       order_date DATE,
       total_amount DECIMAL
);
