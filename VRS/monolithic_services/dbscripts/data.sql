-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: vehicle_rs
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking` (
  `bk_id` int(11) NOT NULL AUTO_INCREMENT,
  `bk_us_id` int(11) NOT NULL,
  `bk_vh_id` int(11) NOT NULL,
  `bk_booking_start` date NOT NULL,
  `bk_booking_end` date NOT NULL,
  `bk_price` float DEFAULT NULL,
  PRIMARY KEY (`bk_id`),
  KEY `user_booking_idx` (`bk_us_id`),
  KEY `vehicle_booking_idx` (`bk_vh_id`),
  CONSTRAINT `user_booking` FOREIGN KEY (`bk_us_id`) REFERENCES `user` (`us_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehicle_booking` FOREIGN KEY (`bk_vh_id`) REFERENCES `vehicle` (`vh_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (22,1,1,'2019-11-19','2020-02-14',26100);
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `ro_id` int(11) NOT NULL,
  `ro_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'USER'),(2,'ADMIN');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `us_id` int(11) NOT NULL AUTO_INCREMENT,
  `us_emp_id` varchar(20) NOT NULL,
  `us_first_name` varchar(50) NOT NULL,
  `us_last_name` varchar(50) NOT NULL,
  `us_age` int(2) NOT NULL,
  `us_gender` varchar(6) NOT NULL,
  `us_contact` bigint(10) NOT NULL,
  `us_email` varchar(50) NOT NULL,
  `us_password` varchar(100) NOT NULL,
  `us_branch` varchar(5) NOT NULL,
  `us_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`us_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'user1','Nikunj','Garg',23,'Male',9997061413,'nikunj.garg96@gmail.com','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','lkjh','A'),(2,'admin1','vehicle','RS',12,'Female',9876543211,'jhbfg@sdjkhgb.com','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','dkjf','A'),(3,'nik','kjh','kjh',32,'Male',7894561231,'fsd@sdf.com','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','sd','A'),(4,'pra','praveen','pea',18,'Male',9876543210,'fsd@sdf.com','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','sd','A'),(5,'nikunj','nik','nik',21,'Male',3333333333,'hcv','$2a$10$pGrBk5UeBUILjj1rj0ULKeLFycbCN09TbTrOruNOUyL6bfN72DOO6','123','P'),(6,'pavan','pavan','Swaroo[p',22,'Male',9790650572,'ticktockstarPavan@hello.me','$2a$10$O8q0Ip1MqA6nMutx41b1YudOGf2Jy9Ctf.4V/.ONsmqTAHAqTVfKC','amma','P'),(8,'user5','Sankalp','Khawade',22,'Male',9898989898,'asd@a1.com','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','GCH','A');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `ur_id` int(11) NOT NULL AUTO_INCREMENT,
  `ur_us_id` int(11) DEFAULT NULL,
  `ur_ro_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`ur_id`),
  KEY `fk_user_role_user_idx` (`ur_us_id`),
  KEY `fk_user_role_role1_idx` (`ur_ro_id`),
  CONSTRAINT `fk_user_role_role1` FOREIGN KEY (`ur_ro_id`) REFERENCES `role` (`ro_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_role_user` FOREIGN KEY (`ur_us_id`) REFERENCES `user` (`us_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,1,1),(2,2,2),(3,3,1),(4,4,1),(5,5,1),(6,6,1),(8,8,1);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicle` (
  `vh_id` int(11) NOT NULL AUTO_INCREMENT,
  `vh_name` varchar(45) NOT NULL,
  `vh_image` varchar(300) NOT NULL,
  `vh_vehicle_no` varchar(10) NOT NULL,
  `vh_seater` varchar(10) NOT NULL,
  `vh_type` varchar(15) NOT NULL,
  `vh_price` double NOT NULL,
  `vh_active` tinyint(1) NOT NULL,
  `vh_branch` varchar(5) NOT NULL,
  `vh_insurance_exp_date` date NOT NULL,
  `vh_last_service_date` date NOT NULL,
  `vh_service_due_date` date NOT NULL,
  `vh_status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`vh_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (1,'BMW','https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSS5UOwpel9-KWEnz9gtCJAhHXL1dYMGIXIxlWOe3cJ7ric--Xf','UK06AG1111','4','Petrol',300,1,'poiuy','2020-03-15','2017-03-10','2017-09-15',1),(2,'Ferrari F430','https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRXqMAdxbOBm0C81Ay2J5HVLU71-d95xC6wOaCDKOufy5uqCnsu','MH14SY0007','4','Gas',150,1,'Zolo','2020-03-25','2017-02-15','2017-03-24',0),(3,'Aston Martin','https://images.unsplash.com/photo-1556213313-fc5be959c4a9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=701&q=80','UK06AG1111','2','Petrol',300,0,'poiuy','2017-03-15','2017-03-10','2017-09-15',0),(4,'Tesla Model S','https://images.unsplash.com/photo-1491497875599-6c21f33c7e19?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=661&q=80','UK06AG1111','4','Electric',300,0,'poiuy','2020-03-15','2017-03-10','2017-09-15',0),(9,'Porsche 911','https://images.unsplash.com/photo-1500509178313-4eaf2867f500?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80','NG06S0608','2','Petrol',169,1,'Amma','2021-11-09','2019-11-28','2019-11-29',0),(10,'Audi R8','https://images.unsplash.com/photo-1556391362-d3d11d98e510?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=700&q=80','PS98G0904','2','Gas',650,1,'Baboi','2023-01-01','2019-11-27','2019-11-29',0),(11,'SUV','https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRUgiuqw9xGbAdq7QsBAh8SCZcDBhcjD-WDsNwqYVo30H2P9Yri','SS69K4200','4','Petrol',1,1,'Bang','2019-12-07','2015-11-28','2016-11-28',0),(23,'Land Rover','https://images.unsplash.com/photo-1539703061-473d7576d772?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1351&q=80','SS55SS5555','6','Diesel',60,1,'Paris','2019-12-20','2019-11-07','2019-12-18',0),(24,'Jeep','https://images.unsplash.com/photo-1511527844068-006b95d162c2?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80','WS99FU4862','6','Petrol',112,0,'CAL','2019-12-12','2019-11-14','2019-11-28',0);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-29 20:07:37
