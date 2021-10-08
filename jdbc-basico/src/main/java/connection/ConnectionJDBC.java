package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) throws SQLException {
       String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        //Connection connection = null;
        try (Connection connection = DriverManager.getConnection(urlConnection, "root", "root")) {
            System.out.println("Conexao com sucesso");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Falha");
        }

    }
}
