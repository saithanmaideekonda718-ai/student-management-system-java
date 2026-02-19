import java.sql.*;

public class StudentDAO {

    public void addStudent(Student s) {
        String query = "INSERT INTO students VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, s.getId());
            pst.setString(2, s.getName());
            pst.setString(3, s.getBranch());
            pst.setDouble(4, s.getMarks());

            pst.executeUpdate();
            System.out.println("Student added successfully!");

        } catch (Exception e) {
            System.out.println("Error adding student.");
            e.printStackTrace();
        }
    }

    public void viewStudents() {
        String query = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("branch") + " | " +
                        rs.getDouble("marks")
                );
            }

        } catch (Exception e) {
            System.out.println("Error fetching students.");
            e.printStackTrace();
        }
    }

    public void searchStudent(int id) {
        String query = "SELECT * FROM students WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("branch") + " | " +
                        rs.getDouble("marks")
                );
            } else {
                System.out.println("Student not found.");
            }

        } catch (Exception e) {
            System.out.println("Error searching student.");
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, double marks) {
        String query = "UPDATE students SET marks=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setDouble(1, marks);
            pst.setInt(2, id);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (Exception e) {
            System.out.println("Error updating student.");
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, id);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (Exception e) {
            System.out.println("Error deleting student.");
            e.printStackTrace();
        }
    }
}
