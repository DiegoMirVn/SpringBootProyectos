

DROP TABLE IF EXISTS pedido;

CREATE TABLE `lineapedidos`.`pedido` (
  `numeroPedido` INT NOT NULL,
  `direccion` VARCHAR(45) NULL,
  `listaProductos` VARCHAR(255) NULL,
  PRIMARY KEY (`numeroPedido`));