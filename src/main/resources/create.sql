INSERT INTO questions (id, description, technology) VALUES
('a4ca54d1-3491-4382-8a78-129f3170b9b6', 'Como criar uma classe em Java?', 'Java'),
('29f74178-e7c5-450c-baea-a707a5d5d309', 'Explique o conceito de polimorfismo em Java', 'Java'),
('5dcaad09-b9d2-45c3-9107-84d2227d21dc', 'Como lidar com exceções em Java?', 'Java');

INSERT INTO alternatives (id, question_id, is_correct, description) VALUES
('36bc63d6-95fd-49c4-92ed-dbb18df1b42a', 'a4ca54d1-3491-4382-8a78-129f3170b9b6', true, 'Usando a palavra-chave "class"'),
('2900dd7e-4a62-4816-add7-722a6a2deeb9', 'a4ca54d1-3491-4382-8a78-129f3170b9b6', false, 'Definindo uma interface em Java'),
('a3b0edc5-1b85-42b8-b6b8-0412497ad0ad', 'a4ca54d1-3491-4382-8a78-129f3170b9b6', false, 'Utilizando métodos estáticos'),
('0981d37f-2174-450f-af70-7f9df5161ed1', 'a4ca54d1-3491-4382-8a78-129f3170b9b6', false, 'Criando um construtor padrão');

INSERT INTO alternatives (id, question_id, is_correct, description) VALUES
('1b024c33-960c-40ff-9575-876a291ffa21', '29f74178-e7c5-450c-baea-a707a5d5d309', false, 'Herança simples'),
('92e1f904-fca3-4407-9a29-b1f9a7b03411', '29f74178-e7c5-450c-baea-a707a5d5d309', false, 'Encapsulamento em Java'),
('74893b8b-48a6-424c-9cfa-277f992512bf', '29f74178-e7c5-450c-baea-a707a5d5d309', false, 'Sobrecarga de métodos'),
('0d53008a-10f6-49e5-b0a0-57eb83e6826a', '29f74178-e7c5-450c-baea-a707a5d5d309', true, 'Capacidade de um objeto de assumir várias formas');

INSERT INTO alternatives (id, question_id, is_correct, description) VALUES
('64ea849d-1ff3-44a8-b7d8-0d712d6cd689', '5dcaad09-b9d2-45c3-9107-84d2227d21dc', false, 'Ignorando a exceção'),
('0e5a7e6e-73ae-4027-b3b1-844cdb9eeec1', '5dcaad09-b9d2-45c3-9107-84d2227d21dc', true, 'Utilizando bloco try-catch'),
('c8e486e6-e1d1-43c4-986b-6b62736592af', '5dcaad09-b9d2-45c3-9107-84d2227d21dc', false, 'Declarando uma exceção sem tratamento'),
('10a6b943-3134-4c24-bc2a-864760727ace', '5dcaad09-b9d2-45c3-9107-84d2227d21dc', false, 'Usando a palavra-chave "finally"');