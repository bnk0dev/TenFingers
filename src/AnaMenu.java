import java.sql.SQLException;
import java.util.Scanner;

public class AnaMenu {

    public static void giris() throws SQLException {
        Scanner scan = new Scanner(System.in);
        boolean kontrol = false;
        String secim;
        String ekran = "======= 10Finger Uygulamasına HosGeldiniz =======\n"+
                "\t\t(a) Hesap Eklemek Icin Basiniz\n"+
                "\t\t(y) Baslamak Icin Basiniz\n"+
                "\t\t(q) Cikis Icin Basiniz";

        System.out.println(ekran);
        while(!kontrol){
            secim = scan.nextLine();
            switch(secim){
                case "a":
                    DbHelper.oyuncuEkle();
                case "y":
                    KelimeDepo.oyunBasla();
                    break;
                case "Q":
                case "q":
                    System.out.println("Tekrar Bekleriz. Programdan Cikiliyor.");
                    kontrol = true;
                    break;
                default:
                    System.out.println("Duzgun Bir Tuslama Yapiliniz");
            }
        }


    }
}