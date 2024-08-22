create schema mydb;
create table mydb.CUSTOMERS(
                               id SERIAL PRIMARY KEY ,
                               name TEXT NOT NULL ,
                               surname TEXT NOT NULL ,
                               age SMALLSERIAL CHECK ( age >= 0 AND age <= 200),
                               phone_number varchar(20)
);
CREATE TABLE mydb.ORDERS(
                            id SERIAL PRIMARY KEY ,
                            date DATE NOT NULL ,
                            customer_id INT NOT NULL REFERENCES mydb.customers(id),
                            product_name VARCHAR(50) NOT NULL ,
                            amount SMALLSERIAL CHECK ( amount >= 0) NOT NULL
);