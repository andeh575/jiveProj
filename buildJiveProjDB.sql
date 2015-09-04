-- Generates a new database and table for the jiveProj WAR application
DROP DATABASE IF EXISTS jiveProj;
CREATE DATABASE jiveProj;
USE jiveProj;
DROP TABLE IF EXISTS dev_env;
CREATE TABLE dev_env (os VARCHAR(10), version VARCHAR(25), notes VARCHAR(255));
SELECT * FROM dev_env;