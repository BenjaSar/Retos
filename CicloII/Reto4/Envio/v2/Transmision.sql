Create table TRANSMISION
(
pel_id int primary key,
alias  VARCHAR(30) NOT NULL,
ptransmisiones  VARCHAR(45) NULL DEFAULT NULL,
pfecha  DATETIME NULL DEFAULT NULL,
cont_id  int,
foreign key (cont_id) references CONTENIDO(cont_id),
foreign key (alias) references USUARIO(alias)
);
insert into TRANSMISION values (1,"lucky","Harry Potter","2017-10-25 20:00:00",1);
insert into TRANSMISION values (2,"lucky","El señor de los anillos","2019-03-15 18:30:00",1);
insert into TRANSMISION values (3,"malopez","Harry Potter","2018-05-20 20:30:00",1);
insert into TRANSMISION values (4,"diva","Stardust","2019-05-20 20:30:00",1);
insert into TRANSMISION values (5,"diva","El imaginario del Doctor Parnassus","2018-06-22 21:30:00",1);
insert into TRANSMISION values (6,"ninja","El señor de los anillos","2020-02-20 16:30:20",1);
insert into TRANSMISION values (7,"ninja","Stardust","2020-03-27 18:30:20",1);
insert into TRANSMISION values (8,"green","Stardust","2020-01-10 17:30:20",1);
insert into TRANSMISION values (9,"green","El señor de los anillos","2020-02-15 20:30:20",1);
insert into TRANSMISION values (10,"malopez","Supernatural","2020-01-20 20:30:00",2);
insert into TRANSMISION values (11,"diva","La orden secreta","2020-03-17 15:30:20",2);
insert into TRANSMISION values (12,"dreamer","Los originales","2020-03-17 15:30:20",2);
insert into TRANSMISION values (13,"dreamer","Once upon a time","2020-04-10 18:30:20",2);
insert into TRANSMISION values (14,"ninja","The Flash","2020-02-17 20:30:20",2);
insert into TRANSMISION values (15,"rose","Outlander","2020-03-20 21:30:20",2);
insert into TRANSMISION values (16,"green","Stranger Things","2020-03-17 18:30:20",2);
insert into TRANSMISION values (17,"lucky","Juego de tronos","2019-05-20 20:30:00",2);