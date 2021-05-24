create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
disciplina varchar (50) not null,
assunto varchar (100) not null,
periodo varchar(30),
primary key(id)
);

create table tb_curso(
id bigint auto_increment,
duracao varchar (10),
valor decimal (10,2),
nome_instrutor varchar (50),
qtd_modulos int,
qtd_atividades int,
id_categoria bigint,
primary key(id),
foreign key (id_categoria) references tb_categoria(id)
);

insert into tb_categoria (disciplina,assunto,periodo) values ("biologia","anatomia","manhã");
insert into tb_categoria (disciplina,assunto,periodo) values ("tecnologia","dev web","manhã");
insert into tb_categoria (disciplina,assunto,periodo) values ("tecnologia","banco de dados","tarde");
insert into tb_categoria (disciplina,assunto,periodo) values ("matematica","pi","noite");
insert into tb_categoria (disciplina,assunto,periodo) values ("história","2 guerra mundial","tarde");

insert into tb_curso (duracao,valor,nome_instrutor,qtd_modulos,qtd_atividades,id_categoria) values ("30 horas",54.50,"Jorge Luis",3,2,4);
insert into tb_curso (duracao,valor,nome_instrutor,qtd_modulos,qtd_atividades,id_categoria) values ("100 horas",100.99,"Samara Carvalho",5,3,2);
insert into tb_curso (duracao,valor,nome_instrutor,qtd_modulos,qtd_atividades,id_categoria) values ("50 horas",54.50,"Luis Martins",3,2,5);
insert into tb_curso (duracao,valor,nome_instrutor,qtd_modulos,qtd_atividades,id_categoria) values ("60 horas",88.90,"Maria Firma",5,4,1);
insert into tb_curso (duracao,valor,nome_instrutor,qtd_modulos,qtd_atividades,id_categoria) values ("5 horas",34.50,"Fabio Turpino",1,0,1);
insert into tb_curso (duracao,valor,nome_instrutor,qtd_modulos,qtd_atividades,id_categoria) values ("75 horas",88.90,"Fernando Barbosa",5,4,3);
insert into tb_curso (duracao,valor,nome_instrutor,qtd_modulos,qtd_atividades,id_categoria) values ("6 horas",34.80,"Jorge Luis",1,0,4);
insert into tb_curso (duracao,valor,nome_instrutor,qtd_modulos,qtd_atividades,id_categoria) values ("6 horas",34.80,"Luis Martins",1,0,5);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_curso where valor > 50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
select * from tb_curso where valor >= 3 and valor <=60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra J.
select * from tb_curso where nome_instrutor like "%j%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
select duracao,valor,nome_instrutor,qtd_modulos,qtd_atividades,tb_curso.id,tb_categoria.id,tb_categoria.disciplina as disciplina, tb_categoria.assunto as assunto, tb_categoria.periodo as periodo 
from tb_curso 
inner join tb_categoria on tb_categoria.id = tb_curso.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria Java).
select * from tb_curso where id_categoria = 4;
