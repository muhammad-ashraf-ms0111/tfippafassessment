DROP SCHEMA IF EXISTS `acme_bank` ;

CREATE SCHEMA `acme_bank` ;

USE acme_bank;

CREATE TABLE `accounts` (
  `account_id` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `balance` decimal(6,2) NOT NULL,
  PRIMARY KEY (`account_id`)
);
