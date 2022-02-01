DROP TABLE IF EXISTS DIRECTOR;
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