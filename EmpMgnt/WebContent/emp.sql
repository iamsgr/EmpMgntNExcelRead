/*
SQLyog Community v12.4.2 (32 bit)
MySQL - 5.7.11-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `employee` (
	`emp_id` int (11),
	`emp_name` varchar (60),
	`join_date` date ,
	`date` date ,
	`in_time` time ,
	`out_time` time ,
	`mngr_id` int (11)
); 
insert into `employee` (`emp_id`, `emp_name`, `join_date`, `date`, `in_time`, `out_time`, `mngr_id`) values('1','Jack','2002-03-01','2018-10-01','09:00:00','07:00:00','0');
insert into `employee` (`emp_id`, `emp_name`, `join_date`, `date`, `in_time`, `out_time`, `mngr_id`) values('2','Jeson','2002-08-01','2018-10-01','09:00:00','06:00:00','1');
insert into `employee` (`emp_id`, `emp_name`, `join_date`, `date`, `in_time`, `out_time`, `mngr_id`) values('3','Adam','2002-08-01','2018-10-01','09:00:00','06:00:00','1');
insert into `employee` (`emp_id`, `emp_name`, `join_date`, `date`, `in_time`, `out_time`, `mngr_id`) values('4','Watson','2002-10-01','2018-10-01','08:45:00','07:02:00','2');
