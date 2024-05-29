DROP TABLE IF EXISTS producto;

CREATE TABLE `inventario`.`producto` (
  `cod` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `stock` INT NULL,
  `precio` DECIMAL(2) NULL,
  PRIMARY KEY (`cod`));
