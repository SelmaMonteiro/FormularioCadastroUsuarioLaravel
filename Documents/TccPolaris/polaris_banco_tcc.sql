
CREATE DATABASE polaris;
USE polaris;

-- Tabela Pessoa
CREATE TABLE pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(100) NOT NULL,
    data_nascimento DATE
);

-- Tabela Registro
CREATE TABLE registro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pessoa INT NOT NULL,
    data DATE NOT NULL,
    humor VARCHAR(50),
    sono DECIMAL(4,2),
    atividade VARCHAR(100),
    tempo_tela INT,
    observacoes TEXT,
    FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
);

-- Tabela Relatório
CREATE TABLE relatorio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pessoa INT NOT NULL,
    data_envio DATE NOT NULL,
    conteudo TEXT,
    destinatario VARCHAR(100),
    FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
);
