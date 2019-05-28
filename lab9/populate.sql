insert into persons (name) values ('Al Pacino');
insert into persons (name) values ('Marlon Brando');

insert into movies(name, director_id) values ('The godfather', 1);

insert into movie_actors(movie_id, actor_id) values (1, 2);
insert into movie_actors(movie_id, actor_id) values (1, 3);

select * from movie_actors;
select * from persons;
select * from movies;