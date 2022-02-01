
create table USUARIO
(
	alias varchar(30) not null primary key,
	usu_nombre varchar(30) not null,
    usu_apellido varchar(30) not null,
    usu_email varchar(20) null,
	usu_celular bigint not null,
	usu_contrasena varchar(20) null,
    usu_fecha_nac DATETIME
);
insert into USUARIO values ( "lucky","Pedro", "Perez", "1@EMAIL.COM", "1234", "QWERTY", "1958-10-01");
insert into USUARIO values ( "malopez","Maria", "Lopez", "2@EMAIL.COM", "1234", "QWERTY", "1959-10-01");
insert into USUARIO values ( "diva","Ana", "Diaz", "3@EMAIL.COM", "1234", "QWERTY", "1951-10-01");
insert into USUARIO values ( "dreamer","Luis", "Rojas", "4@EMAIL.COM", "1234", "QWERTY", "1952-10-01");
insert into USUARIO values ( "ninja","Andres", "Cruz", "5@EMAIL.COM", "1234", "QWERTY", "1953-10-01");
insert into USUARIO values ( "neon","Nelson", "Ruiz", "6@EMAIL.COM", "1234", "QWERTY", "1954-10-01");
insert into USUARIO values ( "rose","Claudia", "Mendez", "7@EMAIL.COM", "1234", "QWERTY", "1955-10-01");
insert into USUARIO values ( "green","Jorge", "Rodriguez", "8@EMAIL.COM", "1234", "QWERTY", "1956-10-01");
