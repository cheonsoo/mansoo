CREATE TABLE ACCOUNT (
	ACCOUNT_KEY  INTEGER(11)  NOT NULL AUTO_INCREMENT,
	ACCOUNT_ID   VARCHAR(255) NOT NULL,
	ACCOUNT_NAME VARCHAR(255) NOT NULL,
	PASSWORD  VARCHAR(255) NOT NULL,
	PRIMARY KEY (ACCOUNT_KEY)
) ENGINE=INNODB;

CREATE TABLE AUTHORITY (
	AUTHORITY_KEY INTEGER(11) NOT NULL AUTO_INCREMENT,
	ROLE_NAME     VARCHAR(50) NOT NULL,
	PRIMARY KEY (AUTHORITY_KEY)
) ENGINE = INNODB;

CREATE TABLE ACCOUNT_AUTHORITY (
    ACCOUNT_KEY   INTEGER(11) NOT NULL,
    AUTHORITY_KEY INTEGER(11) NOT NULL,
    FOREIGN KEY (ACCOUNT_KEY) REFERENCES ACCOUNT (ACCOUNT_KEY),
    FOREIGN KEY (AUTHORITY_KEY) REFERENCES AUTHORITY (AUTHORITY_KEY)
) ENGINE = INNODB;



INSERT INTO `ACCOUNT` (`ACCOUNT_KEY`, `ACCOUNT_ID`, `ACCOUNT_NAME`, `PASSWORD`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'mansoo', 'mansoo', 'mansoo');

INSERT INTO `AUTHORITY` (`AUTHORITY_KEY`, `ROLE_NAME`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

INSERT INTO `ACCOUNT_AUTHORITY` (`ACCOUNT_KEY`, `AUTHORITY_KEY`) VALUES
(1, 1),
(2, 2);










/*
CREATE TABLE USER (
	USER_KEY  INTEGER(11)  NOT NULL PRIMARY KEY,
	USER_ID   VARCHAR(255) NOT NULL,
	USER_NAME VARCHAR(255) NOT NULL,
	PASSWORD  VARCHAR(255) NOT NULL
) ENGINE=INNODB;

CREATE TABLE AUTHORITY (
	AUTHORITY_KEY INTEGER(11) NOT NULL PRIMARY KEY,
	ROLE_NAME     VARCHAR(50) NOT NULL
) ENGINE = INNODB;

CREATE TABLE USER_AUTHORITY (
    USER_KEY      INTEGER(11) NOT NULL,
    AUTHORITY_KEY INTEGER(11) NOT NULL,
    FOREIGN KEY (USER_KEY) REFERENCES USER (USER_KEY),
    FOREIGN KEY (AUTHORITY_KEY) REFERENCES AUTHORITY (AUTHORITY_KEY)
) ENGINE = INNODB;
*/

























/*
create table users (
    username varchar(50) not null primary key,
    password varchar(50) not null,
    enabled boolean not null
) engine = InnoDb;

create table authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    foreign key (username) references users (username),
    unique index authorities_idx_1 (username, authority)
) engine = InnoDb;

INSERT INTO users(`username`,`password`,`enabled`) VALUES( 'admin','admin',1);
INSERT INTO authorities(`username`,`authority`) VALUES('admin','ROLE_ADMIN');
*/

create table users (
    username varchar(50) not null primary key,
    password varchar(50) not null,
    enabled boolean not null
) engine = InnoDb;

create table user_roles (
    username varchar(50) not null,
    authority varchar(50) not null,
    foreign key (username) references users (username),
    unique index authorities_idx_1 (username, authority)
) engine = InnoDb;

INSERT INTO users(`username`,`password`,`enabled`) VALUES( 'admin','admin',1);
INSERT INTO user_roles(`username`,`authority`) VALUES('admin','ROLE_ADMIN');