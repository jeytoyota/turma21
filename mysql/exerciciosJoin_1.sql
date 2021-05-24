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

insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Viúva negra",27500,3088,1779,"ageilidade",1);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Boddy",1025,1018,1025,"ser fofo",2);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Hulk",5970,5492,6000,"imortal",1);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Super homem",5990,5988,600,"super força",3);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Tempestade",4091,3081,4089,"controla o tempo",3);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Thor",2091,1089,4091,"martelo imbatível",4);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Indiana",1070,1065,1610,"inteligência",5);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Gamora",2093,1093,1082,"luta",1);
insert into tb_personagem(nome,ataque,defesa,forca,poder,classe_id) values ("Arqueiro",3093,1003,2000,"luta",1);

-- Faça um select que retorne os personagens com o poder de ataque maior do que 2000.
select * from tb_personagem where forca > 2000;

-- Faça um select trazendo  os personagens com poder de defesa entre 1000 e 2000.
select * from tb_personagem where forca >= 1000 and forca <=2000;

-- Faça um select  utilizando LIKE buscando os personagens com a letra C.
select * from tb_classe where nome like "%c%";

-- Faça um um select com Inner join entre  tabela classe e personagem.
select tb_personagem.nome as nome,ataque,defesa,forca,poder,tb_personagem.id, tb_classe.id,tb_classe.nome as nome from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id;

-- Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).
select * from tb_personagem where classe_id = 1;



