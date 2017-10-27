DROP DATABASE IF EXISTS amt_programs;
CREATE DATABASE amt_programs;
USE amt_programs;

CREATE TABLE program (
	id INT PRIMARY KEY AUTO_INCREMENT,
    language VARCHAR(30) DEFAULT NULL,
    type VARCHAR(30) DEFAULT NULL,
    version DOUBLE DEFAULT NULL
);

INSERT INTO program (id, language, type, version) VALUES (1, "C", "SCRIPT", 1.0);
INSERT INTO program (id, language, type, version) VALUES (2, "C", "SCRIPT", 2.0);