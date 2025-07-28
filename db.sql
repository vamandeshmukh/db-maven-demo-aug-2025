
SELECT * FROM employees;


CREATE TABLE employees (id SERIAL PRIMARY KEY, name VARCHAR(50),salary NUMERIC(10, 2));

INSERT INTO employees (id, name, salary) VALUES (101, 'Sonu', 90000);
INSERT INTO employees (id, name, salary) VALUES (102, 'Monu', 95000);
INSERT INTO employees (id, name, salary) VALUES (103, 'Tonu', 88000);
INSERT INTO employees (id, name, salary) VALUES (104, 'Ponu', 92000);

