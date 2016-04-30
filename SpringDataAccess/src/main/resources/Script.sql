DROP DATABASE IF EXISTS test_db;

CREATE DATABASE test_db;

DROP TABLE IF EXISTS person;

CREATE TABLE person(
  id INT PRIMARY KEY,
  name VARCHAR(50)
);

INSERT INTO person VALUES(1, 'A');
INSERT INTO person VALUES(2, 'B');
INSERT INTO person VALUES(3, 'C');
INSERT INTO person VALUES(4, 'D');
INSERT INTO person VALUES(5, 'E');