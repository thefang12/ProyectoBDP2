-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2016 at 09:34 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `punto_de_venta`
--

-- --------------------------------------------------------

--
-- Table structure for table `articulo`
--

CREATE TABLE IF NOT EXISTS `articulo` (
  `articulo_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_articulo` varchar(45) NOT NULL,
  `precio` float NOT NULL,
  `categoria_id` int(11) NOT NULL,
  PRIMARY KEY (`articulo_id`,`categoria_id`),
  UNIQUE KEY `articulo_id_UNIQUE` (`articulo_id`),
  KEY `fk_articulo_categoria1_idx` (`categoria_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `articulo`
--

INSERT INTO `articulo` (`articulo_id`, `nombre_articulo`, `precio`, `categoria_id`) VALUES
(1, 'Glaceada', 10.25, 1),
(2, 'Fresa', 11.23, 1),
(3, 'Rellena de Chocolate', 17.5, 1),
(4, 'Caramel Mocha', 40.51, 2),
(5, 'Vanilla Latte Congelado', 37.8, 2),
(6, 'Mocha Latte', 38.45, 2),
(7, 'Cappuccino', 35, 2),
(8, 'Vanilla Latte', 36, 2),
(9, 'Skinny Latte', 34.2, 2),
(10, 'Onion', 23, 3),
(11, 'Blueberry', 27.35, 3),
(12, 'Cinnamon', 24, 3),
(15, 'Caramel', 50, 2),
(19, 'Caramel Machiato', 50, 2);

-- --------------------------------------------------------

--
-- Table structure for table `articulo_audit`
--

CREATE TABLE IF NOT EXISTS `articulo_audit` (
  `articulo_id` int(11) NOT NULL,
  `nombre_articulo` varchar(45) NOT NULL,
  `precio` float NOT NULL,
  `categoria_id` int(11) NOT NULL,
  `fecha_borrado` date NOT NULL,
  PRIMARY KEY (`articulo_id`),
  UNIQUE KEY `articulo_id_UNIQUE` (`articulo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `categoria_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`categoria_id`),
  UNIQUE KEY `categoria_id_UNIQUE` (`categoria_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`categoria_id`, `nombre`) VALUES
(1, 'Dona'),
(2, 'Cafe'),
(3, 'Bagel');

-- --------------------------------------------------------

--
-- Table structure for table `categoria_audit`
--

CREATE TABLE IF NOT EXISTS `categoria_audit` (
  `categoria_id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fecha_borrado` date NOT NULL,
  PRIMARY KEY (`categoria_id`),
  UNIQUE KEY `categoria_id_UNIQUE` (`categoria_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `compra`
--

CREATE TABLE IF NOT EXISTS `compra` (
  `compra_id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_compra` datetime NOT NULL,
  `staff_id` int(11) NOT NULL,
  PRIMARY KEY (`compra_id`),
  UNIQUE KEY `compra_id_UNIQUE` (`compra_id`),
  KEY `fk_compra_staff1_idx` (`staff_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `compra`
--

INSERT INTO `compra` (`compra_id`, `fecha_compra`, `staff_id`) VALUES
(1, '2016-04-07 00:00:00', 9),
(2, '2016-04-07 00:00:00', 10),
(4, '2016-04-08 00:00:00', 10),
(5, '2016-04-08 00:00:00', 10),
(6, '2016-04-05 00:00:00', 8),
(7, '2016-04-07 00:00:00', 10),
(8, '2016-04-04 00:00:00', 11),
(9, '2016-04-06 00:00:00', 12),
(10, '2016-04-07 00:00:00', 14);

-- --------------------------------------------------------

--
-- Table structure for table `detalle_compra`
--

CREATE TABLE IF NOT EXISTS `detalle_compra` (
  `detalle_compra_id` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) NOT NULL,
  `compra_id` int(11) NOT NULL,
  `inventario_id` int(11) NOT NULL,
  PRIMARY KEY (`detalle_compra_id`,`compra_id`,`inventario_id`),
  UNIQUE KEY `detalle_compra_id_UNIQUE` (`detalle_compra_id`),
  KEY `fk_detalle_compra_compra1_idx` (`compra_id`),
  KEY `fk_detalle_compra_inventario1_idx` (`inventario_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `detalle_compra`
--

INSERT INTO `detalle_compra` (`detalle_compra_id`, `cantidad`, `compra_id`, `inventario_id`) VALUES
(1, 3, 1, 6),
(2, 1, 1, 1),
(3, 2, 2, 6),
(4, 2, 2, 2),
(5, 1, 4, 11),
(6, 1, 4, 7),
(7, 1, 5, 7),
(8, 1, 10, 10),
(9, 5, 7, 10),
(10, 3, 8, 15),
(11, 2, 8, 19),
(12, 1, 8, 20),
(13, 1, 9, 23);

-- --------------------------------------------------------

--
-- Table structure for table `direccion`
--

CREATE TABLE IF NOT EXISTS `direccion` (
  `direccion_id` int(11) NOT NULL AUTO_INCREMENT,
  `direccion` varchar(45) NOT NULL,
  `direccion2` varchar(45) DEFAULT NULL,
  `colonia` varchar(45) NOT NULL,
  `cp` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`direccion_id`),
  UNIQUE KEY `direccion_id_UNIQUE` (`direccion_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `direccion`
--

INSERT INTO `direccion` (`direccion_id`, `direccion`, `direccion2`, `colonia`, `cp`, `telefono`) VALUES
(1, 'Av. Vasco de Quiroga 3880', NULL, 'Lomas de Santa Fe', '05300', '01-800-008-0088'),
(2, 'Av Teopanzolco 223', NULL, 'Vista Hermosa', '62290', '+52 777 318 7141');

-- --------------------------------------------------------

--
-- Table structure for table `inventario`
--

CREATE TABLE IF NOT EXISTS `inventario` (
  `inventario_id` int(11) NOT NULL AUTO_INCREMENT,
  `articulo_id` int(11) NOT NULL,
  `sucursal_id` int(11) NOT NULL,
  `cantidad_disponible` int(11) NOT NULL,
  PRIMARY KEY (`inventario_id`,`sucursal_id`),
  UNIQUE KEY `inventario_id_UNIQUE` (`inventario_id`),
  KEY `fk_inventario_articulo1_idx` (`articulo_id`),
  KEY `fk_inventario_sucursal1_idx` (`sucursal_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=25 ;

--
-- Dumping data for table `inventario`
--

INSERT INTO `inventario` (`inventario_id`, `articulo_id`, `sucursal_id`, `cantidad_disponible`) VALUES
(1, 1, 1, 15),
(2, 2, 1, 7),
(3, 3, 1, 6),
(4, 4, 1, 5),
(5, 5, 1, 3),
(6, 6, 1, 20),
(7, 7, 1, 8),
(8, 8, 1, 7),
(9, 9, 1, 5),
(10, 10, 1, 5),
(11, 11, 1, 7),
(12, 12, 1, 7),
(13, 1, 2, 1),
(14, 2, 2, 1),
(15, 3, 2, 5),
(16, 4, 2, 0),
(17, 5, 2, 0),
(18, 6, 2, 2),
(19, 7, 2, 5),
(20, 8, 2, 5),
(21, 9, 2, 0),
(22, 10, 2, 0),
(23, 11, 2, 2),
(24, 12, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `pago`
--

CREATE TABLE IF NOT EXISTS `pago` (
  `pago_id` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` double NOT NULL,
  `fecha_pago` datetime NOT NULL,
  `compra_id` int(11) NOT NULL,
  PRIMARY KEY (`pago_id`),
  UNIQUE KEY `pago_id_UNIQUE` (`pago_id`),
  KEY `fk_pago_compra1_idx` (`compra_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE IF NOT EXISTS `staff` (
  `staff_id` int(11) NOT NULL AUTO_INCREMENT,
  `contrasenia` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `sucursal_id` int(11) NOT NULL,
  `puesto` varchar(45) NOT NULL,
  PRIMARY KEY (`staff_id`),
  UNIQUE KEY `staff_id_UNIQUE` (`staff_id`),
  KEY `fk_staff_sucursal1_idx` (`sucursal_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staff_id`, `contrasenia`, `nombre`, `apellido`, `activo`, `sucursal_id`, `puesto`) VALUES
(1, 'wut', 'Pablo', 'Tabales', 1, 1, 'Gerente'),
(8, 'h', 'Javier', 'Salgado', 1, 1, 'Gerente'),
(9, 'ho', 'Rodrigo', 'Gutiérrez', 1, 1, 'Empleado'),
(10, 'hola', 'Jazmín', 'Rojas', 1, 1, 'Empleado'),
(11, 'hola!', 'Berenice', 'Sánchez', 1, 2, 'Gerente'),
(12, 'hola!!', 'Manuel', 'Rivas', 1, 2, 'Empleado'),
(13, 'hola!!!', 'Rafael', 'Vásquez', 0, 2, 'Empleado'),
(14, 'hola!!!!', 'Gabriela', 'Quiroz', 1, 1, 'Empleado'),
(15, 'wut', 'Pablo', 'Tabales', 1, 1, 'Gerente'),
(16, 'troll', 'arturo', 'alonso', 1, 2, 'Empleado'),
(18, 'r', 'r', 'r', 1, 1, 'empleado'),
(19, 't', 't', 't', 1, 1, 'empleado'),
(20, 't', 'pablo', 'tabales', 1, 2, 'Gerente'),
(21, 'qw', 'qw', 'qw', 1, 2, 'Gerente');

-- --------------------------------------------------------

--
-- Table structure for table `staff_audit`
--

CREATE TABLE IF NOT EXISTS `staff_audit` (
  `staff_id` int(11) NOT NULL,
  `contrasenia` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `activo` tinyint(1) NOT NULL,
  `puesto` varchar(45) NOT NULL,
  `sucursal_id` int(11) NOT NULL,
  `fecha_borrado` date NOT NULL,
  PRIMARY KEY (`staff_id`),
  UNIQUE KEY `staff_id_UNIQUE` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `sucursal`
--

CREATE TABLE IF NOT EXISTS `sucursal` (
  `sucursal_id` int(11) NOT NULL AUTO_INCREMENT,
  `direccion_id` int(11) NOT NULL,
  PRIMARY KEY (`sucursal_id`),
  UNIQUE KEY `sucursal_id_UNIQUE` (`sucursal_id`),
  KEY `fk_sucursal_direccion1_idx` (`direccion_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `sucursal`
--

INSERT INTO `sucursal` (`sucursal_id`, `direccion_id`) VALUES
(1, 1),
(2, 2);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `articulo`
--
ALTER TABLE `articulo`
  ADD CONSTRAINT `fk_articulo_categoria1` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`categoria_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `fk_compra_staff1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD CONSTRAINT `fk_detalle_compra_compra1` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`compra_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_detalle_compra_inventario1` FOREIGN KEY (`inventario_id`) REFERENCES `inventario` (`inventario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `inventario`
--
ALTER TABLE `inventario`
  ADD CONSTRAINT `fk_inventario_articulo1` FOREIGN KEY (`articulo_id`) REFERENCES `articulo` (`articulo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_inventario_sucursal1` FOREIGN KEY (`sucursal_id`) REFERENCES `sucursal` (`sucursal_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `fk_pago_compra1` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`compra_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `staff`
--
ALTER TABLE `staff`
  ADD CONSTRAINT `fk_staff_sucursal1` FOREIGN KEY (`sucursal_id`) REFERENCES `sucursal` (`sucursal_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `sucursal`
--
ALTER TABLE `sucursal`
  ADD CONSTRAINT `fk_sucursal_direccion1` FOREIGN KEY (`direccion_id`) REFERENCES `direccion` (`direccion_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
