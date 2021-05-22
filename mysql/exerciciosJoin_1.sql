create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
nome varchar (100) not null,
tipo varchar(30) not null,
idade_permitida int not null,
primary key(id)
);

create table tb_personagem(
id bigint auto_increment,
nome varchar (30) not null,
ataque int not null,
defesa int not null,
forca int not null,
poder varchar(50) not null,
classe_id bigint,
primary key (id),
foreign key(classe_id) references tb_classe (id)
);

select * from tb_personagem;
select * from tb_classe;

insert into tb_classe (nome,tipo,idade_permitida) values ("Guerra Civil Marvel", "ação", 15);
insert into tb_classe (nome,tipo,idade_permitida) values ("Candy crush", "puzzle", 10);
insert into tb_classe (nome,tipo,idade_permitida) values ("Liga da justiça", "ação", 15);
insert into tb_classe (nome,tipo,idade_permitida) values ("Thor no espaço", "aventura", 12);
insert into tb_classe (nome,tipo,idade_permitida) values ("Caça ao tesouro", "aventura", 10);

insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Viúva negra",75,88,79,"ageilidade",1);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Boddy",25,18,25,"ser fofo",2);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Hulk",97,92,100,"imortal",1);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Super homem",90,88,100,"super força",3);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Tempestade",91,81,89,"controla o tempo",3);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Thor",91,89,91,"martelo imbatível",4);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Indiana",70,65,60,"inteligência",5);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Gamora",93,93,82,"luta",1);

select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;
