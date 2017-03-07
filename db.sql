CREATE TABLE t_project (
  t_id int(11) NOT NULL AUTO_INCREMENT,
  t_no char(8) DEFAULT NULL,
  t_name varchar(50) DEFAULT NULL,
  t_start_date date DEFAULT NULL,
  t_end_date date DEFAULT NULL,
  PRIMARY KEY (t_id)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;


INSERT INTO t_project VALUES (97,'pm000001','上山','2008-01-02','2008-01-15');
INSERT INTO t_project VALUES (98,'pm000002','上班','2008-02-01','2008-02-20');
INSERT INTO t_project VALUES (99,'pm000003','骑虎难下','2008-03-01','2008-03-08');
INSERT INTO t_project VALUES (100,'pm000004','咬我','2008-03-08','2008-03-10');
INSERT INTO t_project VALUES (167,'pm000071','name0968058634','2008-05-28','2008-08-26');
INSERT INTO t_project VALUES (168,'pm000072','name1255323646','2008-11-05','2009-01-17');
INSERT INTO t_project VALUES (197,'pm000101','喝咖啡','2008-01-01','2008-02-02');

select * from t_project;





