drop table persons;
/
drop table movies;
/
drop table movie_actos;
/

create table persons(
    id integer generated always as identity (start with 1 increment by 1) not null,
    name varchar2(100) not null,
    constraint "pk1" primary key (id)
)
/

create table movies(
    id integer generated always as identity (start with 1 increment by 1) not null,
    name varchar2(100) not null,
    director_id integer not null,
    constraint "fk1" foreign key (director_id) references persons on delete cascade,
    constraint "pk2" primary key (id)
    )
/

create table movie_actors(
    movie_id integer not null,
    actor_id integer not null,
    constraint "fk2" foreign key (movie_id) references movies(id) on delete cascade,
    constraint "fk3" foreign key (actor_id) references persons(id) on delete cascade,
    constraint "pk3" primary key (movie_id, actor_id) 
)
/
commit;


select * from persons;



