CREATE TABLE t_empleado(
id_emp NUMBER(8) NOT NULL,
name_emp VARCHAR2(20) NOT NULL,
lname_emp VARCHAR2(20) NOT NULL,
second_lname VARCHAR2(20) NOT NULL,
rfc_emp VARCHAR2(20) NOT NULL UNIQUE,
email_emp VARCHAR2(30) NOT NULL UNIQUE,
phone_emp VARCHAR2(20),
born_date DATE,
CONSTRAINT pk_id_emp PRIMARY KEY (id_emp)
);


