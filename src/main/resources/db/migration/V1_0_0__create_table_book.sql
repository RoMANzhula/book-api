CREATE TABLE book (
    book_id VARCHAR(40) PRIMARY KEY NOT NULL,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    publication_date DATE NOT NULL,
    registr_date TIMESTAMP(6) NOT NULL
);