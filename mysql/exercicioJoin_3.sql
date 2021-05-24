create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
setor varchar (30) not null,
marca varchar (30) not null,
primary key(id)
);

create table tb_produto(
id bigint auto_increment,
nome varchar(50) not null,
peso decimal(10,2),
valor decimal(10,2),
validade varchar(20),
id_categoria bigint,
primary key(id),
foreign key (id_categoria) references tb_categoria (id)
);

insert into tb_categoria (setor,marca) values ("medicamento","Eurofarma");
insert into tb_categoria (setor,marca) values ("medicamento","Novartis");
insert into tb_categoria (setor,marca) values ("higiene","Asepxia");
insert into tb_categoria (setor,marca) values ("equipamentos","CONTEC");
insert into tb_categoria (setor,marca) values ("bomboniere","Fini");

insert into tb_produto (nome,peso,valor,validade,id_categoria) values ("Buscopan", 100, 35.80, "24/05/2022",1);
insert into tb_produto (nome,peso,valor,validade,id_categoria) values ("Tubes", 100, 4.99, "11/12/2021",5);
insert into tb_produto (nome,peso,valor,validade,id_categoria) values ("Sabonete contra espinhas", 800, 18.99, "24/05/2030",3);
insert into tb_produto (nome,peso,valor,validade,id_categoria) values ("Termômetro", 30, 103.50, "indeterminado",4);
insert into tb_produto (nome,peso,valor,validade,id_categoria) values ("Ibuprofeno", 100, 28.90, "15/12/2022",2);
insert into tb_produto (nome,peso,valor,validade,id_categoria) values ("Amora", 100, 4.99, "11/12/2021",5);
insert into tb_produto (nome,peso,valor,validade,id_categoria) values ("Dentadura", 100, 4.99, "11/12/2021",5);
insert into tb_produto (nome,peso,valor,validade,id_categoria) values ("shampoo", 350, 32.80, "05/01/2025",3);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_produto where valor > 50;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
select * from tb_produto where valor >= 3 and valor <=60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra B.
select * from tb_produto where nome like "%b%";

-- Faça um um select com Inner join entre  tabela categoria e produto.
select nome,peso,valor,peso,tb_produto.id,tb_categoria.id,tb_categoria.setor as setor, tb_categoria.marca as marca from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).
select * from tb_produto where id_categoria = 5;

