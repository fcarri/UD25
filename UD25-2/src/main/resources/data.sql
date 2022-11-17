
drop table if exists empleados;
drop table if exists departamentos;

create table departamentos(codigo int not null, nombre varchar(100), presupuesto int,
primary key(codigo)
);

create table empleados(dni varchar(8) not null, nombre varchar(100), apellidos varchar(255), 
departamento int,primary key(dni), foreign key(departamento) references departamentos(codigo)
on delete cascade on update cascade
);

insert into departamentos (codigo, nombre, presupuesto) values (1,'A',1200);
insert into empleados (dni, nombre, apellidos, departamento) values ('20111222', 'Joan','Tiberius_Kirk',1);

