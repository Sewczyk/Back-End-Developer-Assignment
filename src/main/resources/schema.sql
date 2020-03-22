create table if not exists notes(
    UUID UUID not null primary key,
    noteID int not null,
    title varchar(255) not null,
    content varchar(5000) not null,
    created smalldatetime,
    modified smalldatetime
);

insert into notes (UUID, noteID, title, content) values ('123e4567-e89b-12d3-a456-426655440000', 1 , 'welp', 'testmessage');