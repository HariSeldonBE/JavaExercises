package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("○ ■■■ ■ \t Bir Geometrik Şekil Seçiniz:\t ○ ■■■ ■");
            System.out.println("○ ○ ○ ○ \t \t \t 1. Çember \t \t \t \t ○ ○ ○ ○");
            System.out.println("■■■ ■■■ \t \t \t 2. Dikdörtgen \t \t \t ■■■ ■■■");
            System.out.println("■ ■ ■ ■ \t \t \t 3. Kare \t \t \t \t ■ ■ ■ ■");
            System.out.println("◄ ◄ ◄ ◄ \t \t \t 4. Çıkış\t \t \t \t ► ► ► ►");

            try {
                int secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        Cember cember = new Cember(scanner); // oluşturulan cember objesi ile Cember classda bulunan değişken ve methodlara ulaşabiliriz
                        System.out.println("\n");
                        System.out.println("○ ○ ○  Yarıçapı " + cember.getYaricap() + " cm olan çemberin alanı: " + cember.alan() + " cm² ○ ○ ○");
                        System.out.println("○ ○ ○  Yarıçapı " + cember.getYaricap() + " cm olan çemberin çevresi: " + cember.cevre() + " cm ○ ○ ○\n\n");
                        break;
                    case 2:
                        Dikdortgen dikdortgen = new Dikdortgen(scanner); // oluşturulan dikdortgen objesi ile Dikdortgen classda bulunan değişken ve methodlara ulaşabiliriz
                        System.out.println("\n");
                        System.out.println("■■■ ■■■ Uzunluğu " + dikdortgen.getUzunluk() + " cm genişliği " + dikdortgen.getGenislik() + " cm olan dikdörtgenin alanı: " + dikdortgen.alan() + " cm² ■■■ ■■■");
                        System.out.println("■■■ ■■■ Uzunluğu " + dikdortgen.getUzunluk() + " cm genişliği " + dikdortgen.getGenislik() + " cm olan dikdörtgenin çevresi: " + dikdortgen.cevre() + " cm ■■■ ■■■\n\n");
                        break;
                    case 3:
                        Kare kare = new Kare(scanner); // oluşturulan kare objesi ile Kara classın parent classı olan Dikdortgen classda bulunan değişken ve methodlara ulaşabiliriz
                        System.out.println("\n");
                        System.out.println("■ ■ ■ ■ Kenar uzunluğu " + kare.getGenislik() + " cm olan karenin alanı: " + kare.alan() + " cm² ■ ■ ■ ■");
                        System.out.println("■ ■ ■ ■ Kenar uzunluğu " + kare.getUzunluk() + " cm olan karenin çevresi: " + kare.cevre() + " cm ■ ■ ■ ■\n\n");
                        break;
                    case 4:
                        System.out.println("↔ ↔ ↔ ↔ \t \t Programdan çıkılıyor.\t \t ↔ ↔ ↔ ↔");
                        return;
                    default:
                        System.out.println("\n");
                        System.out.println("Geçersiz seçim. Lütfen 1 ve 4 arasında sayısal bir seçim yapınız.\n\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n");
                System.out.println("* * * Hatalı giriş. Lütfen sayısal bir değer giriniz. * * *\n\n");
                scanner.next();
            }
        }
    }
}
