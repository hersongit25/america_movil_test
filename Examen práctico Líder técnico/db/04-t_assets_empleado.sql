CREATE TABLE t_assets_empleado(
id_emp NUMBER(8) NOT NULL,
code_emp VARCHAR2(20) NOT NULL,
id_position_emp NUMBER(4) NOT NULL,
id_area_emp NUMBER(4) NOT NULL,
date_ing_emp DATE,
date_egre_emp DATE,
estatus_emp NUMBER(1) NOT NULL,
CONSTRAINT fk_id_emp FOREIGN KEY (id_emp)
REFERENCES t_empleado(id_emp)
);