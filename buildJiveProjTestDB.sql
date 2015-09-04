-- Generates a new test database and table for the jiveProj WAR application
DROP DATABASE IF EXISTS jiveProj;
CREATE DATABASE jiveProj;
USE jiveProj;
DROP TABLE IF EXISTS dev_env;
CREATE TABLE dev_env (os VARCHAR(10), version VARCHAR(25), notes VARCHAR(255));
INSERT INTO dev_env (os, version, notes) VALUES ('Windows', '10', 'Implemented 03SEP2015');
INSERT INTO dev_env (os, version, notes) VALUES ('Linux', 'Ubuntu 14.04.3 LTS', '');
INSERT INTO dev_env (os, version, notes) VALUES ('android', '5.1 Lollipop', 'Implemented 03SEP2015');
SELECT * FROM dev_env;
