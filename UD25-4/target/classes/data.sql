drop table if exists salas;
drop table if exists peliculas;

create table peliculas(codigo int not null, nombre varchar(100), calificacion int);

create table salas(codigo int not null, nombre varchar(100), pelicula int,
primary key(codigo),foreign key(pelicula) references salas(codigo)
on delete cascade on update cascade);

insert into peliculas (codigo, nombre, calificacion) values (1,'Alien',16);
insert into salas (codigo, nombre, pelicula) values (1,'A',1);

