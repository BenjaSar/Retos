Create table SERIE
(
	ser_id  varchar(50) primary key,
	ser_titulo varchar(50) not null,
    ser_temporada int ,
    ser_episodios int ,
    cont_id int not null,
    foreign key (cont_id) references CONTENIDO(cont_id)
);  
insert into SERIE values ("S1","Supernatural", 312, 15,2);
insert into SERIE values ("S2","La orden secreta", 20, 12,2);
insert into SERIE values ("S3","Once Upon a Time", 155, 7,2);
insert into SERIE values ("S4","Juego de tronos", 73, 8,2);
insert into SERIE values ("S5","Los originales",92, 5,2);
insert into SERIE values ("S6","Stranger Things",33, 4,2);
insert into SERIE values ("S7","The Flash",146, 8,2);
insert into SERIE values ("S8","Outlander",75, 7,2);