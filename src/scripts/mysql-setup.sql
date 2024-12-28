DROP DATABASE IF EXISTS wp;
DROP USER IF EXISTS `wpadmin`@`%`;
DROP USER IF EXISTS `wpuser`@`%`;
CREATE DATABASE IF NOT EXISTS wp CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `wpadmin`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
    CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `wp`.* TO `wpadmin`@`%`;
CREATE USER IF NOT EXISTS `wpuser`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, SHOW VIEW ON `wp`.* TO `wpuser`@`%`;
FLUSH PRIVILEGES;
