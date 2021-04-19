/**
* loja de games 
* @author Matheus cesarini
*/

/* banco de dados */ 

-- verifica banco de dados disponiveis 
show databases;
-- cria um banco de dados 
create database dbgames;
-- seleciona o banco de dados;
use dbgames;

/* tabelas */ 

-- verifica a tabela do banco de dados 
show tables;
-- cria uma tabela 
create table games (
idgame int primary key auto_increment,
nome varchar(50) not null,
valor decimal(10,2) not null,
plataforma varchar(20) not null,
quantidade int not null,
categoria varchar(50)
);
-- descrave a estrutura da tabela 
describe games;
-- remove uma tabela 
drop table games;

/* CRUD (create read update delete) */

-- CRUD create para criar tabela de games 
insert into games(nome,categoria,plataforma,quantidade,valor)
values('Grand Theft Auto V','ação-aventura','xbox,ps,pc',2,250);

insert into games(nome,categoria,plataforma,quantidade,valor)
values('rainbow six siege','Tiro primeira pessoa','xbox,ps,pc',5,150);

insert into games(nome,categoria,plataforma,quantidade,valor)
values('minecraft','ação-aventura','xbox,ps,pc',4,255);

insert into games(nome,categoria,plataforma,quantidade,valor)
values('mercenaries','guerra','xbox,ps,pc',9,350);

insert into games(nome,categoria,plataforma,quantidade,valor)
values('call of duty','guerra','xbox,ps,pc',12,225);

-- CRUD read
-- abaixo o comando seleciona tudo e mostra os jogos cadastrados 
select * from games;

-- abaixo o comando abre a tabela em ordem alfabetica
select * from games order by nome;

-- CRUD update 

-- o comando abaixo altera um item especifico na tabela
update games set valor=275 where idgame = 3;

-- CRUD delete 
-- comando que apaga os jogos criados na tabela 
delete from games where idgame = 4;

