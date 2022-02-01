CREATE TABLE IF NOT EXISTS `Director` (
  `dir_id` INT NOT NULL AUTO_INCREMENT,
  `dir_nombre` VARCHAR(45) NOT NULL,
  `dir_apellido` VARCHAR(45) NOT NULL,
  `dir_nacionalidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`dir_id`))
ENGINE = InnoDB;
