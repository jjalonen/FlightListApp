DROP TABLE IF EXISTS TBL_FLIGHTS;

CREATE TABLE TBL_FLIGHTS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  depTime VARCHAR(250) NOT NULL,
  destination VARCHAR(250) NOT NULL,
  gate VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS TBL_AIRPORTS;

CREATE TABLE TBL_AIRPORTS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  airPortName VARCHAR(250) NOT NULL,
  address VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  country VARCHAR(250) NOT NULL
);