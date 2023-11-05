package okul_yonetim_platformu;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.TreeMap;

public class Ogrenci extends Runner implements Islemler {
    protected static TreeMap<Integer, Map<String,Object>> ogrenciMap = new TreeMap<>();
    protected static TreeMap<String,Object> ogrenciValues = new TreeMap<>();

    @Override
    public void ekleme() {

        // İsim Bilgisi Girişi
        while (true) {
            System.out.print("Lütfen öğrencinin ismini giriniz: ");
            isim = scanner.nextLine();

            if ((isim.matches("^[A-Za-zğĞşŞüÜıİöÖçÇ]+( [A-Za-zğĞşŞüÜıİöÖçÇ]+)*$") )) {
                String[] isimArr = isim.split(" ");
                isim="";
                for (String each:isimArr) {
                    isim += each.substring(0,1).toUpperCase() + each.substring(1).toLowerCase() + " ";
                }
                isim = isim.substring(0, (isim.length()-1));
                ogrenciValues.put("Isim ", " " + isim);
                break;

            } else {
                System.out.println("İsim bilgisi hatalı girildi, lütfen tekrar deneyiniz.\n" +
                                   "Arada bir boşluk bırakarak birden fazla isim girilebilir.");
            }

        }

        // Soyisim Bilgisi Girişi
        while (true) {
            System.out.print("Lütfen öğrencinin soyismini giriniz: ");
            soyisim = scanner.nextLine();
            if ((soyisim.matches("^[A-Za-zğĞşŞüÜıİöÖçÇ]+( [A-Za-zğĞşŞüÜıİöÖçÇ]*)?$"))) {
                String[] soyisimArr = soyisim.split(" ");
                soyisim="";
                for (String each:soyisimArr) {
                    soyisim += each.toUpperCase()  + " ";
                }
                soyisim = soyisim.substring(0, soyisim.length()-1);
                ogrenciValues.put("Soyisim ", " " + soyisim);
                break;

            }else {
                System.out.println("Soyisim bilgisi hatalı girildi, lütfen tekrar deneyiniz.\n" +
                                   "Arada bir boşluk bırakarak en fazla iki soyisim girilebilir.");
            }
//
        }

        // Kimlik No Bilgisi Girişi

        while (true) {
            System.out.print("Lütfen öğrencinin kimlik numarsını rakamsal ve 11 haneli olarak giriniz: ");
            kimlikNoStr = scanner.nextLine();

            if (kimlikNoStr.length() == 3 && kimlikNoStr.matches("[0-9]+") && !(kimlikNoStr.startsWith("0"))) {
                kimlikNo = Long.parseLong(kimlikNoStr);
                ogrenciValues.put("Kimlik No ", " " + kimlikNo);
                break;
            } else {
                System.out.println("Kimlik numarası 11 haneli ve rakamlardan oluşmalıdır.");
            }
        }

        // Yaş Bilgisi Girişi

        while (true) {
            System.out.print("Lütfen öğrencinin yaşını giriniz: ");
            yasStr = scanner.nextLine();
            try {
                yas = (int)(Double.parseDouble(yasStr));
                //int tamYas = (int) yas;
                ogrenciValues.put("Yas ", " " + yas);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Yaş bilgisi rakamsal değer girilmedi. Lütfen rakam girerek tekrar deneyiniz: ");
            }
        }

        // Sınıf Bilgisi Girişi

        System.out.print("Lütfen öğrencinin sınıfını giriniz: ");
        sinif = scanner.nextLine();
        ogrenciValues.put("Sinıf "," " + sinif);

        // Kayıt Tarihi Bilgisi Girişi

        ogrenciValues.put("Kayıt Tarihi "," " + kayitTarihi);

        // Öğrenci Numarası Bilgisi Girişi - Dış Map Key

        ogrenciMap.put(numara, ogrenciValues);
        beklemeEkrani();
        System.out.println("\n");
        System.out.println(isim + " " + soyisim + " isimli öğrenci,\n" +
                           numara + " okul numarası ile \n" +
                           sinif + ". sınıfa kaydedilmiştir.\n" +
                           "Kayıt Tarihi: " + kayitTarihi);
        System.out.println("\n");
        numara += 1;
        System.out.println("ÖĞRENCİ İŞLEMLERİ MENÜSÜNE GERİ YÖNLENDİRİLİYORSUNUZ\n\n");
        System.out.println("\t\t\t\t\tÖĞRENCİ İŞLEMLERİ\n");

    }

    @Override
    public void arama() {
        System.out.println("ogrenci arama");
        System.out.println("\n\nÖĞRENCİ İŞLEMLERİ MENÜSÜNE GERİ YÖNLENDİRİLİYORSUNUZ\n\n");
        System.out.println("\t\t\t\t\tÖĞRENCİ İŞLEMLERİ\n");

    }

    @Override
    public void listeleme() {

        System.out.println(ogrenciMap.keySet());
        System.out.println(Arrays.toString(ogrenciValues.toString().split(" ")));
        System.out.println("\n\nÖĞRENCİ İŞLEMLERİ MENÜSÜNE GERİ YÖNLENDİRİLİYORSUNUZ\n\n");
        System.out.println("\t\t\t\t\tÖĞRENCİ İŞLEMLERİ\n");

    }

    @Override
    public void silme() {
        System.out.println("ogrenci silme");
        System.out.println("\n\nÖĞRENCİ İŞLEMLERİ MENÜSÜNE GERİ YÖNLENDİRİLİYORSUNUZ\n\n");
        System.out.println("\t\t\t\t\tÖĞRENCİ İŞLEMLERİ\n");

    }
}
/*    protected static void islemSecim() {

        switch (secilenIslem){
            case "1":
                ogrenciIslem.ekleme();
                break;
            case "2":
                ogrenciIslem.arama();
                break;
            case "3":
                ogrenciIslem.listeleme();
                break;
            case "4":
                ogrenciIslem.silme();
                break;
            case "q":
            case "Q":
                anaMenu();
                break;
            default:
                System.out.print("Yanlış giriş yaptınız. Lütfen 1,2,3,4 veya Q tuşlayınız: ");
                islemSecim();

        }
    }*/