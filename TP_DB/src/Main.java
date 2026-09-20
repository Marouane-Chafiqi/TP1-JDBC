//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/atelier";
        String user = "root";
        String password = "2004";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM clients");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nom"));
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}