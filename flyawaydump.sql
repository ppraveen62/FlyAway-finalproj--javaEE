-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: flyaway
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `EmailId` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin@flyaway.com','12345');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flightdto`
--

DROP TABLE IF EXISTS `flightdto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flightdto` (
  `flightno` int NOT NULL,
  `airline` varchar(255) DEFAULT NULL,
  `arrivaltime` varchar(255) DEFAULT NULL,
  `departuretime` varchar(255) DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `tripfare` double NOT NULL,
  PRIMARY KEY (`flightno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flightdto`
--

LOCK TABLES `flightdto` WRITE;
/*!40000 ALTER TABLE `flightdto` DISABLE KEYS */;
INSERT INTO `flightdto` VALUES (2354,'Deccan','23:57','19:34','Hyderabad','Vishakapatnam',4090),(2434,'Indigo','19:45','13:45','Mumbai','Surat',4000),(2445,'Indigo','05:00','02:45','Chennai','Kolkata',3000),(3098,'Indigo','15:45','13:26','Surat','Hyderabad',3400),(3425,'AirIndia','17:50','12:50','Chennai','Surat',3265),(4590,'TruJet','02:45','23:45','Bengaluru','Jaipur',4300),(5668,'Deccan','11:33','09:45','Pune','Vishakapatnam',3445),(5900,'Deccan','00:10','22:34','Pune','Jaipur',4900),(10287,'Indigo','00:10','21:00','Hyderabad','Mumbai',3800),(12080,'AirIndia','01:25','23:39','Bengaluru','Hyderabad',3000),(12085,'Indigo','00:35','22:22','Pune','Hyderabad',4500),(12090,'Indigo','13:26','10:11','Mumbai','Hyderabad',4010),(12093,'Indigo','14:26','12:29','Jaipur','Hyderabad',2590),(12567,'TruJet','15:59','13:45','Vishakapatnam','Mumbai',5300),(12870,'TruJet','00:30','21:28','Kolkata','Hyderabad',3400),(12960,'Indigo','04:45','02:34','Lucknow','Hyderabad',3900),(13090,'Deccan','03:45','12:25','Surat','Hyderabad',4100),(13908,'Deccan','15:37','12:30','Jaipur','Mumbai',5010),(14567,'Indigo','05:55','03:45','Bengaluru','Mumbai',3800),(21443,'Indigo','12:34','09:34','Vishakapatnam','Lucknow',2500),(22344,'AirIndia','00:45','22:00','Vishakapatnam','Bengaluru',4300),(23544,'AirIndia','08:56','05:55','Bengaluru','Surat',4090),(30190,'Deccan','08:20','05:50','Lucknow','Kolkata',3800),(32093,'AirIndia','23:50','21:45','Chennai','Hyderabad',4000),(32524,'AirIndia','04:55','23:55','Kolkata','Lucknow',4522),(32890,'Indigo','2:38','23:33','Kolkata','Jaipur',5000),(34221,'TruJet','11:45','09:35','Mumbai','Bengaluru',4500),(34455,'TruJet','14:25','12:34','Kolkata','Mumbai',6000),(34521,'AirIndia','08:45','05:55','Vishakapatnam','Hyderabad',3600),(35235,'Indigo','18:19','15:00','Lucknow','Surat',4000),(35464,'Indigo','23:59','20:56','Hyderabad','Pune',5000),(35542,'TruJet','14:43','10:33','Chennai','Vishakapatnam',4000),(35890,'AirIndia','06:00','04:35','Surat','Jaipur',3510),(37536,'Deccan','07:50','03:56','Kolkata','Surat',4300),(42314,'AirIndia','10:20','08:00','Hyderabad','Jaipur',4000),(43323,'AirIndia','5:54','03:55','Hyderabad','Kolkata',2344),(43555,'AirIndia','14:56','12:45','Lucknow','Surat',3000),(44763,'AirIndia','18:00','13:45','Kolkata','Vishakapatnam',4000),(45782,'TruJet','2:33','23:56','Mumbai','Jaipur',3900),(45902,'Deccan','17:56','13:54','Lucknow','Mumbai',3908),(53765,'Indigo','09:57','04:45','Kolkata','Pune',4000),(56780,'Deccan','12:35','09:35','Kolkata','Jaipur',3500),(56790,'TruJet','00:55','22:45','Hyderabad','Jaipur',3300),(56902,'Deccan','04:30','02:29','Chennai','Mumbai',5200),(57798,'AirIndia','15:59','12:34','Kolkata','Chennai',4003),(58468,'Deccan','03:33','23:30','Surat','Bengaluru',4000),(67335,'AirIndia','02:25','23:45','Surat','Mumbai',3500),(67856,'Deccan','14:55','12:55','Kolkata','Mumbai',4520),(84748,'Indigo','23:59','21:00','Surat','Lucknow',4500),(121435,'AirIndia','13:45','10:47','Surat','Pune',4000),(124904,'AirIndia','15:45','13:55','Pune','Mumbai',4500),(214345,'Indigo','07:59','04:00','Mumbai','Pune',3800),(235352,'Deccan','03:44','12:34','Hyderabad','Bengaluru',4321),(243254,'TruJet','08:45','05:55','Mumbai','Kolkata',3050),(365473,'AirIndia','12:00','09:45','Bengaluru','Chennai',4500),(368479,'TruJet','11:55','08:55','Lucknow','Chennai',3444),(385759,'AirIndia','07:30','04:49','Jaipur','Lucknow',4662),(434385,'TruJet','19:31','13:44','Pune','Vishakapatnam',4300),(450003,'Indigo','08:55','04:45','Hyderabad','Bengaluru',5009),(453798,'AirIndia','02:45','23:50','Vishakapatnam','Jaipur',4000),(457720,'TruJet','12:45','09:55','Vishakapatnam','Kolkata',5600),(547685,'Deccan','13:20','09:55','Kolkata','Chennai',4500),(563454,'Indigo','05:55','12:45','Jaipur','Chennai',3300),(567379,'TruJet','08:45','05:55','Vishakapatnam','Jaipur',4530),(568829,'TruJet','05:34','03:49','Mumbai','Bengaluru',3433),(585794,'Deccan','04:45','23:56','Mumbai','Chennai',3099),(645768,'TruJet','11:55','09:46','Jaipur','Surat',5000),(658479,'AirIndia','09:47','07:47','Jaipur','Lucknow',4500),(1324542,'Indigo','03:45','12:00','Hyderabad','Surat',4500),(2134352,'TruJet','12:34','08:45','Lucknow','Pune',3800),(2413245,'AirIndia','12:00','09:10','Surat','Kolkata',3300),(2445352,'Indigo','12:67','08:49','Jaipur','Pune',2345),(3048750,'Deccan','08:45','05:33','Chennai','Lucknow',3400),(3255452,'TruJet','12:59','08:59','Vishakapatnam','Surat',4100),(3256143,'Deccan','19:35','15:54','Chennai','Pune',3455),(3473928,'TruJet','03:20','23:44','Vishakapatnam','Bengaluru',2424),(3534545,'TruJet','09:34','05:55','Surat','Chennai',4500),(4674587,'TruJet','23:00','19:45','Vishakapatnam','Pune',4000),(5032874,'Deccan','11:33','08:36','Hyderabad','Chennai',4500),(5327749,'Deccan','03:56','23:45','Surat','Vishakapatnam',4500),(5357463,'TruJet','14:44','09:45','Kolkata','Chennai',5000),(5376438,'Indigo','10:45','07:45','Vishakapatnam','Chennai',4900),(6438437,'AirIndia','03:43','23:44','Mumbai','Vishakapatnam',4000),(6563837,'TruJet','13:01','09:55','Jaipur','Vishakapatnam',4300),(6863827,'AirIndia','02:30','23:45','Bengaluru','Kolkata',5700),(7567958,'Deccan','15:45','12:29','Kolkata','Pune',2368),(23685732,'Indigo','17:45','12:34','Bengaluru','Vishakapatnam',5001),(34253587,'TruJet','03:44','23:48','Bengaluru','Lucknow',5000),(34494749,'Deccan','05:55','03:45','Mumbai','Lucknow',3000),(67457549,'Indigo','04:45','23:55','Hyderabad','Lucknow',5000);
/*!40000 ALTER TABLE `flightdto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sordes`
--

DROP TABLE IF EXISTS `sordes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sordes` (
  `Source` varchar(50) DEFAULT NULL,
  `Destination` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sordes`
--

LOCK TABLES `sordes` WRITE;
/*!40000 ALTER TABLE `sordes` DISABLE KEYS */;
INSERT INTO `sordes` VALUES ('vishakapatnam','hyderabad'),('hyderabad','vishakapatnam');
/*!40000 ALTER TABLE `sordes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-30 19:20:33
