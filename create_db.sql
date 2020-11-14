DROP DATABASE IF EXISTS account_credentials;
CREATE DATABASE account_credentials;
USE account_credentials;
CREATE TABLE account_info (username varchar(64), password varchar(64));
INSERT INTO account_info (username, password) VALUES
    ('admin', 'admin'),
    ('user1', 'pass1'),
    ('user2', 'pass2');

SELECT * FROM account_info;