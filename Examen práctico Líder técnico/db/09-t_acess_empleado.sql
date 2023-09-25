CREATE TABLE t_acess_empleado(
id_emp NUMBER(8) NOT NULL,
id_user NUMBER(4) NOT NULL,
CONSTRAINT fk_acess_emp FOREIGN KEY(id_emp)
REFERENCES t_empleado(id_emp)
);
