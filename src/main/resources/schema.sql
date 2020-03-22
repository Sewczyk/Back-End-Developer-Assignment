create table if not exists notes(
    UUID UUID not null primary key,
    noteID int not null,
    title varchar(255) not null,
    content varchar(5000) not null,
    created smalldatetime,
    modified smalldatetime
);