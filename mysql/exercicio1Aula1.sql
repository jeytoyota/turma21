-- EXERCÍCIOS 1

create database db_rh;

use db_rh;

create table tb_funcionaries(
id bigint auto_increment,
nome varchar(50) not null,
idade int not null,
cpf varchar(14) not null,
salario float not null,
setor varchar(20) not null,
primary key (id)
);

select * from tb_funcionaries;

insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Monalisa Ferreira", 25, "123.456.789-00",2500,"Financeiro");
insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Fernando Lima", 35, "222.456.789-01",1500,"Atendimento");
insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Luisa Marquez", 55, "024.456.880-50",6500,"Tecnologia");
insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Fabio de Melo", 31, "255.456.789-00",1800,"Suporte");
insert into tb_funcionaries (nome, idade, cpf, salario, setor) values ("Gabriel dos Santos", 27, "444.356.180-00",2500,"Contabilidade");

select * from tb_funcionaries where nome like "%mo%";

select * from tb_funcionaries where salario > 2000;
select * from tb_funcionaries where salario < 2000;

update tb_funcionaries set salario = 7000 where id = 1;


-- EXERCÍCIO 2 ------------

create database db_ecomerce;
use db_ecomerce;

create table tb_produto(
id bigint auto_increment,
nome varchar (50) not null,
valor decimal(9,2) not null,
marca varchar(20) not null,
origem varchar(20),
categoria varchar(20),

primary key (id)
);

select * from tb_produto;

insert into tb_produto (nome,valor,marca,origem,categoria) values ("celular",2100.99,"Samsung","Coréia","eletrônicos");
insert into tb_produto (nome,valor,marca,origem,categoria) values ("jaqueta jeans",349.99,"Levis","EUA","vestuário");
insert into tb_produto (nome,valor,marca,origem,categoria) values ("frigideira premium",299.99,"Tramontina","Brasil","utensílios");
insert into tb_produto (nome,valor,marca,origem,categoria) values ("notebook A40",5500,"Lenovo","China","eletrônicos");
insert into tb_produto (nome,valor,marca,origem,categoria) values ("fone bluetooth",179.90,"Samsung","Coréia","eletrônicos");
insert into tb_produto (nome,valor,marca,origem,categoria) values ("airfryer",299.90,"Mondial","Brasil","eletrodomésticos");
insert into tb_produto (nome,valor,marca,origem,categoria) values ("tênis de corrida",350,"Nike","Vietna","Calçados");
insert into tb_produto (nome,valor,marca,origem,categoria) values ("mouse com fio",29.99,"Logitech","China","eletrônicos");

select * from tb_produto where valor > 500;
select * from tb_produto where valor < 500;

update tb_produto set valor = 100 where id = 5;

-- EXERCÍCIO 3 ------------

create database db_escola;
use db_escola;

create table tb_alunes(
id bigint auto_increment,
nome varchar(50) not null,
idade int not null,
notas decimal(4,2),
rm varchar(10) not null,
periodo varchar(20) not null,

primary key(id)
);

select * from tb_alunes;

insert into tb_alunes(nome,idade,notas,rm,periodo) values ("Caroline Ferreira",10,8.2,"4521","manhã");
insert into tb_alunes(nome,idade,notas,rm,periodo) values ("Rodrigo Machado",14,9.5,"3987","manhã");
insert into tb_alunes(nome,idade,notas,rm,periodo) values ("Aline Assis",12,7.1,"4310","tarde");
insert into tb_alunes(nome,idade,notas,rm,periodo) values ("Jorge Camargo",15,9,"3456","tarde");
insert into tb_alunes(nome,idade,notas,rm,periodo) values ("Fabiana Silva",15,5.2,"4222","manhã");
insert into tb_alunes(nome,idade,notas,rm,periodo) values ("Carlos Ferreira",11,6.5,"5421","tarde");
insert into tb_alunes(nome,idade,notas,rm,periodo) values ("Maria Rosa",8,4.5,"5521","tarde");
insert into tb_alunes(nome,idade,notas,rm,periodo) values ("Leonardo Oliveira",7,7.6,"5421","tarde");

select * from tb_alunes where notas > 7;
select * from tb_alunes where notas < 7;

update tb_alunes set notas = 10 where id = 3;