import java.sql.*;
import java.util.Scanner;

public class DbHelper{
    static Scanner scan = new Scanner(System.in);
    private String userName = "";  //username
    private String password = "";  //DB Passpword
    private String dbUrl ="";//DB url

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }

    public static void addGamer() throws SQLException { //Add new user
        Connection conn = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try{
            conn = helper.getConnection();
            System.out.print("Name: ");
            String gamerName = scan.nextLine();
            System.out.print("Password: ");
            String gamerPassword = scan.nextLine();
            String sql = "insert into oyuncu (Ad_Soyad, Sifre) values (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1,gamerName);
            statement.setString(2,gamerPassword);
            statement.executeUpdate();
            System.out.println("Person Added");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            conn.close();
        }
    }

    public static void scoreUpdate(String gamerName, int newScore) throws SQLException { //Update registered user's score
        Connection conn = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            conn = helper.getConnection();
            String sql = "UPDATE oyuncu SET skor = ? WHERE Ad_Soyad = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, newScore);
            statement.setString(2, gamerName);
            statement.executeUpdate();

            System.out.println("Score Updated");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}