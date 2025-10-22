import java.sql.*;

public class Database {
    private Connection connection;

    public Database()throws SQLException{
        String url= "jdbc:sqlite:database/sushi.db";
        connection = DriverManager.getConnection(url);
        System.out.println("Database connection ");



    }

    public String selectAll() {
        String result = "";
        try {
            if(connection==null|| !connection.isValid(5)){

                System.err.println("Database connection is null");
                return null;
            }
        } catch (SQLException e) {
            System.err.println("Database connection is null");
            return null;
        }
        String query = "SELECT * FROM menu";
        PreparedStatement statement= connection.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            result+=rs.getString("id");
            result+=rs.getString("piatto");
            result+=rs.getString("prezzo");
            result+=rs.getString("quantita");

        }

        return result;
    }
}
