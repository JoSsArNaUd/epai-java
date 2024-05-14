CREATE DATABASE book_catalog DEFAULT CHARSET UTF8;

use book_catalog;

CREATE TABLE publisher (
    id BIGINT UNSIGNED NOT NULL,
    publisher_name VARCHAR(50),
    publisher_location VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE author (
    id BIGINT UNSIGNED NOT NULL,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE book (
    id BIGINT UNSIGNED NOT NULL,
    title VARCHAR(255),
    title_short VARCHAR(255),
    collection_title VARCHAR(255),
    publisher_id BIGINT UNSIGNED NOT NULL,
    edition VARCHAR(50),
    publication_year VARCHAR(4),
    language_code VARCHAR(3),
    number_of_pages INT,
    isbn VARCHAR(20),
    PRIMARY KEY (id),
    FOREIGN KEY (publisher_id) REFERENCES publisher(id)
);

CREATE TABLE book_author (
    book_id BIGINT UNSIGNED NOT NULL,
    author_id BIGINT UNSIGNED NOT NULL,
    author_position INT UNSIGNED NOT NULL,
    PRIMARY KEY (book_id, author_id),
    FOREIGN KEY (book_id) REFERENCES book(id),
    FOREIGN KEY (author_id) REFERENCES author(id)
);

CREATE VIEW simple_book
AS
SELECT 
    b.id, title, number_of_pages, publication_year, publisher_name, isbn, a.firstname as author_firstname, a.lastname as author_lastname FROM book as b
    INNER JOIN (SELECT * FROM book_author WHERE author_position = 1) as ab ON b.id = ab.book_id
    INNER JOIN author as a ON a.id = ab.author_id
    INNER JOIN publisher as p ON b.publisher_id = p.id ORDER BY b.id;
