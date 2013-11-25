CREATE TABLE CONTACTS (
	CONTACT_ID INTEGER(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	FIRSTNAME VARCHAR(255) NOT NULL,
	LASTNAME VARCHAR(255) NOT NULL,
	TELEPHONE VARCHAR(255) NOT NULL,
	EMAIL VARCHAR(255) NOT NULL,
	CREATED DATE NOT NULL,
	PRIMARY KEY(CONTACT_ID)
) ENGINE=INNODB;

CREATE TABLE PERSON (
	PERSON_KEY INTEGER(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	PERSON_ID VARCHAR(255) NOT NULL,
	PERSON_NAME VARCHAR(255) NOT NULL,
	PRIMARY KEY(PERSON_KEY)
) ENGINE=INNODB;

CREATE TABLE CONTACT (
	CONTACT_ID INTEGER(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	FIRSTNAME VARCHAR(255) NOT NULL,
	LASTNAME VARCHAR(255) NOT NULL,
	TELEPHONE VARCHAR(255) NOT NULL,
	EMAIL VARCHAR(255) NOT NULL,
	CREATED DATE NOT NULL,
	PRIMARY KEY(CONTACT_ID)
) ENGINE=INNODB;