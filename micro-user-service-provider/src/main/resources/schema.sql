DROP TABLE user if exists;

CREATE TABLE user (
  id BIGINT GENERATED BY DEFAULT as IDENTITY ,
  name VARCHAR(40),
  age INT(3),
  PRIMARY KEY (id)
);