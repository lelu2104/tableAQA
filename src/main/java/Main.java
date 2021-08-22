import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/test2";
    static final String USER = "postgres";
    static final String PASS = "Alena160793";

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("No postgres driver");
            return;
        }

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = connection.createStatement();
        ) {
            ResultSet rs = statement.executeQuery("SELECT * FROM Accounts");

            while (rs.next()) {
                System.out.println(rs.getString("accountId") + " " + rs.getString("user_id")
                        + " " + rs.getString("balance_name") +  " " + rs.getString("currency_name"));
            }
        }catch (SQLException e) {
            System.out.println("Connection Failure");
            e.printStackTrace();
        }
    }
}





