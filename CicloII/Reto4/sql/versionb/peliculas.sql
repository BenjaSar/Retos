CREATE TABLE IF NOT EXISTS `FantasiPlus`.`Pelicula` (
  `id_pelicula` INT NOT NULL,
  `p_titulo` VARCHAR(45) NOT NULL,
  `p_resumen` VARCHAR(4500) NULL,
  `p_anio` VARCHAR(20) NULL,
  `dir_id` INT NULL,
  `id_contenido` INT NULL,
  PRIMARY KEY (`id_pelicula`),
  INDEX `dir_id_idx` (`dir_id` ASC, `id_contenido` ASC) VISIBLE,
  INDEX `id_contenido_fk_idx` (`id_contenido` ASC) VISIBLE,
  CONSTRAINT `dir_id`
    FOREIGN KEY (`dir_id` , `id_contenido`)
    REFERENCES `FantasiPlus`.`Director` (`dir_id` , `dir_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_contenido_fk`
    FOREIGN KEY (`id_contenido`)
    REFERENCES `FantasiPlus`.`Contenido` (`id_contenido`));
    

