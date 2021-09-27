CREATE DATABASE cardapio;

USE cardapio;

CREATE TABLE categorias (
	id_categoria INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(20),
    url_imagem VARCHAR(250)
);

CREATE TABLE produtos (
	id_produto INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    descricao VARCHAR(300),
    imagem VARCHAR(250),
    valor DECIMAL(5,2),
    id_categoria INT,
    CONSTRAINT fk_produtos_categoria
    FOREIGN KEY (id_categoria)
    REFERENCES categorias(id_categoria)
);


CREATE TABLE clientes (
	id_cliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    sobrenome VARCHAR(100),
    cpf CHAR(11),
    nrCelular CHAR(15),
    email VARCHAR(150)
);

CREATE TABLE pedidos (
	id_pedidos INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    qualidade INT,
    precoTotal DECIMAL (7,2),
    id_produto INT,
    id_cliente INT,
    CONSTRAINT fk_pedidos_produto
    FOREIGN KEY (id_produto)
    REFERENCES produtos(id_produto),
    CONSTRAINT fk_pedidos_cliente
    FOREIGN KEY (id_cliente)
    REFERENCES clientes(id_cliente)
);

CREATE TABLE vendas (
	id_venda INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    data_atual DATE,
    hora_atual TIME,
    Total DECIMAL (7,2),
    id_pedido INT,
    CONSTRAINT fk_venda_pedido
    FOREIGN KEY (id_pedido)
    REFERENCES pedidos(id_pedidos)
);


