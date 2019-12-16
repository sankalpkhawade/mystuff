-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema vehicle_reservation
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema vehicle_reservation
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vehicle_reservation` DEFAULT CHARACTER SET utf8 ;
USE `vehicle_reservation` ;

-- -----------------------------------------------------
-- Table `vehicle_reservation`.`branch`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_reservation`.`branch` (
  `branch_id` INT(11) NOT NULL AUTO_INCREMENT,
  `branch_name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`branch_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vehicle_reservation`.`user_status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_reservation`.`user_status` (
  `us_id` INT(11) NOT NULL AUTO_INCREMENT,
  `us_value` VARCHAR(9) NULL DEFAULT NULL,
  PRIMARY KEY (`us_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vehicle_reservation`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_reservation`.`user` (
  `user_id` VARCHAR(15) NOT NULL,
  `user_first_name` VARCHAR(50) NOT NULL,
  `user_last_name` VARCHAR(50) NOT NULL,
  `user_age` INT(2) NOT NULL,
  `user_gender` VARCHAR(7) NOT NULL,
  `user_contact_number` VARCHAR(10) NOT NULL,
  `user_email_id` VARCHAR(50) NOT NULL,
  `user_password` VARCHAR(100) NOT NULL,
  `user_branch_id` INT(11) NOT NULL,
  `user_status_id` INT(11) NOT NULL,
  `user_role` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `admin_id_UNIQUE` (`user_id` ASC),
  INDEX `fk_admin_status_id_idx` (`user_status_id` ASC),
  INDEX `fk_us_br_id_idx` (`user_branch_id` ASC),
  CONSTRAINT `fk_us_br_id`
    FOREIGN KEY (`user_branch_id`)
    REFERENCES `vehicle_reservation`.`branch` (`branch_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_status_id`
    FOREIGN KEY (`user_status_id`)
    REFERENCES `vehicle_reservation`.`user_status` (`us_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vehicle_reservation`.`vehicle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_reservation`.`vehicle` (
  `vehicle_number` VARCHAR(10) NOT NULL,
  `vehicle_type` VARCHAR(15) NOT NULL,
  `vehicle_insurance_expiry_date` DATE NOT NULL,
  `vehicle_last_serviced_date` DATE NOT NULL,
  `vehicle_service_due_date` DATE NOT NULL,
  `vehicle_branch_id` INT(11) NOT NULL,
  `vehicle_image` VARCHAR(150) NULL DEFAULT NULL,
  `vehicle_price` DECIMAL(6,2) NULL DEFAULT NULL,
  PRIMARY KEY (`vehicle_number`),
  UNIQUE INDEX `vehicle_number_UNIQUE` (`vehicle_number` ASC),
  INDEX `fk_vh_br_id_idx` (`vehicle_branch_id` ASC),
  CONSTRAINT `fk_vh_br_id`
    FOREIGN KEY (`vehicle_branch_id`)
    REFERENCES `vehicle_reservation`.`branch` (`branch_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vehicle_reservation`.`booking`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_reservation`.`booking` (
  `bk_id` INT(11) NOT NULL AUTO_INCREMENT,
  `bk_us_id` VARCHAR(6) NOT NULL,
  `bk_vh_no` VARCHAR(10) NOT NULL,
  `bk_booked_date` DATE NOT NULL,
  `bk_end_date` DATE NOT NULL,
  PRIMARY KEY (`bk_id`),
  UNIQUE INDEX `bk_id_UNIQUE` (`bk_id` ASC),
  INDEX `fk_vh_no_idx` (`bk_vh_no` ASC),
  INDEX `fk_us_id_idx` (`bk_us_id` ASC),
  CONSTRAINT `fk_us_id`
    FOREIGN KEY (`bk_us_id`)
    REFERENCES `vehicle_reservation`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vh_no`
    FOREIGN KEY (`bk_vh_no`)
    REFERENCES `vehicle_reservation`.`vehicle` (`vehicle_number`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vehicle_reservation`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_reservation`.`role` (
  `role_id` INT NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(15) NULL,
  PRIMARY KEY (`role_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vehicle_reservation`.`user_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vehicle_reservation`.`user_role` (
  `ur_id` INT NULL AUTO_INCREMENT,
  `ur_us_id` VARCHAR(15) NULL,
  `ur_ro_id` INT NULL,
  PRIMARY KEY (`ur_id`),
  INDEX `fk_us_id_idx` (`ur_us_id` ASC),
  INDEX `fk_ro_id_idx` (`ur_ro_id` ASC),
  CONSTRAINT `ur_us_fk`
    FOREIGN KEY (`ur_us_id`)
    REFERENCES `vehicle_reservation`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ur_ro_fk`
    FOREIGN KEY (`ur_ro_id`)
    REFERENCES `vehicle_reservation`.`role` (`role_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
