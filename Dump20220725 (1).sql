-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: controle_da_missao
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `foguete`
--

DROP TABLE IF EXISTS `foguete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `foguete` (
  `idFoguete` int NOT NULL AUTO_INCREMENT,
  `nomeFoguete` varchar(45) NOT NULL,
  `inicioConstrucao` varchar(30) DEFAULT NULL,
  `terminoConstrucao` varchar(30) DEFAULT NULL,
  `missaoFoguete` varchar(80) NOT NULL,
  PRIMARY KEY (`idFoguete`),
  UNIQUE KEY `nomeFoguete_UNIQUE` (`nomeFoguete`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foguete`
--

LOCK TABLES `foguete` WRITE;
/*!40000 ALTER TABLE `foguete` DISABLE KEYS */;
INSERT INTO `foguete` VALUES (1,'alphamaxnova','01/01/2017','26/06/2019','verificar o estado do programa'),(2,'TeslaX','25/05/1959','21/06/1961','Chegar a lua'),(3,'TeslaMax','07/04/2001','04/03/2014','');
/*!40000 ALTER TABLE `foguete` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lancamento`
--

DROP TABLE IF EXISTS `lancamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lancamento` (
  `idLancamento` int NOT NULL AUTO_INCREMENT,
  `nomeFoguete` varchar(45) NOT NULL,
  `missaoTripulada` enum('sim','nao') NOT NULL,
  `tripulantes` varchar(60) DEFAULT NULL,
  `dataLancamento` varchar(30) NOT NULL,
  PRIMARY KEY (`idLancamento`),
  UNIQUE KEY `nomeFoguete_UNIQUE` (`nomeFoguete`),
  CONSTRAINT `nomeFoguete` FOREIGN KEY (`nomeFoguete`) REFERENCES `foguete` (`nomeFoguete`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lancamento`
--

LOCK TABLES `lancamento` WRITE;
/*!40000 ALTER TABLE `lancamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `lancamento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-25 12:39:47
