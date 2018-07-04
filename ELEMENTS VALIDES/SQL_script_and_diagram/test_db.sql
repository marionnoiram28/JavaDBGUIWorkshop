-- create database
CREATE DATABASE test_db DEFAULT CHARACTER SET utf8;
-- select  test_db
USE test_db;
-- create first table(persons)
CREATE TABLE persons (id TINYINT(3) AUTO_INCREMENT PRIMARY KEY, name VARCHAR(25), first_name VARCHAR(25),
telephone_number VARCHAR(20), function VARCHAR(20));
-- create second table(transportation_means)
CREATE TABLE
	transportation_means (id TINYINT(3) NOT NULL AUTO_INCREMENT PRIMARY KEY, motorized_vhl CHAR(1), eco_vhl CHAR(1),
	public_transport CHAR(1), walks CHAR(1));
-- foreign key: transportation_means has foreign key on id column of referenced id in table persons
ALTER TABLE transportation_means
	ADD CONSTRAINT fk_id_transportation_means FOREIGN KEY(id) REFERENCES test_db.persons(id);
-- create third table (addresses)
CREATE TABLE
	addresses (id TINYINT(3) NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(25), first_name VARCHAR(25),
	number_and_street VARCHAR(50), city VARCHAR(25), zip_code MEDIUMINT(6), country VARCHAR(20));
-- foreign key: addresses table is referencing table and a has foreign key on name and first_name columns of referenced persons_name
ALTER TABLE addresses
	ADD CONSTRAINT fk_name_first_name_addresses FOREIGN KEY(name, first_name)
		REFERENCES test_db.persons(name, first_name);
-- create fourth table (distance_from_work)
CREATE TABLE distance_from_work
	(id TINYINT(3) NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(25),  first_name VARCHAR(25),
	available_rate CHAR(1));
	-- here I decide to save ressources by affecting the available_rate to a single initial corresponding to >>> N for nearby, M for medium range, F for far
ALTER TABLE distance_from_work
	ADD CONSTRAINT fk_name_first_name_distance_from_work FOREIGN KEY(name, first_name)
		REFERENCES test_db.persons(name, first_name);

-- VALIDE PAR MARION
