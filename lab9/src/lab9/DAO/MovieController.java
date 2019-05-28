package lab9.DAO;

import lab9.Database;
import model.Actor;

import java.sql.*;
import java.util.ArrayList;

public class MovieController {
    public void create(String name, int directorId) throws SQLException {
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement("insert into movies (name, director_id) values (?, ?)")) {
            pstmt.setString(1, name);
            pstmt.setInt(2, directorId);
            pstmt.executeUpdate();
            pstmt.close();
            Database.commit();
        }
    }
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select id from movies where name like '" + name + "'")) {
            stmt.close();
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    public String findById(int id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select name from movies where id like '" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }

    public String findByDirector(int directorId) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select name from movies where director_id like '" + directorId + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }

    public ResultSet findAll() throws SQLException{
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from movies")){
            return rs;
        }
    }


}
