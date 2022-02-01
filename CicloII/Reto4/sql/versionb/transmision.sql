CREATE TABLE IF NOT EXISTS `Transmision` (
  `t_date` DATE NOT NULL,
  `t_hora` VARCHAR(45) NOT NULL,
  `id_pelicula` INT NOT NULL,
  `u_alias` VARCHAR(45) NOT NULL,
  `id_contenido` INT NOT NULL,
  INDEX `fk_u_alias_idx` (`u_alias` ASC) VISIBLE,
  PRIMARY KEY (`id_pelicula`),
  INDEX `id_contenido_fk_idx` (`id_contenido` ASC) VISIBLE,
  CONSTRAINT `u_alias_fk`
    FOREIGN KEY (`u_alias`)
    REFERENCES `FantasiPlus`.`Usuarios` (`u_alias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_contenido_fk`
    FOREIGN KEY (`id_contenido`)
    REFERENCES `FantasiPlus`.`Contenido` (`id_contenido`)
   ); 
