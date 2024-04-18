-- Wstawianie przykładowych autorów
INSERT INTO author (id, name) VALUES (1, 'John Doe');
INSERT INTO author (id, name) VALUES (2, 'Jane Smith');
INSERT INTO author (id, name) VALUES (3, 'Jane Smith3');
INSERT INTO author (id, name) VALUES (4, 'Jane Smith4');
INSERT INTO author (id, name) VALUES (5, 'Jane Smith5');

-- Wstawianie przykładowych książek dla autora 1
INSERT INTO book (id, title, author_id) VALUES (1, 'Book 1', 1);
INSERT INTO book (id, title, author_id) VALUES (2, 'Book 2', 1);
INSERT INTO book (id, title, author_id) VALUES (3, 'Book 3', 1);
INSERT INTO book (id, title, author_id) VALUES (4, 'Book 4', 1);

-- Wstawianie przykładowych książek dla autora 2
INSERT INTO book (id, title, author_id) VALUES (5, 'Book 5', 2);
INSERT INTO book (id, title, author_id) VALUES (6, 'Book 6', 2);
INSERT INTO book (id, title, author_id) VALUES (7, 'Book 7', 2);
INSERT INTO book (id, title, author_id) VALUES (8, 'Book 8', 2);