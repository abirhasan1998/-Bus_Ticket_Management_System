-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2019 at 12:48 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.0.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus_ticket`
--

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `id` int(11) NOT NULL,
  `person_name` varchar(255) NOT NULL,
  `person_phn` varchar(255) NOT NULL,
  `journey_date` varchar(255) NOT NULL,
  `destination` varchar(255) NOT NULL,
  `arrival_time` varchar(255) NOT NULL,
  `counter_name` varchar(255) NOT NULL,
  `bus_no` varchar(255) NOT NULL,
  `seat_no` varchar(255) NOT NULL,
  `fee` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`id`, `person_name`, `person_phn`, `journey_date`, `destination`, `arrival_time`, `counter_name`, `bus_no`, `seat_no`, `fee`) VALUES
(1, 'Shakil', '1235', '5/5/19', 'Dhaka-Lalmonirhat', '04:40 am', 'B--3', 'Abdullahpur', '01', ''),
(2, 'Shezan', '15523234', '3/3/47', 'Dhaka-Cox Bazar', '05:40 am', 'C--3', 'BNS', '02', '750TK'),
(4, 'jfdyj', '87667676', '6576767', 'Dhaka-Chapai Nawab gang', '05:40 am', 'C--4', 'Azompur', '02', '600TK'),
(5, 'hdhe', '676686', '456345', 'Dhaka-Chapai Nawab gang', '10:40 am', 'A--8', 'Azompur', '03', '600TK'),
(6, 'hdhe', '676686', '456345', 'Dhaka-Chapai Nawab gang', '10:40 am', 'A--8', 'Azompur', '03', '600TK'),
(7, 'ghjhj', '323', '52', 'Dhaka-Chapai Nawab gang', '04:40 am', 'C--3', 'Abdullahpur', '00', '600TK'),
(8, 'bjmv mv', '5452', '4545', 'Dhaka-Chapai Nawab gang', '04:40 am', 'C--3', 'Abdullahpur', '00', '600TK'),
(9, 'vdb', '4242', '124244254', 'Dhaka-Chapai Nawab gang', '04:40 am', 'C--4', 'Tongi', '01', '600TK'),
(10, 'vdb', '4242', '124244254', 'Dhaka-Chapai Nawab gang', '04:40 am', 'C--4', 'Tongi', '01', '600TK'),
(11, 'vdb', '4242', '124244254', 'Dhaka-Chapai Nawab gang', '04:40 am', 'C--4', 'Tongi', '01', '600TK');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ticket`
--
ALTER TABLE `ticket`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
