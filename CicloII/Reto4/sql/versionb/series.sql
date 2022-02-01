CREATE TABLE IF NOT EXISTS `Series` (
  `id_serie` INT NOT NULL AUTO_INCREMENT,
  `s_titulo` VARCHAR(45) NOT NULL,
  `s_nTemporada` INT NOT NULL,
  `s_nEpisodios` INT NOT NULL,
  `id_contenido` INT NOT NULL,
  PRIMARY KEY (`id_serie`),
  INDEX `id_contenido_fk_idx` (`id_contenido` ASC) VISIBLE,
  CONSTRAINT `id_contenido_fk`
    FOREIGN KEY (`id_contenido`)
    REFERENCES `FantasiPlus`.`Contenido` (`id_contenido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
