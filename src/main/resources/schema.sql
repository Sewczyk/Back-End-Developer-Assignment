create table if not exists notes(
    UUID UUID not null primary key,
    parentNote UUID,
    title varchar(255) not null,
    content varchar(5000) not null,
    created smalldatetime,
    modified smalldatetime
);

insert into notes(uuid, parentNote, title, content) values ('123e4567-e89b-12d3-a456-426655440000','00000000-0000-0000-0000-000000000000','val1','c1');
insert into notes(uuid, parentNote, title, content) values ('123e4567-e89b-12d3-a456-426655440001','00000000-0000-0000-0000-000000000000','val2','c2');