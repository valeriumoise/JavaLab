package model;

import lab9.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MovieList {
    String title;
    ArrayList<Movie> movieList = new ArrayList<>();

    public MovieList(String title){
        this.title = title;
    }

    public void addMovie(Movie m){
        movieList.add(m);
    }

    public ArrayList<Movie> getList(){
        return movieList;
    }
    public String orderedMovies(int id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select name from movies where id like '" + id + "' order by id")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}
