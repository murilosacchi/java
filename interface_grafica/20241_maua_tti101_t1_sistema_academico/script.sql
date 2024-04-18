-- Active: 1713439417514@@mysql-1542a601-teladelogin.b.aivencloud.com@24374@defaultdb

-- 1. criar uma tabela
CREATE TABLE tb_usuario(
    cod_usuario INT PRIMARY KEY AUTO_INCREMENT,
    login VARCHAR(200) NOT NULL,
    senha VARCHAR(200) NOT NULL,
    tipo_usuario INT NOT NULL
);

-- 2. cadastrar dois usuarios
INSERT INTO tb_usuario
(login, senha, tipo_usuario)
VALUES
('admin', 'admin', 1),
('admin2', 'admin2', 1);

INSERT INTO tb_usuario
(login, senha, tipo_usuario)
VALUES
('comum', 'comum', 2);

-- 3. visualizar dados de usuario cadastrados
SELECT * FROM tb_usuario;

-- 4. atualizar dados de um usuario
UPDATE tb_usuario SET 
login = 'Admin', senha = '123456'
WHERE cod_usuario = 1;

-- 5. apagar um usuario
DELETE FROM tb_usuario WHERE cod_usuario = 3;

-- 6. adicionar uma coluna chamada ativa booleana, que indica que se o usuario esta ativo ou não, valor padrão true
ALTER TABLE tb_usuario ADD COLUMN ativo BOOLEAN DEFAULT TRUE;