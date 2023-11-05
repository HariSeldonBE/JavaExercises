package okul_yonetim_platformu;

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
                    isim += each.substring(0, 1).toUpperCase() + each.substring(1).toLowerCase() + " ";
                }
                isim = isim.substring(0, isim.length());
                ogrenciValues.put("Isim ", " " + isim);
                break;

            } else {
                System.out.println("Geçersiz isim girdiniz, lütfen tekrar deneyiniz.");
            }

        }

        // Soyisim Bilgisi Girişi
        while (true) {
            System.out.print("Lütfen öğrencinin soyismini giriniz: ");
            soyisim = scanner.nextLine();
            if ((soyisim.matches("^[A-Za-zğĞşŞüÜıİöÖçÇ]+( [A-Za-zğĞşŞüÜıİöÖçÇ])*?$"))) {
                String[] soyisimArr = soyisim.split(" ");
                soyisim="";
                for (String each:soyisimArr) {
                    soyisim += each.substring(0).toUpperCase()  + " ";
                }
                isim = isim.substring(0, isim.length()-1);
                ogrenciValues.put("Isim ", " " + isim);
                break;
            }
//            if (soyisim.isEmpty()) {
//                System.out.println("Soyisim boş bırakılamaz. Lütfen bir soyisim giriniz: ");
//            } else if (!isIsimHarf(soyisim)) {
//                System.out.println("Geçersiz giriş yaptınız. Lütfen tekrar deneyiniz.");
//            } else {soyisim = soyisim.toUpperCase();
//                ogrenciValues.put("Soyisim ", " " + soyisim.toUpperCase());
//                break;
//            }
        }


        // Kimlik No Bilgisi Girişi
        while (true) {
            System.out.print("Lütfen öğrencinin kimlik numarsını rakamsal ve 11 haneli olarak giriniz: ");
            kimlikNoStr = scanner.nextLine();

            if (kimlikNoStr.length() == 11 && kimlikNoStr.matches("[0-9]+")) {
                KimlikNo = Long.parseLong(kimlikNoStr);
                ogrenciValues.put("Kimlik No ", " " + KimlikNo);
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



        System.out.print("Lütfen öğrencinin sınıfını giriniz: ");
        sinif = scanner.nextLine().trim();
        ogrenciValues.put("Sinıf "," " + sinif);


        // kayitTarihi = LocalDate.now();
        ogrenciValues.put("Kayıt Tarihi "," " + kayitTarihi);

        System.out.println("Öğrenciye verilen yeni okul numarası: " + numara );
        ogrenciMap.put(numara, ogrenciValues);
        System.out.println(isim + " " + soyisim + " isimli öğrenci, " + numara + " okul numarası ile " + sinif + ". sınıfa " + kayitTarihi + " tarihinde kaydedilmiştir.");
        numara += 1;
        islemlerMenu();
    }

    @Override
    public void arama() {
        System.out.println("ogrenci arama");
        islemlerMenu();
    }

    @Override
    public void listeleme() {


        System.out.println(ogrenciMap.values());
        islemlerMenu();
    }

    @Override
    public void silme() {
        System.out.println("ogrenci silme");
        islemlerMenu();
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