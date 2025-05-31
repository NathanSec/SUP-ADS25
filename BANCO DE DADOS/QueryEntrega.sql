create database gerenciaTarefas;
use gerenciaTarefas;


create table usuarios (
	id_usuario int primary key auto_increment,
    nome varchar(100) not null,
    senha varchar(100) not null,
    receber_notificacoes boolean default false
);

create table tarefas (
	id_tarefa int auto_increment primary key,
    titulo varchar(150) not null,
    descricao varchar(255) not null,
    categoria varchar(100),
    data_limite date,
    usuario_id int,
    foreign key (usuario_id) references usuarios(id_usuario)
);

create table info_usuarios (
    id_info_usuario int primary key auto_increment,
    id_usuario int,
    data_criacao date,
    foreign key (id_usuario) references usuarios(id_usuario)
);

create table info_tarefas (
    id_info_tarefa int primary key auto_increment,
    id_tarefa int,
    data_criacao date,
    foreign key (id_tarefa) references tarefas(id_tarefa)
);

INSERT INTO usuarios (nome, senha, receber_notificacoes) 
VALUES 
("Ana Souza", "senha123", TRUE),
("Carlos Lima", "abc123", FALSE),
("Fernanda Costa", "minhasenha", TRUE),
("João Pedro", "joaop123", FALSE);

INSERT INTO tarefas (titulo, descricao, categoria, data_limite, usuario_id) 
VALUES 
("Comprar materiais", "Comprar lápis, canetas e cadernos", "Pessoal", "2025-06-05", 1),
("Projeto de ciência", "Finalizar o relatório do experimento", "Estudo", "2025-06-12", 2),
("Treino de corrida", "Correr 5 km no parque", "Saúde", "2025-06-07", 1),
("Reunião com equipe", "Apresentar resultados do trimestre", "Trabalho", "2025-06-15", 3),
("Estudar Java", "Revisar classes e objetos", "Estudo", "2025-06-10", 4),
("Aniversário da mãe", "Comprar presente e preparar festa", "Pessoal", "2025-06-20", 3);

-- Inserts na tabela info_usuarios
INSERT INTO info_usuarios (id_usuario, data_criacao)
VALUES 
(1, "2025-05-31"),
(2, "2025-05-31"),
(3, "2025-05-31"),
(4, "2025-05-31");

-- Inserts na tabela info_tarefas
INSERT INTO info_tarefas (id_tarefa, data_criacao)
VALUES
(1, "2025-05-31"),
(2, "2025-05-31"),
(3, "2025-05-31"),
(4, "2025-05-31"),
(5, "2025-05-31"),
(6, "2025-05-31");

select * from usuarios;
select * from tarefas;
select * from info_usuarios;
select * from info_tarefas;

/* Visualiza todos os usuário pelo nome e suas respectivas tarefas pelo título */
select usuarios.nome as Nome, tarefas.titulo as Titulo
from usuarios
join tarefas on id_usuario = tarefas.usuario_id
order by nome;

/* Visualiza uma tabela com quais usuários desejam receber notificações de status de suas tarefas */
select id_usuario as ID, nome as Nome 
from usuarios 
where receber_notificacoes = TRUE;

/* Visualiza a quantidade total de tarefas que cada usuário possui */
select usuarios.nome as Nome, COUNT(tarefas.titulo) as Total_Tarefas 
from usuarios
left join tarefas on id_usuario = tarefas.usuario_id
group by usuarios.nome;

/* nome do usuário, tarefa, data de criação do usuário e da tarefa */
select u.nome as Nome, 
       t.titulo as Titulo, 
       infou.data_criacao as Data_Criacao_Usuario,
       it.data_criacao as Data_Criacao_Tarefa
from usuarios u
join tarefas t on u.id_usuario = t.usuario_id
join info_usuarios infou on u.id_usuario = infou.id_usuario
join info_tarefas it on t.id_tarefa = it.id_tarefa
order by u.nome;
