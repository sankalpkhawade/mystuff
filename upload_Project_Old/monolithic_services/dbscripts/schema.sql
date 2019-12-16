-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema vehicle_rs
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema vehicle_rs
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vehicle_rs` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema truyum
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema truyum
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `truyum` ;
USE `vehicle_rs` ;

-- -----------------------------------------------------
-- Table `vehicle_rs`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_rs`.`user` (
  `us_id` INT(11) NOT NULL AUTO_INCREMENT,
  `us_emp_id` VARCHAR(20) NOT NULL,
  `us_first_name` VARCHAR(50) NOT NULL,
  `us_last_name` VARCHAR(50) NOT NULL,
  `us_age` INT(2) NOT NULL,
  `us_gender` VARCHAR(6) NOT NULL,
  `us_contact` BIGINT(10) NOT NULL,
  `us_email` VARCHAR(50) NOT NULL,
  `us_password` VARCHAR(100) NOT NULL,
  `us_branch` VARCHAR(5) NOT NULL,
  `us_status` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`us_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vehicle_rs`.`vehicle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_rs`.`vehicle` (
  `vh_id` INT(11) NOT NULL AUTO_INCREMENT,
  `vh_name` VARCHAR(45) NOT NULL,
  `vh_image` VARCHAR(300) NOT NULL,
  `vh_vehicle_no` VARCHAR(10) NOT NULL,
  `vh_seater` VARCHAR(10) NOT NULL,
  `vh_type` VARCHAR(15) NOT NULL,
  `vh_price` DOUBLE NOT NULL,
  `vh_active` TINYINT(1) NOT NULL,
  `vh_branch` VARCHAR(5) NOT NULL,
  `vh_insurance_exp_date` DATE NOT NULL,
  `vh_last_service_date` DATE NOT NULL,
  `vh_service_due_date` DATE NOT NULL,
  `vh_status` TINYINT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`vh_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 23
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vehicle_rs`.`booking`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_rs`.`booking` (
  `bk_id` INT(11) NOT NULL AUTO_INCREMENT,
  `bk_us_id` INT(11) NOT NULL,
  `bk_vh_id` INT(11) NOT NULL,
  `bk_booking_start` DATE NOT NULL,
  `bk_booking_end` DATE NOT NULL,
  `bk_price` FLOAT NULL DEFAULT NULL,
  PRIMARY KEY (`bk_id`),
  INDEX `user_booking_idx` (`bk_us_id` ASC),
  INDEX `vehicle_booking_idx` (`bk_vh_id` ASC),
  CONSTRAINT `user_booking`
    FOREIGN KEY (`bk_us_id`)
    REFERENCES `vehicle_rs`.`user` (`us_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `vehicle_booking`
    FOREIGN KEY (`bk_vh_id`)
    REFERENCES `vehicle_rs`.`vehicle` (`vh_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 26
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vehicle_rs`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_rs`.`role` (
  `ro_id` INT(11) NOT NULL,
  `ro_name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`ro_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `vehicle_rs`.`user_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_rs`.`user_role` (
  `ur_id` INT(11) NOT NULL AUTO_INCREMENT,
  `ur_us_id` INT(11) NULL DEFAULT NULL,
  `ur_ro_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ur_id`),
  INDEX `fk_user_role_user_idx` (`ur_us_id` ASC),
  INDEX `fk_user_role_role1_idx` (`ur_ro_id` ASC),
  CONSTRAINT `fk_user_role_role1`
    FOREIGN KEY (`ur_ro_id`)
    REFERENCES `vehicle_rs`.`role` (`ro_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_role_user`
    FOREIGN KEY (`ur_us_id`)
    REFERENCES `vehicle_rs`.`user` (`us_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
