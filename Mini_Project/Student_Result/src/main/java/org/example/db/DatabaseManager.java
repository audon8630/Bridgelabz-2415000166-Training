package org.example.db;

import org.example.model.Student;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager {

    private final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private final String USER = "root";
    private final String PASS = "audon@8630";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public void addStudent(Student s) {
        try (Connection con = connect()) {
            String q = "INSERT INTO students(name, course, marks) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setInt(3, s.getMarks());
            ps.executeUpdate();
            System.out.println("Student Added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> list = new ArrayList<>();
        try (Connection con = connect()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("course"),
                        rs.getInt("marks")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void updateMarks(int id, int marks) {
        try (Connection con = connect()) {
            String q = "UPDATE students SET marks=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, marks);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Marks Updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        try (Connection con = connect()) {
            String q = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student Deleted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
