import java.sql.*;

import static org.postgresql.jdbc.EscapedFunctions.INSERT;

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

        String selectRequest = "INSERT INTO accounts (accountId, userId, balace, currency) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = connection.createStatement();
             PreparedStatement preparedStatement = connection.prepareStatement(selectRequest)
        ) {
            ResultSet rs = statement.executeQuery("SELECT * FROM Accounts");

            while (rs.next()) {
                System.out.println(rs.getString("accountId") + " " + rs.getString("user_id")
                        + " " + rs.getString("balance_name") +  " " + rs.getString("currency_name"));
            }

            System.out.println("Insert new account");
            int userId = 1;
            int accountId = 1;
            int balance = 500;
            String currency = "EUR";

            preparedStatement.setInt(1, userId);
            preparedStatement.setInt(2, accountId);
            preparedStatement.setInt(3, balance);
            preparedStatement.setString(4, currency);

            preparedStatement.executeUpdate();

        }catch (SQLException e) {
            System.out.println("Connection Failure");
            e.printStackTrace();
        }
    }
}