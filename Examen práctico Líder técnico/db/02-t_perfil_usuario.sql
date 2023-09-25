CREATE TABLE t_perfil_usuario(
id_user NUMBER(4) NOT NULL,
name_user VARCHAR2(20) NOT NULL,
lname_user VARCHAR2(20) NOT NULL,
phone_user VARCHAR2(20) NOT NULL,
picture_user VARCHAR2(20),
CONSTRAINT fk_t_userio FOREIGN KEY (id_user)
REFERENCES t_usuario(id_user)
);


--INSERT INTO t_perfil_usuario VALUES (1,'alberto herson','uribe','76-2120-7448','N/A');
--COMMIT;