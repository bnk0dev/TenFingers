import java.sql.SQLException;
import java.util.*;

public class KelimeDepo {

    static int toplam = 0; // Kullanıcının Her denemesinde skor tutar.
    static String gamerName; //Kayıtlı kullanıcı tekrar oynadıgında skorunu güncellemesi icin ismini girmelidir.

    public static void oyunBasla() throws SQLException {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, String> sozluk = new LinkedHashMap<>(); //Yazılması istenen bir çok kelime.
        sozluk.put("yuzmek", "yuzmek");
        sozluk.put("yazmak", "yazmak");
        sozluk.put("yemek", "yemek");
        sozluk.put("akilli", "akilli");
        sozluk.put("hizli", "hizli");
        sozluk.put("uzun", "uzun");
        sozluk.put("kisa", "kisa");
        sozluk.put("buyuk", "buyuk");
        sozluk.put("kucuk", "kucuk");
        sozluk.put("kirmizi", "kirmizi");
        sozluk.put("mavi", "mavi");
        sozluk.put("yesil", "yesil");
        sozluk.put("tatli", "tatli");
        sozluk.put("aci", "aci");
        sozluk.put("karsi", "karsi");
        sozluk.put("calismak", "calismak");
        sozluk.put("dinlenmek", "dinlenmek");
        sozluk.put("eglenceli", "eglenceli");
        sozluk.put("gulmek", "gulmek");
        sozluk.put("aglamak", "aglamak");
        sozluk.put("kalkmak", "kalkmak");
        sozluk.put("oturmak", "oturmak");
        sozluk.put("bakar", "bakar");
        sozluk.put("gormek", "gormek");
        sozluk.put("duymak", "duymak");
        sozluk.put("konusmak", "konusmak");
        sozluk.put("sevinç", "sevinç");
        sozluk.put("uzuntu", "uzuntu");
        sozluk.put("korku", "korku");
        sozluk.put("rahat", "rahat");
        sozluk.put("stres", "stres");
        sozluk.put("cesur", "cesur");
        sozluk.put("korkulu", "korkulu");
        sozluk.put("neseli", "neseli");
        sozluk.put("karanlik", "karanlik");
        sozluk.put("aydinlik", "aydinlik");
        sozluk.put("guvenli", "guvenli");
        sozluk.put("tehlikeli", "tehlikeli");
        sozluk.put("temiz", "temiz");
        sozluk.put("kirli", "kirli");
        sozluk.put("hafif", "hafif");
        sozluk.put("agir", "agir");
        sozluk.put("duzenli", "duzenli");
        sozluk.put("daginik", "daginik");
        sozluk.put("basit", "basit");
        sozluk.put("karmaşık", "karmaşik");
        sozluk.put("genis", "genis");
        sozluk.put("dar", "dar");
        sozluk.put("sert", "sert");
        sozluk.put("yumusak", "yumusak");
        sozluk.put("yavas", "yavas");
        sozluk.put("kısaca", "kısaca");
        sozluk.put("detayli", "detayli");
        sozluk.put("gec", "gec");
        sozluk.put("erken", "erken");
        sozluk.put("yeni", "yeni");
        sozluk.put("eski", "eski");
        sozluk.put("dogru", "dogru");
        sozluk.put("yanlis", "yanlis");
        sozluk.put("dikkatli", "dikkatli");
        sozluk.put("dikkatsiz", "dikkatsiz");
        sozluk.put("beklemek", "beklemek");
        sozluk.put("calistirmak", "calistirmak");
        sozluk.put("ozgur", "ozgur");
        sozluk.put("bagli", "bagli");
        sozluk.put("modern", "modern");
        sozluk.put("klasik", "klasik");
        sozluk.put("gelismis", "gelismis");
        sozluk.put("geri", "geri");
        sozluk.put("sirin", "sirin");
        sozluk.put("cirkin", "cirkin");
        sozluk.put("akilli", "akilli");
        sozluk.put("aptal", "aptal");
        sozluk.put("yeni", "yeni");
        sozluk.put("eski", "eski");
        sozluk.put("soguk", "soguk");
        sozluk.put("sicak", "sicak");
        sozluk.put("yakin", "yakin");
        sozluk.put("uzak", "uzak");
        sozluk.put("acik", "acik");
        sozluk.put("kapali", "kapali");
        sozluk.put("tembel", "tembel");
        sozluk.put("caliskan", "caliskan");
        sozluk.put("uyumlu", "uyumlu");
        sozluk.put("uyumsuz", "uyumsuz");
        sozluk.put("eglenceli", "eglenceli");
        sozluk.put("sikici", "sikici");
        sozluk.put("onemli", "onemli");
        sozluk.put("onemsiz", "onemsiz");
        sozluk.put("sevgili", "sevgili");
        sozluk.put("nefret", "nefret");
        sozluk.put("doga", "doga");
        sozluk.put("sehir", "sehir");
        sozluk.put("buyuk", "buyuk");
        sozluk.put("kucuk", "kucuk");
        sozluk.put("ekonomik", "ekonomik");
        sozluk.put("pahali", "pahali");
        sozluk.put("gunluk", "gunluk");
        sozluk.put("haftalik", "haftalik");
        sozluk.put("yil", "yil");
        sozluk.put("ay", "ay");
        sozluk.put("hafta", "hafta");
        sozluk.put("gun", "gun");
        sozluk.put("saat", "saat");
        sozluk.put("dakika", "dakika");
        sozluk.put("saniye", "saniye");
        sozluk.put("Armut","Armut");
        System.out.println("30 Saniye Süren var. Olabildigince Hizli Ol :)");

        String[] keys = sozluk.keySet().toArray(new String[0]);

        long baslangic = System.currentTimeMillis();
        long sure = 10000; // 1 dakika = 60000 milisaniye


        while (System.currentTimeMillis() - baslangic < sure) {
            String randomKey = keys[random.nextInt(keys.length)];
            System.out.println("Kelime: " + randomKey);
            String kelime = scan.nextLine();

            if (kelime.equalsIgnoreCase(sozluk.get(randomKey))) {
                toplam++;
            } else {}

        }
        System.out.println("Süre bitti... Skor: " + toplam);
        System.out.print("Hesap Adınızı giriniz: ");
        gamerName = scan.nextLine();
        DbHelper.skorGuncelle(gamerName,toplam);
        toplam = 0;
        AnaMenu.giris();
    }
}