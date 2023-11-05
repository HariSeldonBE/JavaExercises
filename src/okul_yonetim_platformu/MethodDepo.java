package okul_yonetim_platformu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class MethodDepo implements Islemler{
    static Scanner scanner = new Scanner(System.in);
    static String secilenRol; //= scanner.next();
    static String secilenIslem; // = scanner.next();
    static int numara = 23340001;
    String isim;
    String soyisim;
    String kimlikNoStr;
    long kimlikNo;
    int yas;
    String yasStr;
    String sinif;
    DateTimeFormatter tarih = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String kayitTarihi = tarih.format(LocalDateTime.now());
    public static void anaMenu() {
        System.out.println("\t\t ====================================\n" +
                "\t\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t\t ====================================\n" +
                "\t\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t\t Q- ÇIKIŞ\n"+
                "\t\t ====================================");
        System.out.print("Lütfen Seçiminizi Yapınız: ");
        rolSecim();
    }

    public static void rolSecim() {
        secilenRol = scanner.nextLine();
        while (true) {
            switch (secilenRol){
                case "1":
                    islemlerMenu();
                    islem();
                    break;
                case "2":
                    islemlerMenu();
                    islem();
                    break;
                case "q":
                case "Q":
                    System.out.println("Programdan çıkış yapılıyor");
                    System.exit(0);
                default:
                    System.out.print("Yanlış giriş yaptınız. Lütfen 1,2 veya Q tuşlayınız: ");
                    rolSecim();
                    break;
            }
        }
    }
    protected static void islemlerMenu() {
        System.out.println("\t\t ============= İŞLEMLER =============\n" +
                           "\t\t 1-EKLEME\n" +
                           "\t\t 2-ARAMA\n" +
                           "\t\t 3-LİSTELEME\n" +
                           "\t\t 4-SİLME\n" +
                           "\t\t Q-ANA MENU\n" +
                           "\t\t ====================================");
        System.out.print("Lütfen Seçiminizi Yapınız: ");

    }
    protected static void islem() {

        secilenIslem = scanner.nextLine();
        String rolIslem = secilenRol + secilenIslem;

        switch (rolIslem){
            case "11":
                ogrenciIslemleri.ekleme();
                break;
            case "12":
                ogrenciIslemleri.arama();
                break;
            case "13":
                ogrenciIslemleri.listeleme();
                break;
            case "14":
                ogrenciIslemleri.silme();
                break;

            case "21":
                ogretmenIslemleri.ekleme();
                break;
            case "22":
                ogretmenIslemleri.arama();
                break;
            case "23":
                ogretmenIslemleri.listeleme();
                break;
            case "24":
                ogretmenIslemleri.silme();
                break;
            case "1q":
            case "1Q":
            case "2q":
            case "2Q":
                anaMenu();
                break;
            default:
                System.out.print("Yanlış giriş yaptınız. Lütfen 1,2,3,4 veya Q tuşlayınız: ");
                islem();
                break;
        }
    }

protected static void beklemeEkrani() {
        // Her işlemden sonra 5 saniye bekleme süresi
        try {
            Thread.sleep(400);
            System.out.print("...");
            Thread.sleep(400);
            System.out.print("......");
            Thread.sleep(400);
            System.out.print("............");
            Thread.sleep(400);
            System.out.print("........................");
            Thread.sleep(400);
            System.out.print("................................................\n\n");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // İstisna işleme
            e.printStackTrace();
        }
    }


}
