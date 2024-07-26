import java.sql.*;
import java.util.Scanner;

public class DbHelper{
    static Scanner scan = new Scanner(System.in);
    private String userName = "";  //username gir
    private String password = "";  //veritabanı sifresi
    private String dbUrl ="";//DB adı

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }

    public static void oyuncuEkle() throws SQLException { //Yeni kullanıcı Ekle
        Connection conn = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try{
            conn = helper.getConnection();
            System.out.print("Ad ve Soyad Giriniz: ");
            String gamerName = scan.nextLine();
            System.out.print("Sifre Giriniz: ");
            String gamerPassword = scan.nextLine();
            String sql = "insert into oyuncu (Ad_Soyad, Sifre) values (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1,gamerName);
            statement.setString(2,gamerPassword);
            statement.executeUpdate();
            System.out.println("Kayit Eklendi: ");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            conn.close();
        }
    }

    public static void skorGuncelle(String gamerName, int yeniSkor) throws SQLException { //Kayıtlı kullanıcının skorunu güncelle
        Connection conn = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            conn = helper.getConnection();
            String sql = "UPDATE oyuncu SET skor = ? WHERE Ad_Soyad = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, yeniSkor);
            statement.setString(2, gamerName);
            statement.executeUpdate();

            System.out.println("Skor Güncellendi: ");
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