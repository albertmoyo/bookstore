DROP TABLE IF EXISTS book CASCADE;
CREATE TABLE book
(
    book_id      serial PRIMARY KEY NOT NULL,
    title           character varying,
    year            INTEGER,
    price           DECIMAL


);


DROP TABLE IF EXISTS author CASCADE;
CREATE TABLE author
(
    author_id          serial PRIMARY KEY NOT NULL,
    name          character varying  NOT NULL

);

DROP TABLE IF EXISTS book_author CASCADE;
CREATE TABLE book_author
(
  book_id INTEGER,
  author_id INTEGER,

  CONSTRAINT fk_bookId foreign key (book_id) references book(book_id),
  CONSTRAINT fk_authorId foreign key (author_id) references author(author_id)
);

insert into book
values (1, 'Learning Java', 2018, 500),
       (2, 'Fundamentals of Programming',2017, 450),
       (3, 'Learning English', 2015, 250);


insert into author
values (1, 'James K. Jackson'),
       (2, 'Carlton V. Capps'),
       (3, 'Jack Y. Johnson');


insert into book_author
values (1, 3),
       (1, 1),
       (3, 3);
