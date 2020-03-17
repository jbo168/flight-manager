-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2020 at 12:20 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `flightdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `booking_id` int(11) NOT NULL,
  `flight_id` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `score` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`booking_id`, `flight_id`, `customer_id`, `comment`, `score`) VALUES
(1, 2, 2, 'HELLO', '1'),
(2, 3, 2, 'yeeee', '69'),
(3, 3, 5, 'Nice Flight I like very 2', '61');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `acc_type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `contact`, `email`, `first_name`, `last_name`, `password`, `acc_type`) VALUES
(1, '123', '213123@R3F', 'Jimmy', 'Tommy', '123', NULL),
(2, '084223123', 'rob@gmail.com', 'Rob', 'Bert', 'BertRob', NULL),
(3, '2341313', '234', 'Dan', 'Curry', '1', NULL),
(4, '5', '5', '123213', '32313', '5', NULL),
(5, '0834886572', 'DAN@MAIL.COM', 'dan', 'Curry', '$2a$10$imUk4uGoNDl/j5fFvNgic.8vD.jl4njyp7..kj1dyvESOkM7r95Ya', NULL),
(6, '0834886452', 'DA22222N@MAIL.COM', 'dan', 'curry', '$2a$10$m17GHB3RhDJnoGE7OzYYbuktqZPOfLL8TGv3DcQgpuyMtmKKqfkcW', NULL),
(15, '0834886452', 'danerinoncuirry@danmail.cei', 'dan', 'curry', '$2a$10$oQtogVxz9N7vfqSm1cL0kuQQQaVBAplC2FVYz6oYOwQqytf1wr13O', NULL),
(16, '0983212312', '123@gmail', 'luke', 'hogan', '$2a$10$p5xEgQDyIJmYFaTZoQqqYejaPwVCcZYETjNv4ANVOQA.YE1rm/1Ui', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `flight_id` int(11) NOT NULL,
  `airline` varchar(255) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `route_from` varchar(255) DEFAULT NULL,
  `route_to` varchar(255) DEFAULT NULL,
  `tickets` int(11) DEFAULT NULL,
  `departure` varchar(128) NOT NULL,
  `status` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`flight_id`, `airline`, `cost`, `route_from`, `route_to`, `tickets`, `departure`, `status`) VALUES
(2, 'Ryan Air', 123, 'Dublin', 'Lisbon', 12, '09/06', 'Clear'),
(3, 'Cook', 126, 'Dublin', 'New York', 1234, '14/09', 'Completed');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`booking_id`),
  ADD KEY `FK_Flights` (`flight_id`),
  ADD KEY `FK_Customers` (`customer_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`flight_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `booking_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `flight`
--
ALTER TABLE `flight`
  MODIFY `flight_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `FK_Customers` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_Flights` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`flight_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
