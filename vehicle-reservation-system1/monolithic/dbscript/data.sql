use vehicle_reservation;
insert into user_status (us_value) values ("approved");
insert into user_status (us_value) values ("deny");
insert into user_status (us_value) values ("pending");

insert into branch (branch_name) values ("gachibowli");
insert into branch (branch_name) values ("kond");
insert into branch (branch_name) values ("HiTech");
insert into branch (branch_name) values ("madhapur");
insert into branch (branch_name) values ("alley");

INSERT INTO `vehicle_reservation`.`user` (`user_id`, `user_first_name`, `user_last_name`, `user_age`, `user_gender`, `user_contact_number`, `user_email_id`, `user_password`, `user_branch_id`, `user_status_id`,`user_role`) VALUES ('masterAdmin', 'abc', 'ABC', '18', 'male', '0123456789', 'abc@gmail.com', '$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK', '1', '1','masteradmin');

INSERT INTO `vehicle_reservation`.`user` (`user_id`, `user_first_name`, `user_last_name`, `user_age`, `user_gender`, `user_contact_number`, `user_email_id`, `user_password`, `user_branch_id`, `user_status_id`,`user_role`) VALUES ('admin', 'abc', 'ABC', '18', 'male', '0123456789', 'abc@gmail.com', '$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK', '1', '1','admin');
INSERT INTO `vehicle_reservation`.`user` (`user_id`, `user_first_name`, `user_last_name`, `user_age`, `user_gender`, `user_contact_number`, `user_email_id`, `user_password`, `user_branch_id`, `user_status_id`,`user_role`) VALUES ('user', 'abc', 'ABC', '18', 'male', '0123456789', 'abc@gmail.com', '$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK', '1', '1','user');
select * from user_status;

select * from branch;

INSERT INTO `vehicle_reservation`.`vehicle` (`vehicle_number`, `vehicle_type`, `vehicle_insurance_expiry_date`, `vehicle_last_serviced_date`, `vehicle_service_due_date`, `vehicle_branch_id`, `vehicle_image`, `vehicle_price`) VALUES ('MH21TS6133', 'SUV', '2005-12-11', '2018-10-12', '2019-09-13', '1', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRUgiuqw9xGbAdq7QsBAh8SCZcDBhcjD-WDsNwqYVo30H2P9Yri', '5000');

INSERT INTO `vehicle_reservation`.`vehicle` (`vehicle_number`, `vehicle_type`, `vehicle_insurance_expiry_date`, `vehicle_last_serviced_date`, `vehicle_service_due_date`, `vehicle_branch_id`, `vehicle_image`, `vehicle_price`) VALUES ('MH21TS8461', 'BMW', '2020-12-11', '2019-01-01', '2019-12-13', '2', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSS5UOwpel9-KWEnz9gtCJAhHXL1dYMGIXIxlWOe3cJ7ric--Xf', '8000');
INSERT INTO `vehicle_reservation`.`vehicle` (`vehicle_number`, `vehicle_type`, `vehicle_insurance_expiry_date`, `vehicle_last_serviced_date`, `vehicle_service_due_date`, `vehicle_branch_id`, `vehicle_image`, `vehicle_price`) VALUES ('MH21TS2355', 'SWIFT', '2019-12-11', '2018-10-01', '2019-09-13', '3', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRj3MtW5Eu59OUcxe9tGHF3IATaBOLU4wLJ7rK5JThH-U-yUJ4H', '3000');
INSERT INTO `vehicle_reservation`.`vehicle` (`vehicle_number`, `vehicle_type`, `vehicle_insurance_expiry_date`, `vehicle_last_serviced_date`, `vehicle_service_due_date`, `vehicle_branch_id`, `vehicle_image`, `vehicle_price`) VALUES ('MH21TS4581', 'Ferari', '2021-12-11', '2019-09-05', '2020-12-23', '1', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRXqMAdxbOBm0C81Ay2J5HVLU71-d95xC6wOaCDKOufy5uqCnsu', '9000');

INSERT INTO `vehicle_reservation`.`booking` (`bk_id`, `bk_us_id`, `bk_vh_no`, `bk_booked_date`, `bk_end_date`) VALUES ('1', 'admin', 'MH12AP1223', '2019-11-24', '2019-11-24');

desc user;

select * from user;

update vehicle set vehicle_branch_id='2' where vehicle_number='MH21TS8461';


select * from vehicle;

select * from user_role;
insert into role values(1,'USER');
insert into role values(2,'ADMIN');
insert into role values(3,'DEFAULT');


insert into user_role values(1,'masteradmin',3);
insert into user_role values(2,'user',1);
insert into user_role values(3,'admin',2);

select * from vehicle v Join branch b ON v.vehicle_branch_id=b.branch_id where b.branch_name="gachibowli" ;
select * from vehicle v Join branch b ON v.vehicle_branch_id=b.branch_id  Join booking bk ON v.vehicle_number=bk.bk_vh_no where b.branch_name="gachibowli" AND vehicle_insurance_expiry_date > current_date() AND vehicle_service_due_date > current_date() AND bk.bk_end_date < current_date();