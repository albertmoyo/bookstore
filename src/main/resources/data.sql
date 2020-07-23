DROP TABLE IF EXISTS book CASCADE;
CREATE TABLE book
(
    bookId      serial PRIMARY KEY NOT NULL,
    title           character varying,
    year            INTEGER,
    price           DECIMAL


);


DROP TABLE IF EXISTS author CASCADE;
CREATE TABLE author
(
    authorId          serial PRIMARY KEY NOT NULL,
    name          character varying  NOT NULL

);

DROP TABLE IF EXISTS bookAuthor CASCADE;
CREATE TABLE bookAuthor
(

  bookAuthorId   serial PRIMARY KEY NOT NULL,
  bookId INTEGER,
  authorId INTEGER,

  CONSTRAINT fk_bookId foreign key (bookId) references book(bookId),
  CONSTRAINT fk_authorId foreign key (authorId) references author(authorId)



);

insert into book
values (1, 'Learning Java', 2018, 500),
       (2, 'Fundamentals of Programming',2017, 450),
       (3, 'Learning English', 2015, 250);


insert into author
values (1, 'James K. Jackson'),
       (2, 'Carlton V. Capps'),
       (3, 'Jack Y. Johnson');


insert into bookAuthor
values (1, 1, 3),
       (2,  1, 1),
       (3, 3, 3);



