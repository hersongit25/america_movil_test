CREATE TABLE h_pagos(
id_emp NUMBER(8) NOT NULL,
pago_neto_emp VARCHAR2(10) NOT NULL,
pago_isr VARCHAR2(10) NOT NULL,
porcent_isr VARCHAR2(10) NOT NULL,
pago_seguro VARCHAR2(10) NOT NULL,
porcent_seguro VARCHAR2(10) NOT NULL,
pago_caja VARCHAR2(10) NOT NULL,
porcent_caja VARCHAR2(10) NOT NULL,
date_pago DATE,
CONSTRAINT fk_t_emp FOREIGN KEY (id_emp)
REFERENCES t_empleado(id_emp)
);