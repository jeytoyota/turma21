create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tipo varchar (30) not null,
tamanho varchar (30) not null,
classe varchar(20) not null,
primary key(id)
);

create table tb_pizza(
id bigint auto_increment,
nome varchar (30) not null,
valor decimal(5,2) not null,
massa varchar(20),
borda varchar(20),
descricao varchar(100),
id_categoria bigint,
primary key(id),
foreign key(id_categoria) references tb_categoria (id)
);

insert into tb_categoria (tipo,tamanho,classe) values ("salgado","grande","popular");
insert into tb_categoria (tipo,tamanho,classe) values ("salgado","pequeno","premium");
insert into tb_categoria (tipo,tamanho,classe) values ("doce","médio","clássica");
insert into tb_categoria (tipo,tamanho,classe) values ("doce","grande","premium");
insert into tb_categoria (tipo,tamanho,classe) values ("salgado","médio","clássica");

insert into tb_pizza (nome,valor,massa,borda,descricao,id_categoria) values ("Mussarela",38.00,"fina","simples","pizza cheia de queijo delícia",1);
insert into tb_pizza (nome,valor,massa,borda,descricao,id_categoria) values ("Doce de leite",55.50,"fina","simples","pizza cheia de doce de leite Argentino",3);
insert into tb_pizza (nome,valor,massa,borda,descricao,id_categoria) values ("Brócolis com bacon",35.50,"grossa","recheio requeijão","pizza cheia de queijo,brócolis e becon!",2);
insert into tb_pizza (nome,valor,massa,borda,descricao,id_categoria) values ("Portuguêsa",45.50,"média","simples","pizza super recheada!",5);
insert into tb_pizza (nome,valor,massa,borda,descricao,id_categoria) values ("Chocolate e banana",65.50,"fina","recheio nutella","pizza delícia doce!",4);
insert into tb_pizza (nome,valor,massa,borda,descricao,id_categoria) values ("Nutella e morango",45.50,"fina","simples","pizza cheia de morango",3);
insert into tb_pizza (nome,valor,massa,borda,descricao,id_categoria) values ("4 queijos",40.50,"fina","simples","pizza cheia de queijo delícia",2);
insert into tb_pizza (nome,valor,massa,borda,descricao,id_categoria) values ("Calabresa",65.50,"dupla","recheio queijo","pizza cheia de queijo e calabresa",1);

-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
select * from tb_pizza where valor > 45;

-- Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.
select * from tb_pizza where valor >= 29 and valor <=60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
select * from tb_pizza where nome like "%c%";

-- Faça um um select com Inner join entre  tabela categoria e pizza.
select tb_pizza.nome as nome,valor,massa,borda,descricao,tb_pizza.id,tb_categoria.tipo as tipo, tb_categoria.tamanho as tamanho from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
select * from tb_pizza where id_categoria = 1;


