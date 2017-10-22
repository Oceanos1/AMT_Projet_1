DROP DATABASE IF EXISTS amt_programs;
CREATE DATABASE amt_programs;
USE amt_programs;

CREATE TABLE program (
	id INT PRIMARY KEY AUTO_INCREMENT,
    language VARCHAR(30) DEFAULT NULL,
    type VARCHAR(30) DEFAULT NULL,
    version DOUBLE DEFAULT NULL
);

INSERT INTO program (id, language, type, version) VALUES (1, "C", "Script", 1.0);
INSERT INTO program (id, language, type, version) VALUES (2, "C", "Script", 2.0);