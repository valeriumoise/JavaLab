package lab9;

import lab9.DAO.MovieController;
import lab9.DAO.PersonController;
import model.Actor;
import model.Director;
import model.Movie;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            PersonController persons = new PersonController();
            MovieController movies = new MovieController();

            Director director1 = new Director("Francis Ford Coppola", 1);
            Actor actor1 = new Actor("Al Pacino");
            Actor actor2 = new Actor("Marlon Brando");
            Movie movie1 = new Movie("The godfather");
            movie1.setDirector(director1);
            movie1.addActor(actor1);
            movie1.addActor(actor2);

            //persons.create("Francis Ford Coppola");
            persons.create(director1.getName());
            persons.create(actor2.getName());
            persons.create(actor1.getName());
            //Database.commit();

            movies.create(movie1.getName(), persons.findByName("Coppola"));
            //Database.commit();

            director1.getMovies(director1.getName());



            //Database.closeConnection();
        } catch (SQLException e) {
            System.err.println(e);
            //Database.rollback();
        }


    }
}
