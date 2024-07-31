import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {

    public static void StartScreen() throws SQLException {
        Scanner scan = new Scanner(System.in);
        boolean control = false;
        String choose;
        String screen = "======= Welcome To 10Finger Application =======\n"+
                "\t\t(a) Click to Add Account\n"+
                "\t\t(y) Click to Add Start Without Account\n"+
                "\t\t(q) Click to Quit";

        System.out.println(screen);
        while(!control){
            choose = scan.nextLine();
            switch(choose){
                case "a":
                    DbHelper.addGamer();
                    WordDepot.startGame();
                case "y":
                    WordDepot.startGame();
                    break;
                case "Q":
                case "q":
                    System.out.println("bye, the program is exiting");
                    control = true;
                    break;
                default:
                    System.out.println("Make a proper keystroke");
            }
        }
    }
}