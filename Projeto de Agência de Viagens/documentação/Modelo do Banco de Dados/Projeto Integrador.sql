DROP DATABASE novos_horizontes;

CREATE DATABASE novos_horizontes;
USE novos_horizontes;

CREATE TABLE cliente (
    cod_cliente INT PRIMARY KEY auto_increment,
    CPF CHAR(11),
    nome VARCHAR(255),
    endereco VARCHAR(255),
    telefone varchar(255),
    email varchar(255),
    data_nasc date,
    sexo varchar(1)
);

CREATE TABLE cidade (
    cod_cidade INT PRIMARY KEY auto_increment,
    nome_cidade VARCHAR(255),
    coordenadas VARCHAR(30)
);

CREATE TABLE pontos_turisticos (
    cod_turismo INT PRIMARY KEY auto_increment,
    endereco VARCHAR(255),
    nome_turistico VARCHAR(255),
    classificacao_turistico INT,
    horario_funcionamento VARCHAR(50),
    cod_cidade INT,
    FOREIGN KEY (cod_cidade) REFERENCES cidade(cod_cidade) ON DELETE CASCADE
);

CREATE TABLE hotel (
    cod_hotel INT PRIMARY KEY auto_increment,
    endereco VARCHAR(255),
    nome_hotel VARCHAR(255),
    classificacao_hotel VARCHAR(10),
    check_in time,
    check_out time,
    descricao_geral MEDIUMTEXT,
    cod_cidade INT,
    FOREIGN KEY (cod_cidade) REFERENCES cidade(cod_cidade)
);

CREATE TABLE tipo_hosp (
    num_tipo INT PRIMARY KEY auto_increment,
    quant_camas INT,
    nivel_qualidade VARCHAR(255)
);

CREATE TABLE hospedagem (
    cod_hospedagem INT PRIMARY KEY auto_increment,
    num_quarto INT,
    preco_quarto DECIMAL(10,2),
    num_tipo INT,
    cod_hotel INT,
    FOREIGN KEY (num_tipo) REFERENCES tipo_hosp(num_tipo),
    FOREIGN KEY (cod_hotel) REFERENCES hotel(cod_hotel)
);

CREATE TABLE passagem (
    num_bilhete INT PRIMARY KEY auto_increment,
    preco DECIMAL(10,2),
    data_compra DATE,
    data_ida DATE,
    data_volta DATE,
    cod_cliente int,
    cidade_embarque int,
    cidade_desembarque int,
    peso_da_bagagem int,
    FOREIGN KEY(cod_cliente) references cliente(cod_cliente),
    FOREIGN KEY (cidade_embarque) REFERENCES cidade(cod_cidade),
    FOREIGN KEY (cidade_desembarque) REFERENCES cidade(cod_cidade)
);

CREATE TABLE voo (
    cod_voo INT PRIMARY KEY auto_increment,
    prefixo_voo VARCHAR(255),
    companhia_aerea VARCHAR(255),
    data_hora_embarque DATETIME,
    data_hora_desembarque DATETIME,
    cidade_embarque int,
    cidade_desembarque int,
    aviao varchar(255),
    FOREIGN KEY (cidade_embarque) REFERENCES cidade(cod_cidade) ON DELETE CASCADE,
    FOREIGN KEY (cidade_desembarque) REFERENCES cidade(cod_cidade) ON DELETE CASCADE
);

create table escala_voo (
    cod_escala integer not null auto_increment primary key,
    cod_voo integer not null,
    num_bilhete integer not null,
    numero_assento varchar(3) not null,
    foreign key(cod_voo) references voo(cod_voo),
    foreign key(num_bilhete) references passagem(num_bilhete)
);

CREATE TABLE hosp_cliente (
    cod_cliente_hospedagem INT PRIMARY KEY auto_increment,
    valor_pago DECIMAL(10,2),
    data_inicio DATE,
    data_termino DATE,
    qted_dependentes INT,
    cod_cliente INT,
    cod_hospedagem INT,
    FOREIGN KEY (cod_cliente) REFERENCES cliente(cod_cliente),
    FOREIGN KEY (cod_hospedagem) REFERENCES hospedagem(cod_hospedagem)
);


INSERT INTO cliente (CPF, nome, endereco, telefone, email, data_nasc, sexo) VALUES
('12345678900', 'João Silva', 'Rua 15 de Novembro, 123, São Paulo - SP', '11987654321', 'joao.silva@gmail.com', '1985-01-15', 'M'),
('98765432100', 'Maria Oliveira', 'Avenida Atlântica, 456, Rio de Janeiro - RJ', '21987654321', 'maria.oliveira@gmail.com', '1990-02-20', 'F'),
('11122233344', 'Carlos Souza', 'Avenida Afonso Pena, 789, Belo Horizonte - MG', '31987654321', 'carlos.souza@gmail.com', '1975-03-30', 'M'),
('22233344455', 'Ana Santos', 'Rua XV de Novembro, 101, Curitiba - PR', '41987654321', 'ana.santos@gmail.com', '1988-04-10', 'F'),
('33344455566', 'Fernanda Costa', 'Rua Gonçalo de Carvalho, 202, Porto Alegre - RS', '51987654321', 'fernanda.costa@gmail.com', '1980-05-05', 'F'),
('44455566677', 'Roberto Lima', 'Avenida Sete, 303, Salvador - BA', '71987654321', 'roberto.lima@hotmail.com', '1972-06-25', 'M'),
('55566677788', 'Patricia Almeida', 'Avenida Beira Rio, 404, Recife - PE', '81987654321', 'patricia.almeida@hotmail.com', '1995-07-07', 'F'),
('66677788899', 'Ricardo Martins', 'Avenida Beira Mar, 505, Fortaleza - CE', '91987654321', 'ricardo.martins@hotmail.com', '1983-08-08', 'M'),
('77788899900', 'Juliana Ferreira', 'Avenida Belém-Brasília, 606, Brasília - DF', '61987654321', 'juliana.ferreira@hotmail.com', '1991-09-15', 'F'),
('88899900011', 'Fernando Barbosa', 'Avenida Eduardo Ribeiro, 707, Manaus - AM', '92987654321', 'fernando.barbosa@hotmail.com', '1987-10-18', 'M');

INSERT INTO cidade (nome_cidade, coordenadas) VALUES
('Rio de Janeiro', '-22.9068, -43.1729'),
('Belo Horizonte', '-19.9167, -43.9345'),
('Curitiba', '-25.4284, -49.2733'),
('Porto Alegre', '-30.0346, -51.2177'),
('Salvador', '-12.9714, -38.5014'),
('Recife', '-8.0476, -34.8776'),
('Fortaleza', '-3.7172, -38.5433'),
('Brasília', '-15.7801, -47.9292'),
('Manaus', '-3.1190, -60.0217'),
('São Paulo', '-23.5505, -46.6333');

INSERT INTO pontos_turisticos (endereco, nome_turistico, classificacao_turistico, horario_funcionamento, cod_cidade) VALUES
('Praia de Copacabana, 100, Rio de Janeiro - RJ', 'Cristo Redentor', 5, '08:00 - 19:00', 1),
('Av. Afonso Pena, 500, Belo Horizonte - MG', 'Museu das Minas e do Metal', 4, '09:00 - 17:00', 2),
('Rua XV de Novembro, 300, Curitiba - PR', 'Jardim Botânico', 4, '08:00 - 18:00', 3),
('Rua dos Andradas, 1000, Porto Alegre - RS', 'Fundação Ibere Camargo', 5, '10:00 - 21:00', 4),
('Av. Sete de Setembro, 2000, Salvador - BA', 'Pelourinho', 5, '24 horas', 5),
('Rua da Aurora, 500, Recife - PE', 'Instituto Ricardo Brennand', 4, '09:00 - 17:00', 6),
('Av. Beira Mar, 1000, Fortaleza - CE', 'Praia do Futuro', 4, '24 horas', 7),
('SBS, Quadra 2, Bloco I, Brasília - DF', 'Catedral de Brasília', 5, '09:00 - 17:00', 8),
('Av. Getúlio Vargas, 100, Manaus - AM', 'Teatro Amazonas', 5, '09:00 - 17:00', 9),
('Av. Paulista, 1000, São Paulo - SP', 'Museu de São Paulo', 5, '10:00 - 18:00', 10);

INSERT INTO hotel (endereco, nome_hotel, classificacao_hotel, check_in, check_out, descricao_geral, cod_cidade) VALUES
('Praia de Copacabana, 200, Rio de Janeiro - RJ', 'Hotel Copacabana', '4 estrelas', '8:00:00', '12:00:00', 'Hotel com vista para a praia de Copacabana.', 1),
('Av. Afonso Pena, 500, Belo Horizonte - MG', 'Hotel Afonso Pena', '3 estrelas', '7:00:00', '11:00:00', 'Hotel confortável e bem localizado.', 2),
('Rua XV de Novembro, 300, Curitiba - PR', 'Hotel XV', '4 estrelas', '8:00:00', '15:00:00', 'Hotel moderno em Curitiba.', 3),
('Rua dos Andradas, 1000, Porto Alegre - RS', 'Hotel Andradas', '3 estrelas', '11:00:00', '13:00:00', 'Hotel acolhedor e bem situado.', 4),
('Av. Sete de Setembro, 2000, Salvador - BA', 'Hotel Sete', '5 estrelas', '8:00:00', '12:00:00', 'Hotel sofisticado em Salvador.', 5),
('Rua da Aurora, 500, Recife - PE', 'Hotel Aurora', '4 estrelas', '8:00:00', '12:00:00', 'Hotel perto do centro de Recife.', 6),
('Av. Beira Mar, 1000, Fortaleza - CE', 'Hotel Beira Mar', '3 estrelas', '8:00:00', '12:00:00', 'Hotel com vista para o mar em Fortaleza.', 7),
('SBS, Quadra 2, Bloco I, Brasília - DF', 'Hotel Brasília', '5 estrelas', '8:00:00', '12:00:00', 'Hotel de luxo em Brasília.', 8),
('Av. Eduardo Ribeiro, 500, Manaus - AM', 'Hotel Manaus', '4 estrelas', '8:00:00', '12:00:00', 'Hotel elegante em Manaus.', 9),
('Av. Paulista, 1000, São Paulo - SP', 'Hotel Paulista', '5 estrelas', '8:00:00', '12:00:00', 'Hotel luxuoso no coração de São Paulo.', 10);

INSERT INTO tipo_hosp (quant_camas, nivel_qualidade) VALUES
(1, 'Standard'),
(2, 'Superior'),
(3, 'Deluxe'),
(4, 'Suite'),
(2, 'Suite Presidencial');

INSERT INTO hospedagem (num_quarto, preco_quarto, num_tipo, cod_hotel) VALUES
( 101, 500.00, 1, 1),
( 202, 600.00, 2, 2),
( 303, 700.00, 3, 3),
( 404, 400.00, 4, 4),
( 505, 800.00, 2, 5),
( 606, 950.00, 3, 6),
( 707, 1100.00, 4, 7),
( 808, 700.00, 1, 8),
( 909, 1300.00, 3, 9),
( 1010, 1500.00, 4, 10);

INSERT INTO passagem (preco, data_compra, data_ida, data_volta, cod_cliente, cidade_embarque, cidade_desembarque,peso_da_bagagem) VALUES
(500, '2024-07-09','2024-08-01', '2024-08-07',10, 10, 1,20),
(550, '2024-07-09','2024-08-02', '2024-08-08',10, 1,2,20),
(600, '2024-07-09','2024-08-03', '2024-08-09',10, 2,3,20),
(650, '2024-07-09','2024-08-04', '2024-08-10',10, 3,4,20),
(700, '2024-07-09','2024-08-05', '2024-08-11',10, 4,5,20),
(750, '2024-07-09','2024-08-06', '2024-08-12',10, 5,6,20),
(800, '2024-07-09','2024-08-07', '2024-08-13',10, 6,7,20),
(850, '2024-07-09','2024-08-08', '2024-08-14',10, 7,8,20),
(900, '2024-07-09','2024-08-09', '2024-08-15',10, 8,9,20),
(950, '2024-07-09','2024-08-10', '2024-08-16',10, 9,10,20);

INSERT INTO voo (prefixo_voo,companhia_aerea, data_hora_embarque, data_hora_desembarque, cidade_embarque, cidade_desembarque,aviao) VALUES
('G31234', 'Gol Linhas Aéreas', '2024-08-01 10:00:00', '2024-08-01 12:00:00', 10,1,'Boeing 737 700'),
('LA4567', 'Latam', '2024-08-02 11:00:00', '2024-08-02 13:00:00', 1,2,'Airbus A320'),
('AZU1234', 'Azul', '2024-08-03 09:00:00', '2024-08-03 11:00:00', 2,3,'Boeing 737 Max'),
('2Z1234', 'Passaredo', '2024-08-04 08:00:00', '2024-08-04 10:00:00', 3,4,'Airbus A319'),
('LA1234', 'LAtam', '2024-08-05 07:00:00', '2024-08-05 09:00:00', 4,5,'Boeing 737 800'),
('G35678', 'Gol Linhas Aéreas', '2024-08-06 06:00:00', '2024-08-06 08:00:00', 5,6,'Airbus A320'),
('G30345', 'Gol Linhas Aéreas', '2024-08-07 15:00:00', '2024-08-07 17:00:00', 6,7,'Boeing 737 700'),
('AZU3569', 'Azul', '2024-08-08 14:00:00', '2024-08-08 16:00:00', 7,8,'Airbus A320'),
('2Z5678', 'Passaredo', '2024-08-09 13:00:00', '2024-08-09 15:00:00', 8,9,'Airbus A320'),
('AZU4421', 'Azul', '2024-08-10 12:00:00', '2024-08-10 14:00:00', 9,10,'Airbus A320');

INSERT INTO escala_voo (cod_voo,num_bilhete,numero_assento) VALUES
(1,1,'20F'),
(2,2,'3A');

INSERT INTO hosp_cliente (valor_pago, data_inicio, data_termino, qted_dependentes, cod_cliente, cod_hospedagem) VALUES
(1200, '2024-08-01', '2024-08-07', 0, 1, 1),
(1080, '2024-08-02', '2024-08-08', 1, 2, 2),
(900, '2024-08-03', '2024-08-09', 2, 3, 3),
(1020, '2024-08-04', '2024-08-10', 1, 4, 4),
(960, '2024-08-05', '2024-08-11', 0, 5, 5),
(1250, '2024-08-06', '2024-08-12', 0, 6, 6),
(1100, '2024-08-07', '2024-08-13', 1, 7, 7),
(940, '2024-08-08', '2024-08-14', 2, 8, 8),
(1204, '2024-08-09', '2024-08-15', 1, 9, 9),
(980, '2024-08-10', '2024-08-16', 0, 10, 10);

