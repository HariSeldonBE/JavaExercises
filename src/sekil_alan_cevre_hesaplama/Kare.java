package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kare extends Dikdortgen{
    public Kare(Scanner scanner) {
        /* Bu satırda görünmeyen super() constructor çalışacağı için parent class
    olan Diktorgen classinda başka constructor tanımlıysa default constructor
    geçersiz kalacağından parent class olan Diktorgen classında parametresiz
    ve bodysi boş olan bir Dikdortgen() constructor tanımlamamız gerekir.
    */

        try {
            System.out.print("Kare'nin kenar uzunluğunu cm olarak giriniz: ");
            double kenarUzunlugu = scanner.nextDouble();
            /* Kare her kenarı birbirne eşit bir dikdörtgendir
            Bu sebeple parent class olan Dikdortgen classında
            private olarak tanımlanan uzunluk ve genislik
            değişkenlerini encapsulation yontemiyle setter
            kullanarak karenin kenar uzunluğuna eşitleriz.
             */
            super.setUzunluk(kenarUzunlugu); // parent classdaki private değişken "uzunluk" karenin "kenar uzunluğuna" eşitlendi
            super.setGenislik(kenarUzunlugu); // parent classdaki private değişken "genislik" karenin "kenar uzunluğuna" eşitlendi
            Sekil.beklemeEkrani();
//            System.out.println("\n");
            System.out.println("■ ■ ■ ■ Kenar uzunluğu " + super.getGenislik() + " cm olan karenin alanı: " + alan() + " cm² ■ ■ ■ ■");
            System.out.println("■ ■ ■ ■ Kenar uzunluğu " + super.getUzunluk() + " cm olan karenin çevresi: " + cevre() + " cm ■ ■ ■ ■\n\n");
            System.out.println("\t\t******\t\t\t Lütfen bekleyiniz\t\t\t ******");
            System.out.println("\t\t******\t Ana menüye yönlendiriliyorsunuz\t ******");
            Sekil.beklemeEkrani();

        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş yaptınız. Lütfen sayısal bir değer giriniz.");
        }
    }
}
