CREATE TABLE t_usuario(
id_user NUMBER(4) NOT NULL,
email_user VARCHAR2(20) NOT NULL,
pass_user VARCHAR2(20) NOT NULL,
CONSTRAINT pk_id_user PRIMARY KEY (id_user)
);

-- aditional querys
-- SELECT * FROM t_usuario;

-- INSERT INTO t_usuario VALUES (1,'herson.yeah@gmail.com','Herson198');
-- COMMIT;