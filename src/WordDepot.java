import java.sql.SQLException;
import java.util.*;

public class WordDepot {

    static int total = 0; // It keeps score for each attempt of the user.
    static String gamerName;

    public static void startGame() throws SQLException {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, String> dictionary = new LinkedHashMap<>(); //Word repository to be presented to the user
        dictionary.put("yuzmek", "yuzmek");
        dictionary.put("yazmak", "yazmak");
        dictionary.put("yemek", "yemek");
        dictionary.put("akilli", "akilli");
        dictionary.put("hizli", "hizli");
        dictionary.put("uzun", "uzun");
        dictionary.put("kisa", "kisa");
        dictionary.put("buyuk", "buyuk");
        dictionary.put("kucuk", "kucuk");
        dictionary.put("kirmizi", "kirmizi");
        dictionary.put("mavi", "mavi");
        dictionary.put("yesil", "yesil");
        dictionary.put("tatli", "tatli");
        dictionary.put("aci", "aci");
        dictionary.put("karsi", "karsi");
        dictionary.put("calismak", "calismak");
        dictionary.put("dinlenmek", "dinlenmek");
        dictionary.put("eglenceli", "eglenceli");
        dictionary.put("gulmek", "gulmek");
        dictionary.put("aglamak", "aglamak");
        dictionary.put("kalkmak", "kalkmak");
        dictionary.put("oturmak", "oturmak");
        dictionary.put("bakar", "bakar");
        dictionary.put("gormek", "gormek");
        dictionary.put("duymak", "duymak");
        dictionary.put("konusmak", "konusmak");
        dictionary.put("sevinç", "sevinç");
        dictionary.put("uzuntu", "uzuntu");
        dictionary.put("korku", "korku");
        dictionary.put("rahat", "rahat");
        dictionary.put("stres", "stres");
        dictionary.put("cesur", "cesur");
        dictionary.put("korkulu", "korkulu");
        dictionary.put("neseli", "neseli");
        dictionary.put("karanlik", "karanlik");
        dictionary.put("aydinlik", "aydinlik");
        dictionary.put("guvenli", "guvenli");
        dictionary.put("tehlikeli", "tehlikeli");
        dictionary.put("temiz", "temiz");
        dictionary.put("kirli", "kirli");
        dictionary.put("hafif", "hafif");
        dictionary.put("agir", "agir");
        dictionary.put("duzenli", "duzenli");
        dictionary.put("daginik", "daginik");
        dictionary.put("basit", "basit");
        dictionary.put("karmaşık", "karmaşik");
        dictionary.put("genis", "genis");
        dictionary.put("dar", "dar");
        dictionary.put("sert", "sert");
        dictionary.put("yumusak", "yumusak");
        dictionary.put("yavas", "yavas");
        dictionary.put("kısaca", "kısaca");
        dictionary.put("detayli", "detayli");
        dictionary.put("gec", "gec");
        dictionary.put("erken", "erken");
        dictionary.put("yeni", "yeni");
        dictionary.put("eski", "eski");
        dictionary.put("dogru", "dogru");
        dictionary.put("yanlis", "yanlis");
        dictionary.put("dikkatli", "dikkatli");
        dictionary.put("dikkatsiz", "dikkatsiz");
        dictionary.put("beklemek", "beklemek");
        dictionary.put("calistirmak", "calistirmak");
        dictionary.put("ozgur", "ozgur");
        dictionary.put("bagli", "bagli");
        dictionary.put("modern", "modern");
        dictionary.put("klasik", "klasik");
        dictionary.put("gelismis", "gelismis");
        dictionary.put("geri", "geri");
        dictionary.put("sirin", "sirin");
        dictionary.put("cirkin", "cirkin");
        dictionary.put("akilli", "akilli");
        dictionary.put("aptal", "aptal");
        dictionary.put("yeni", "yeni");
        dictionary.put("eski", "eski");
        dictionary.put("soguk", "soguk");
        dictionary.put("sicak", "sicak");
        dictionary.put("yakin", "yakin");
        dictionary.put("uzak", "uzak");
        dictionary.put("acik", "acik");
        dictionary.put("kapali", "kapali");
        dictionary.put("tembel", "tembel");
        dictionary.put("caliskan", "caliskan");
        dictionary.put("uyumlu", "uyumlu");
        dictionary.put("uyumsuz", "uyumsuz");
        dictionary.put("eglenceli", "eglenceli");
        dictionary.put("sikici", "sikici");
        dictionary.put("onemli", "onemli");
        dictionary.put("onemsiz", "onemsiz");
        dictionary.put("sevgili", "sevgili");
        dictionary.put("nefret", "nefret");
        dictionary.put("doga", "doga");
        dictionary.put("sehir", "sehir");
        dictionary.put("buyuk", "buyuk");
        dictionary.put("kucuk", "kucuk");
        dictionary.put("ekonomik", "ekonomik");
        dictionary.put("pahali", "pahali");
        dictionary.put("gunluk", "gunluk");
        dictionary.put("haftalik", "haftalik");
        dictionary.put("yil", "yil");
        dictionary.put("ay", "ay");
        dictionary.put("hafta", "hafta");
        dictionary.put("gun", "gun");
        dictionary.put("saat", "saat");
        dictionary.put("dakika", "dakika");
        dictionary.put("saniye", "saniye");
        dictionary.put("Armut","Armut");
        System.out.println("You have 60 seconds. Good luck :)");

        String[] keys = dictionary.keySet().toArray(new String[0]);

        long begin = System.currentTimeMillis();
        long second = 60000; // 1 min = 60000 millisecond

        while (System.currentTimeMillis() - begin < second) {
            String randomKey = keys[random.nextInt(keys.length)];
            System.out.println("Word: " + randomKey);
            String word = scan.nextLine();

            if (word.equalsIgnoreCase(dictionary.get(randomKey))) {
                total++;
            } else {}

        }
        System.out.println("Time is up... Score: " + total);
        System.out.print("Enter your Account Name: ");
        gamerName = scan.nextLine();
        DbHelper.scoreUpdate(gamerName,total);
        total = 0;
        MainMenu.StartScreen();
    }
}