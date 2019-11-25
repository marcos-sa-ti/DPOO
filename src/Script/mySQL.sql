create database controleacesso;

use controleacesso;

CREATE TABLE funcionario
(
id BIGINT NOT NULL auto_increment,	
codigocartao varchar (10) NOT NULL,
nome VARCHAR(100) NOT NULL,
datanascimento date NOT NULL,
numerodocumero VARCHAR(09) NOT NULL,
numerocpf VARCHAR (11) NOT NULL,
telefone VARCHAR(10) NOT NULL,
cargo VARCHAR (20)NOT NULL,
setor VARCHAR (20) NOT NULL,
empresa VARCHAR (30) NOT NULL,
horaE timestamp NOT NULL,
horaS timestamp,
CONSTRAINT pk_tbcliente PRIMARY KEY(id)
);

// TESTE 
CREATE TABLE funcionario
(
id BIGINT NOT NULL auto_increment,	
nome VARCHAR(100) NOT NULL,
numerodocumero VARCHAR(09) NOT NULL,
numerocpf VARCHAR (11) NOT NULL,
telefone VARCHAR(10) NOT NULL,
cargo VARCHAR (20)NOT NULL,
setor VARCHAR (20) NOT NULL,
empresa VARCHAR (30) NOT NULL,
CONSTRAINT pk_tbcliente PRIMARY KEY(id)
);

