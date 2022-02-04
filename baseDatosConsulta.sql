-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: nueva_tabla_consulta
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` bigint NOT NULL,
  `razon_social` varchar(200) DEFAULT NULL,
  `cuit` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'tornilo','12345668'),(2,'verde','976543'),(3,'amarillo','34647'),(4,'pantalla','123865'),(5,'algo','768342'),(6,'masdatos','546831'),(7,'excelente','7658562'),(8,'sonido','908653'),(9,'green','156865'),(10,'kilo','3453738');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `codigo` varchar(25) NOT NULL,
  `nombre` varchar(250) DEFAULT NULL,
  `fecha_creacion` date DEFAULT NULL,
  `id_rubro` bigint DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `id_rubro_idx` (`id_rubro`),
  CONSTRAINT `id_rubro` FOREIGN KEY (`id_rubro`) REFERENCES `rubro` (`id_rubro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES ('1','macca','2017-06-15',2),('10','fdlgelarg','2001-06-15',12),('100','fdlgelarg','2001-06-15',12),('101','macca','2017-06-15',2),('102','algomas','2017-07-15',5),('103','cenas','2021-06-15',3),('104','fernas','2020-10-15',6),('105','kakakak','2014-06-20',8),('106','gagagagaga','2017-12-15',9),('107','ejbdsfvbhjavdbk','2001-10-15',7),('108','fghndjav','2017-04-15',5),('109','fjnvakds','2017-06-15',9),('11','macca','2017-06-15',2),('110','fdlgelarg','2001-06-15',12),('111','macca','2013-01-15',12),('112','algomas','2017-07-15',15),('113','cenas','2021-06-15',13),('114','fernas','2020-10-15',16),('115','kakakak','2014-06-20',8),('116','gagagagaga','2017-12-15',19),('117','ejbdsfvbhjavdbk','2001-10-15',15),('118','fghndjav','2017-04-15',5),('119','fjnvakds','2017-06-15',19),('12','algomas','2017-07-15',5),('120','fdlgelarg','2001-06-15',1),('121','libreria','2022-02-03',5),('122','libreria','2022-02-03',5),('123','algo','2022-02-03',21),('124','algomas','2022-02-03',21),('125','gfjtyjwj','2019-02-03',21),('13','cenas','2021-06-15',3),('14','fernas','2020-10-15',6),('15','kakakak','2014-06-20',8),('16','gagagagaga','2017-12-15',9),('17','ejbdsfvbhjavdbk','2001-10-15',7),('18','fghndjav','2017-04-15',5),('19','fjnvakds','2017-06-15',9),('2','algomas','2017-07-15',5),('20','fdlgelarg','2001-06-15',12),('21','macca','2013-01-15',12),('22','algomas','2017-07-15',15),('23','cenas','2021-06-15',13),('24','fernas','2020-10-15',16),('25','kakakak','2014-06-20',8),('26','gagagagaga','2017-12-15',19),('27','ejbdsfvbhjavdbk','2001-10-15',15),('28','fghndjav','2017-04-15',5),('29','fjnvakds','2017-06-15',19),('3','cenas','2021-06-15',3),('30','fdlgelarg','2001-06-15',12),('31','macca','2017-06-15',12),('32','algomas','2017-07-15',15),('33','cenas','2021-06-15',13),('34','fernas','2020-10-15',16),('35','kakakak','2014-06-20',8),('36','gagagagaga','2017-12-15',19),('37','ejbdsfvbhjavdbk','2001-10-15',17),('38','fghndjav','2017-04-15',5),('39','fjnvakds','2017-06-15',19),('4','fernas','2020-10-15',6),('40','fdlgelarg','2001-06-15',12),('5','kakakak','2014-06-20',8),('6','gagagagaga','2017-12-15',9),('7','ejbdsfvbhjavdbk','2001-10-15',7),('71','macca','2017-06-15',2),('72','algomas','2017-07-15',5),('73','cenas','2021-06-15',3),('74','fernas','2020-10-15',6),('75','kakakak','2014-06-20',8),('76','gagagagaga','2017-12-15',9),('77','ejbdsfvbhjavdbk','2001-10-15',7),('78','fghndjav','2017-04-15',5),('79','fjnvakds','2017-06-15',9),('8','fghndjav','2017-04-15',5),('80','fdlgelarg','2001-06-15',12),('81','macca','2013-01-15',12),('82','algomas','2017-07-15',15),('83','cenas','2021-06-15',13),('84','fernas','2020-10-15',16),('85','kakakak','2014-06-20',8),('86','gagagagaga','2017-12-15',19),('87','ejbdsfvbhjavdbk','2001-10-15',15),('88','fghndjav','2017-04-15',5),('89','fjnvakds','2017-06-15',19),('9','fjnvakds','2017-06-15',9),('90','fdlgelarg','2001-06-15',12),('91','macca','2017-06-15',12),('92','algomas','2017-07-15',15),('93','cenas','2021-06-15',13),('94','fernas','2020-10-15',16),('95','kakakak','2014-06-20',8),('96','gagagagaga','2017-12-15',19),('97','ejbdsfvbhjavdbk','2001-10-15',17),('98','fghndjav','2017-04-15',5),('99','fjnvakds','2017-06-15',19);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rubro`
--

DROP TABLE IF EXISTS `rubro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rubro` (
  `id_rubro` bigint NOT NULL,
  `rubro` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_rubro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rubro`
--

LOCK TABLES `rubro` WRITE;
/*!40000 ALTER TABLE `rubro` DISABLE KEYS */;
INSERT INTO `rubro` VALUES (1,'bazar'),(2,'madera'),(3,'arte'),(4,'sillas'),(5,'mesas'),(6,'algodon'),(7,'botones'),(8,'plasticos'),(9,'sales'),(10,'pinias'),(11,'bannas'),(12,'medias'),(13,'rosas'),(14,'pc'),(15,'enchufes'),(16,'plantas'),(17,'medias azules'),(18,'cel'),(19,'sandalias'),(20,'karpas'),(21,'libreria');
/*!40000 ALTER TABLE `rubro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `id_venta` bigint NOT NULL,
  `codigo_producto` varchar(25) DEFAULT NULL,
  `nombre` varchar(250) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `cantidad` bigint DEFAULT NULL,
  `precio` decimal(22,8) DEFAULT NULL,
  `id_cliente` bigint NOT NULL,
  PRIMARY KEY (`id_venta`),
  UNIQUE KEY `id_cliente_UNIQUE` (`id_cliente`),
  KEY `codigo_producto_idx` (`codigo_producto`),
  CONSTRAINT `codigo_producto` FOREIGN KEY (`codigo_producto`) REFERENCES `producto` (`codigo`),
  CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,'120','jasmin','2013-01-15',5,12.00000000,1),(2,'11','has','2014-03-15',7,234.00000000,7),(3,'13','jyt','2012-01-15',8,90.00000000,3),(4,'22','has','2014-03-15',17,234.00000000,6),(5,'13','jyt','2012-01-15',28,90.00000000,8),(8,'22','has','2022-02-15',17,234.00000000,9),(9,'38','has','2014-03-15',27,234.00000000,2);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'nueva_tabla_consulta'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-03 19:17:10
