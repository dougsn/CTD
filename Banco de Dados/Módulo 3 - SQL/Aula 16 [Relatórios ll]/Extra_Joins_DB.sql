CREATE DATABASE  IF NOT EXISTS `extra_joins`;
USE `extra_joins`;
-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: extra_joins
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `artista`
--

DROP TABLE IF EXISTS `artista`;

CREATE TABLE `artista` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sobrenome` varchar(45) DEFAULT NULL,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

--
-- Dumping data for table `artista`
--

LOCK TABLES `artista` WRITE;
INSERT INTO `artista` VALUES (1,'FOX','MEGAN'),(2,'MACCHIO','RALPH'),(3,'GIBSON','TYRESE'),(4,'SMITH','WILL'),(5,'WILLIS','BRUCE'),(6,'DOWNEY JR','ROBERT'),(7,'ZABKA','WILLIAM'),(8,'DE NIRO','ROBERT');

UNLOCK TABLES;

--
-- Table structure for table `filmes`
--

DROP TABLE IF EXISTS `filmes`;

CREATE TABLE `filmes` (
  `id` int NOT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `ano` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

--
-- Dumping data for table `filmes`
--

LOCK TABLES `filmes` WRITE;

INSERT INTO `filmes` VALUES (1,'JURASSIC WORLD','2015'),(2,'BAD BOYS II','2003'),(3,'TRANSFORMERS','2007'),(4,'THE KARATE KID','1984'),(5,'THE SOCIAL NETWORK','2010'),(6,'TOY STORY 3','2010'),(7,'DRIVE ','2011'),(8,'INDEPENDENCE DAY','1996'),(9,'2012','2012'),(10,'INDEPENDENCE DAY: RESURGENSE','2016'),(11,'DIE HARD','1988');
UNLOCK TABLES;

--
-- Table structure for table `artista_filmes`
--

DROP TABLE IF EXISTS `artista_filmes`;

CREATE TABLE `artista_filmes` (
  `artista_id` int NOT NULL,
  `filme_id` int NOT NULL,
  PRIMARY KEY (`artista_id`,`filme_id`),
  KEY `fk_filme_has_artista_artista1_idx` (`artista_id`),
  KEY `fk_filme_has_artista_filme_idx` (`filme_id`),
  CONSTRAINT `fk_filme_has_artista_artista1` FOREIGN KEY (`artista_id`) REFERENCES `artista` (`id`),
  CONSTRAINT `fk_filme_has_artista_filme` FOREIGN KEY (`filme_id`) REFERENCES `filmes` (`id`)
) ;

--
-- Dumping data for table `artista_x_pelicula`
--

LOCK TABLES `artista_filmes` WRITE;

INSERT INTO `artista_filmes` VALUES (1,2),(1,3),(2,4),(3,3),(4,2),(4,8),(5,11),(7,4);

UNLOCK TABLES;





