DROP table IF EXISTS cajas;
DROP table IF EXISTS almacenes;

create table almacenes(codigo int not null, lugar varchar(100), capacidad int,
primary key(codigo));

create table cajas(numReferencia int not null, contenido varchar(100), valor int, 
almacen int, primary key(numReferencia), foreign key(almacen) references almacenes(codigo)
on delete cascade on update cascade);

insert into almacenes (codigo, lugar, capacidad) values (1,'Aqui',200);
insert into cajas (numReferencia, contenido, valor, almacen) values (2,'camisa',200,1); 