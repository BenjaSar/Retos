DROP SCHEMA IF EXISTS FantasiPlus;
CREATE SCHEMA FantasiPlus;
USE FantasiPlus;

drop table if exists DIRECTOR;
drop table if exists PELICULA;
drop table if exists SERIE;
drop table if exists USUARIO;
drop table if exists CONTENIDO;
drop table if exists TRANSMISION; 

-- TABLA DE DIRECTOR
/*DROP TABLE IF EXISTS DIRECTOR;*/
create table DIRECTOR
(
	dir_id int  primary key,
	dir_nombre varchar(30) not null,
    dir_apellido varchar(30) not null,
    dir_nacionalidad varchar(20) null
);

insert into director values (101, "Chris","Columbus", "estadounidense");
insert into director values (102, "Terry","Gilliam", "británico");
insert into director values (103, "Matthew","Vaughn", "británico");
insert into director values (104, "Tim","Burton", "estadounidense");
insert into director values (105, "Peter","Jackson", "Neozelandés");

/*DROP TABLE IF EXISTS CONTENIDO;*/
-- TABLA DE CONTENIDO
Create table CONTENIDO
(
cont_id  int primary key,
cont_nombre varchar(50)
);

insert into CONTENIDO values (1, "Peliculas");
insert into CONTENIDO values (2, "Series");

/*DROP TABLE IF EXISTS PELICULA;*/
-- TABLA DE PELICULAS
Create table PELICULA
(
	pel_id varchar(50) primary key,
	pel_titulo varchar(50) not null,
	pel_resumen varchar(1200),
	pel_anio varchar(4) ,
	dir_id  int  not null,
    cont_id int not null,
    foreign key (cont_id) references CONTENIDO(cont_id),
    foreign key (dir_id) references DIRECTOR(dir_id)
);

insert into PELICULA values ("P1","Harry Potter", "Harry Potter es un niño huérfano criado por su tío Vernon y su tía Petunia que lo odian. Desde que era pequeño, estos siempre le han contado que sus padres murieron en un accidente de coche.El día de su decimoprimer cumpleaños, Harry recibe la inesperada visita de un hombre gigantesco de nombre Rubeus Hagrid. Este le revela que es, de hecho, hijo de dos poderosos magos y que él también posee extraordinarios poderes. Lleno de alegría, el chico acepta ir a estudiar a Hogwarts, el famoso colegio de magia y hechicería. Por fin, tiene la oportunidad de hacer amigos. Odiado por Severus Snape, profesor de Pociones, y protegido por Albus Dumbledore, director del colegio, Harry intentará dilucidar el misterio de la piedra filosofal.","2001",101,1);
insert into PELICULA values ("P2","El señor de los anillos", "el joven y tímido hobbit, Frodo Bolsón, hereda un anillo. Lejos de ser una simple baratija, se trata del Anillo único, un instrumento de poder que permitiría a Sauron, el Señor Oscuro, reinar en la Tierra Media y convertir en esclavos a sus habitantes. Frodo, con la ayuda de una Compañía formada por hobbits, hombres, un mago, un enano y un elfo, tiene la misión de llevar el Anillo viajando por toda la Tierra Media hasta el Monte del Destino, lugar donde fue forjado, y destruirlo para siempre. Un tal periplo supone aventurarse muy lejos en Mordor, la tierra del Señor Oscuro, donde se concentra su ejército de orcos maléficos... La Compañía, no solo debe combatir las fuerzas externas del mal, sino también las fuerzas internas y la influencia corruptora que ejerce el propio anillo. El final de la historia está íntimamente ligado a la suerte de la Compañía.","2001",105,1);
insert into PELICULA values ("P3","El imaginario del Doctor Parnassus", "Con una extraordinaria habilidad para guiar la imaginación de los demás, el Doctor Parnassus oculta un oscuro secreto. Siglos atrás hizo un trato con el Diablo para ganar inmortalidad, a cambio de entregarle a cualquier hijo que tuviese al cumplir los 16 años. Ahora, deambulando con su humilde teatro ambulante y con una hija a punto de llegar a esa edad, Parnassus está decidido a cambiar el trato.","2009",102,1);
insert into PELICULA values ("P4","Sleepy Hollow","Norteamérica, finales del siglo XVIII. El condestable Ichabod Crane (Johnny Depp), un investigador de Nueva York que utiliza avanzados métodos de averiguación es enviado al pequeño y remoto pueblo de Sleepy Hollow para descubrir qué hay de verdad en la leyenda de un jinete sin cabeza que aterroriza a los habitantes del lugar.","1999",104,1);
insert into PELICULA values ("P5","Stardust","En un pequeño pueblo inglés que limita con un territorio mágico e inaccesible, el joven Tristán (Charlie Cox) emprende la búsqueda de una estrella caída del cielo para conquistar el corazón de Victoria (Sienna Miller). Su viaje, una auténtica odisea, lo lleva a un misterioso país, donde encuentra la estrella, que se ha convertido en la preciosa Yvaine (Claire Danes). Pero también buscan la estrella otras personas: los cuatro hijos del Rey (Peter O’Toole) y los fantasmas de sus tres hermanos muertos, que la necesitan para ocupar el trono; y, además, Lamia (Michelle Pfeiffer), una malvada bruja que la desea para recuperar la juventud. Tristán tendrá, pues, que luchar denodadamente contra todos ellos. Sin embargo, cuando conoce a un pirata llamado capitán Shakespeare (Robert De Niro) y al siniestro comerciante Ferdy the Fence (Ricky Gervais), descubrirá, al fin, cuál es el auténtico significado de su viaje.","2007",103,1);

/*DROP TABLE IF EXISTS SERIE;*/
-- TABLA DE SERIES
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

-- TABLA DE USUARIO
/*DROP TABLE IF EXISTS USUARIO;*/
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

/*DROP TABLE IF EXISTS TRANSMISION*/
-- TABLA DE TRANSMISION
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