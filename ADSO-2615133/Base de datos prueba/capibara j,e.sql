-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Drogueria DB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Drogueria DB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Drogueria DB` DEFAULT CHARACTER SET utf8 ;
USE `Drogueria DB` ;

-- -----------------------------------------------------
-- Table `Drogueria DB`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drogueria DB`.`Persona` (
  `Id_persona` INT NOT NULL,
  `identificacion` VARCHAR(45) NOT NULL,
  `Nombres` VARCHAR(450) NOT NULL,
  `direccion` VARCHAR(250) NULL,
  `codigo_postal` VARCHAR(15) NULL,
  `correo` VARCHAR(250) NULL,
  UNIQUE INDEX `identificacion_UNIQUE` (`identificacion` ASC) VISIBLE,
  PRIMARY KEY (`Id_persona`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drogueria DB`.`Compania`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drogueria DB`.`Compania` (
  `id_compania` SMALLINT NOT NULL,
  `nit` VARCHAR(45) NOT NULL,
  `compania` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_compania`),
  UNIQUE INDEX `nit_UNIQUE` (`nit` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drogueria DB`.`Termino`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drogueria DB`.`Termino` (
  `id_termino` TINYINT NOT NULL,
  `Termino` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_termino`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drogueria DB`.`Factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drogueria DB`.`Factura` (
  `id_factura` INT NOT NULL AUTO_INCREMENT,
  `Id_Persona` INT NOT NULL,
  `id_compania` SMALLINT NULL,
  `id_termino` TINYINT NOT NULL,
  `Fecha` DATE NOT NULL,
  `hora` TIME NOT NULL,
  PRIMARY KEY (`id_factura`),
  INDEX `fk_Factura_Compania_idx` (`id_compania` ASC) VISIBLE,
  INDEX `fk_Factura_Persona1_idx` (`Id_Persona` ASC) VISIBLE,
  INDEX `fk_Factura_Termino1_idx` (`id_termino` ASC) VISIBLE,
  CONSTRAINT `fk_Factura_Compania`
    FOREIGN KEY (`id_compania`)
    REFERENCES `Drogueria DB`.`Compania` (`id_compania`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Factura_Persona1`
    FOREIGN KEY (`Id_Persona`)
    REFERENCES `Drogueria DB`.`Persona` (`Id_persona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Factura_Termino1`
    FOREIGN KEY (`id_termino`)
    REFERENCES `Drogueria DB`.`Termino` (`id_termino`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drogueria DB`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drogueria DB`.`Categoria` (
  `id_Categoria` SMALLINT NOT NULL,
  `Categoria` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id_Categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drogueria DB`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drogueria DB`.`Producto` (
  `id_producto` INT NOT NULL,
  `Productocol` VARCHAR(45) NULL,
  `id_Categoria` SMALLINT NOT NULL,
  `producto` VARCHAR(150) NOT NULL,
  `existencia` INT NOT NULL DEFAULT 0,
  `valor_unitario_Venta` FLOAT NOT NULL,
  `valor_unitario_compra` FLOAT NOT NULL,
  PRIMARY KEY (`id_producto`),
  INDEX `fk_Producto_Categoria1_idx` (`id_Categoria` ASC) VISIBLE,
  CONSTRAINT `fk_Producto_Categoria1`
    FOREIGN KEY (`id_Categoria`)
    REFERENCES `Drogueria DB`.`Categoria` (`id_Categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drogueria DB`.`factura_producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drogueria DB`.`factura_producto` (
  `Producto_id_producto` INT NOT NULL,
  `id_factura` BIGINT NOT NULL,
  `valor_unitario` FLOAT NOT NULL,
  `cantidad` SMALLINT NOT NULL DEFAULT 1,
  PRIMARY KEY (`Producto_id_producto`, `id_factura`),
  INDEX `fk_Producto_has_Factura_Factura1_idx` (`id_factura` ASC) VISIBLE,
  INDEX `fk_Producto_has_Factura_Producto1_idx` (`Producto_id_producto` ASC) VISIBLE,
  CONSTRAINT `fk_Producto_has_Factura_Producto1`
    FOREIGN KEY (`Producto_id_producto`)
    REFERENCES `Drogueria DB`.`Producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_has_Factura_Factura1`
    FOREIGN KEY (`id_factura`)
    REFERENCES `Drogueria DB`.`Factura` (`id_factura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
