-- phpMyAdmin SQL Dump
-- version 3.5.8.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2014 at 10:15 AM
-- Server version: 5.6.11
-- PHP Version: 5.4.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `ACCOUNT`
--


--
-- Dumping data for table `ACCOUNT`
--


-- --------------------------------------------------------

--
-- Table structure for table `ACCOUNT_AUTHORITY`
--

--
-- Dumping data for table `ACCOUNT_AUTHORITY`
--


-- --------------------------------------------------------

--
-- Table structure for table `AUTHORITY`
--

CREATE TABLE IF NOT EXISTS `AUTHORITY` (
  `AUTHORITY_KEY` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`AUTHORITY_KEY`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `AUTHORITY`
--

-- --------------------------------------------------------

--
-- Table structure for table `Contact`
--

CREATE TABLE IF NOT EXISTS `Contact` (
  `CONTACT_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` varchar(255) NOT NULL,
  `LASTNAME` varchar(255) NOT NULL,
  `TELEPHONE` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `CREATED` date NOT NULL,
  PRIMARY KEY (`CONTACT_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `Contact`
--

INSERT INTO `Contact` (`CONTACT_ID`, `FIRSTNAME`, `LASTNAME`, `TELEPHONE`, `EMAIL`, `CREATED`) VALUES
(1, 'cheonsoo', 'park', '010-8915-0008', 'mansoo1500@gmail.com', '2013-07-08'),
(2, 'a', 'a', 'a', 'a', '2013-07-08'),
(5, 'c', 'c', 'c', 'c', '2013-08-05'),
(6, 'd', 'd', 'd', 'd', '2013-08-05'),
(7, 'e', 'e', 'e', 'e', '2013-08-05'),
(8, 'f', 'f', 'f', 'f', '2013-08-05'),
(9, 'g', 'g', 'g', 'g', '2013-08-05'),
(11, 'h', 'h', 'h', 'h', '2013-08-05'),
(12, 'i', 'i', 'i', 'i', '2013-08-19'),
(13, 'test', 'test', 'test', 'test', '2013-11-19'),
(14, 'testtest', 'test', 'test', 'test', '2013-11-25');

-- --------------------------------------------------------

--
-- Table structure for table `USERS`
--

CREATE TABLE IF NOT EXISTS `USERS` (
  `USERKEY` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `ENABLED` tinyint(1) NOT NULL,
  PRIMARY KEY (`USERKEY`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `USERS`
--

INSERT INTO `USERS` (`USERKEY`, `USERNAME`, `PASSWORD`, `ENABLED`) VALUES
(1, 'admin', 'admin', 1),
(2, 'mansoo', 'mansoo', 1),
(3, 'user', 'user', 1);

-- --------------------------------------------------------

--
-- Table structure for table `USER_ROLES`
--

CREATE TABLE IF NOT EXISTS `USER_ROLES` (
  `USERKEY` int(11) NOT NULL,
  `AUTHORITY` varchar(50) NOT NULL,
  UNIQUE KEY `AUTHORITIES_IDX_1` (`USERKEY`,`AUTHORITY`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `USER_ROLES`
--

INSERT INTO `USER_ROLES` (`USERKEY`, `AUTHORITY`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER'),
(3, 'ROLE_ADMIN'),
(3, 'ROLE_USER');

--
-- Constraints for dumped tables
--

--

--
-- Constraints for table `USER_ROLES`
--
ALTER TABLE `USER_ROLES`
  ADD CONSTRAINT `user_roles_ibfk_1` FOREIGN KEY (`USERKEY`) REFERENCES `USERS` (`USERKEY`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
