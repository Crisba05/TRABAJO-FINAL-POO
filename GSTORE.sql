-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: gstore
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `asesores`
--

DROP TABLE IF EXISTS `asesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asesores` (
  `idAsesores` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` int NOT NULL,
  `contacto` int NOT NULL,
  `direccion` varchar(75) NOT NULL,
  `incidencias_cantidad` int DEFAULT NULL,
  PRIMARY KEY (`idAsesores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asesores`
--

LOCK TABLES `asesores` WRITE;
/*!40000 ALTER TABLE `asesores` DISABLE KEYS */;
/*!40000 ALTER TABLE `asesores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `idCategorias` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `cantidad` int DEFAULT NULL,
  PRIMARY KEY (`idCategorias`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'MOUSE',NULL),(2,'TECLADO',NULL),(3,'AUDIFONOS',NULL),(4,'MONITORES',NULL),(5,'TARJETA DE VIDEO',NULL),(6,'EQUIPOS DE SONIDO',NULL),(7,'LAPTOPS',NULL),(8,'OTROS',NULL);
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `incidencias`
--

DROP TABLE IF EXISTS `incidencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `incidencias` (
  `idIncidencias` int NOT NULL,
  `asesor_id` int NOT NULL,
  `razon` text NOT NULL,
  PRIMARY KEY (`idIncidencias`),
  KEY `fk_asesor_id_idx` (`asesor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `incidencias`
--

LOCK TABLES `incidencias` WRITE;
/*!40000 ALTER TABLE `incidencias` DISABLE KEYS */;
/*!40000 ALTER TABLE `incidencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingresos`
--

DROP TABLE IF EXISTS `ingresos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingresos` (
  `idIngresos` int NOT NULL AUTO_INCREMENT,
  `producto_id` int NOT NULL,
  `proovedor_id` int NOT NULL,
  `cantidad` int NOT NULL,
  `fechaIngreso` date NOT NULL,
  `monto` float DEFAULT NULL,
  PRIMARY KEY (`idIngresos`),
  KEY `fk_proovedor_id_idx` (`proovedor_id`),
  KEY `fk_producto_id_idx` (`producto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingresos`
--

LOCK TABLES `ingresos` WRITE;
/*!40000 ALTER TABLE `ingresos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ingresos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidos` (
  `idpedidos` int NOT NULL AUTO_INCREMENT,
  `id_producto` int NOT NULL,
  `cantidad` int NOT NULL,
  `monto` float NOT NULL,
  PRIMARY KEY (`idpedidos`),
  KEY `fk_producto_id_idx` (`id_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidos`
--

LOCK TABLES `pedidos` WRITE;
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `idproductos` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `precio` float NOT NULL,
  `stock` int NOT NULL,
  `oferta` varchar(5) DEFAULT NULL,
  `proovedor_id` int NOT NULL,
  `categoria_id` int NOT NULL,
  PRIMARY KEY (`idproductos`),
  KEY `fk_proovedor_id_idx` (`proovedor_id`),
  KEY `fk_categoria_id_idx` (`categoria_id`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'LOGITECH G502 HERO',150,20,NULL,1,1),(2,'MSI CLUTCH GM08',75,15,NULL,1,1),(3,'RAZER NAGA TRINITY',360,4,NULL,1,1),(4,'HYPER X PULSEFIRE FPS PRO RGB',174,10,NULL,1,1),(5,'REDRAGON M607 GRIFFIN RGB NEGRO',70,22,NULL,1,1),(11,'REDRAGON DEIMOS K599-KRS RGB',260,15,NULL,1,2),(12,'LOGITECH G213 PRODIGY RGB',200,6,NULL,1,2),(13,'RAZER CYNOSA CHROMA GAMING BLACK',181,7,NULL,1,2),(14,'CORSAIR STRAFE MK.2 RGB',627,3,NULL,1,2),(15,'MSI VIGOR GK20 RAINBOW',145,10,NULL,1,2),(21,'TEROS TE-8080 BLUETOOTH',27,5,NULL,1,3),(22,'RAZER NARI WIRELLESS BLACK CON MICROFONO',503,8,NULL,1,3),(23,'LOGITECH G935 CON MICROFONO',530,5,NULL,1,3),(24,'HYPER X CLOUD II BLACK RED CON MICROFONO',309,10,NULL,1,3),(25,'MSI DS501 GAMING CON MICROFONO',100,20,NULL,1,3),(26,'T-DAGGER CASPIAN T-RGH211 RGB CON MICROFONO',80,15,NULL,1,3),(31,'LG 24MK430H ',492,5,NULL,1,4),(32,'ASUS VZ279HE',754,5,NULL,1,4),(33,'SAMSUNG LC27R500FHXPE',630,5,NULL,1,4),(34,'MSI OPTIX MAG301RF',1451,3,NULL,1,4),(35,'XIAOMI 1C 238',479,5,NULL,1,4),(36,'TEROS TE-3196N',1100,5,NULL,1,4),(41,'ZOTAC GTX 1650 4GB GDDR6',1064,15,NULL,1,5),(42,'MSI RADEON RX 6600XT MECH 2X 8GB GDDR6',1315,15,NULL,1,5),(43,'GIGABYTE RTX 4080 16GB GDDR6X',6695,4,NULL,1,5),(44,'ASUS RTX 3050 8GB GDDR6',2167,3,NULL,1,5),(45,'EVGA RTX 3070 8GB GDDR6',4450,4,NULL,1,5),(51,'LG XBOOM CK43',549,6,NULL,1,6),(52,'MICRONICS S308 CONCORDE',70,15,NULL,1,6),(53,'LOGITECH G560 RGB LIGHTSYNC',979,5,NULL,1,6),(54,'REDRAGON GS560 ADIEMUS RGB ',320,10,NULL,1,6),(61,'ASUS VIVOBOOK S14 M433UA-EBO46T',3092,3,NULL,1,7),(62,'LENOVO IDEAPAD GAMING 3 GTX 1650',3140,3,NULL,1,7),(63,'HP 250 G8',3616,3,NULL,1,7),(71,'SSD 512 GB HP EX950 M.2',354,15,NULL,1,8),(72,'SSD 450 GB KINGSTON SSDNOW',143,15,NULL,1,8),(73,'RAM T-FORCE DELTA RGB WHITE 16GB DDR4 3200MHZ',253,4,NULL,1,8),(74,'RAM CORSAIR 16GB (2X8) DDR4 4000MHZ',677,3,NULL,1,8);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proovedores`
--

DROP TABLE IF EXISTS `proovedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proovedores` (
  `idproovedor` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `contacto` int NOT NULL,
  `correo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idproovedor`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proovedores`
--

LOCK TABLES `proovedores` WRITE;
/*!40000 ALTER TABLE `proovedores` DISABLE KEYS */;
INSERT INTO `proovedores` VALUES (1,'Jose','Castillo',912403566,'josecastillo@gmail.com');
/*!40000 ALTER TABLE `proovedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-13 18:19:35
