import java.util.Scanner;

public class C20_GreenGrocery {
    public static void main(String[] args) {
        /*
        Basit bir 5 ürünlü manav alisveris programi yaziniz.

        1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        2. Adim : Baska bir urun almak isteyip istemedigini sor.
           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        */

        Scanner scanner = new Scanner(System.in);

        String[] urunler = {"Elma", "Armut", "Muz", "Portakal", "Çilek"};
        double[] fiyatlar = {2.5, 3.0, 1.75, 2.0, 4.5};
        double toplamFiyat = 0.0;

        System.out.println("QA Team 2 Manav Alışveriş Programına Hoş Geldiniz!");

        do {
            System.out.println("\nÜrün Listesi:");
            for (int i = 0; i < urunler.length; i++) {
                System.out.println((i + 1) + ". " + urunler[i] + " - " + fiyatlar[i] + " TL/kg");
            }

            System.out.print("Lütfen bir ürün seçin (1-" + urunler.length + "): ");
            int secim = scanner.nextInt();

            if (secim < 1 || secim > urunler.length) {
                System.out.println("Geçersiz bir seçenek girdiniz. Lütfen tekrar deneyin.");
                continue;
            }

            System.out.print("Kaç kilo " + urunler[secim - 1] + " almak istersiniz? ");
            double kilo = scanner.nextDouble();

            double urunFiyati = fiyatlar[secim - 1] * kilo;
            toplamFiyat += urunFiyati;

            System.out.println(urunler[secim - 1] + " ürünü " + kilo + " kilo aldınız. Toplam fiyat: " + urunFiyati + " TL");

            System.out.print("Başka bir ürün almak ister misiniz? (Evet/Hayır): ");
            String devamEt = scanner.next();



            if (!devamEt.equalsIgnoreCase("Evet")) {
                break;
            }
        } while (true);

        System.out.println("\nToplam Ödemeniz Gereken Tutar: " + toplamFiyat + " TL");
        System.out.println("Teşekkür ederiz, iyi günler dileriz!");

    }
}
