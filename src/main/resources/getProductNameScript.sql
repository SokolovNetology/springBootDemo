SELECT *
FROM mydb.ORDERS
         JOIN mydb.CUSTOMERS
              ON mydb.CUSTOMERS.id = ORDERS.customer_id
WHERE LOWER(mydb.CUSTOMERS.name) = LOWER(:name);