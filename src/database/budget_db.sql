-- Database: budget

-- DROP DATABASE budget;

CREATE DATABASE budget
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

DROP TABLE budget_item;

CREATE TABLE budget_item (
	id SERIAL NOT NULL,
	paid boolean,
	date_due Date,
	item varchar(255),
	amount decimal,
	reviewed boolean	
);

INSERT INTO budget_item (paid, date_due, item, amount, reviewed)
VALUES (true, NOW(), 'Paycheck', 500.00, true),
		(false, NOW(), 'Gas', -25.00, true),
		(false, NOW(), 'Electric', -150.00, true);
		
SELECT * FROM budget_item;