create database controleacesso;

use controleacesso;

CREATE TABLE funcionario
(
id BIGINT NOT NULL auto_increment,	
codigocartao varchar (10) NOT NULL,
nome VARCHAR(100) NOT NULL,
datanascimento date NOT NULL,
numerodocumento VARCHAR(09) NOT NULL,
numerocpf VARCHAR (11) NOT NULL,
telefone VARCHAR(10) NOT NULL,
cargo VARCHAR (20)NOT NULL,
setor VARCHAR (20) NOT NULL,
empresa VARCHAR (30) NOT NULL,
horaE timestamp,
horaS timestamp,
CONSTRAINT pk_tbcliente PRIMARY KEY(id)
);


CREATE TABLE visitante
(
id BIGINT NOT NULL auto_increment,	
codigocartao varchar (10) NOT NULL,
nome VARCHAR(100) NOT NULL,
datanascimento date NOT NULL,
numerodocumento VARCHAR(09) NOT NULL,
numerocpf VARCHAR (11) NOT NULL,
telefone VARCHAR(10) NOT NULL,
empresaVisitada VARCHAR(25) NOT NULL,
funcVisitado VARCHAR(25) NOT NULL,
tipoVisita VARCHAR (15),
CONSTRAINT pk_tbfuncionario PRIMARY KEY(id)
);
