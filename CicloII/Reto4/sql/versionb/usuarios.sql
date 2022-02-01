CREATE TABLE IF NOT EXISTS `FantasiPlus`.`Usuarios` (
  `u_alias` VARCHAR(45) NOT NULL,
  `u_nombre` VARCHAR(45) NOT NULL,
  `u_apellido` VARCHAR(45) NOT NULL,
  `u_email` VARCHAR(45) NOT NULL,
  `u_celular` BIGINT(10) NULL,
  `u_contraseña` VARCHAR(45) NOT NULL,
  `u_fechaNacimiento` DATE NOT NULL,
  PRIMARY KEY (`u_alias`));
