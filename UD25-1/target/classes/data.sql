drop table if exists articulos;
drop table if exists fabricantes;

create table fabricantes(codigo int not null auto_increment,
nombre varchar(100), primary key(codigo));

create table articulos(codigo int not null auto_increment, nombre varchar(100),
precio int, fabricante int, primary key(codigo), foreign key(fabricante) references fabricantes(codigo)
on delete cascade on update cascade);

insert into fabricantes (nombre) values ('producto1');
insert into fabricantes (nombre) values ('producto2');
insert into articulos (nombre, precio, fabricante) values ('producto1',120,1);
insert into articulos (nombre, precio, fabricante) values ('producto2',140,2);


