package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\t \t \t○ ■■■ ■ \t Bir Geometrik Şekil Seçiniz:\t ○ ■■■ ■");
            System.out.println("\t \t \t○ ○ ○ ○ \t \t \t 1. Çember \t \t \t \t ○ ○ ○ ○");
            System.out.println("\t \t \t■■■ ■■■ \t \t \t 2. Dikdörtgen \t \t \t ■■■ ■■■");
            System.out.println("\t \t \t■ ■ ■ ■ \t \t \t 3. Kare \t \t \t \t ■ ■ ■ ■");
            System.out.println("\t \t \t▲ ▲ ▲ ▲ \t \t \t 4. Çıkış\t \t \t \t ▲ ▲ ▲ ▲");
            System.out.print("\t \t \tLütfen 1-4 arasında bir seçim yapınız: ");

            try {
                int secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        Cember cember = new Cember(scanner);

                        break;
                    case 2:
                        Dikdortgen dikdortgen = new Dikdortgen(scanner);

                        break;
                    case 3:
                        Kare kare = new Kare(scanner);

                        break;
                    case 4:
                        System.out.println("↔ ↔ ↔ ↔ \t \t Programdan çıkılıyor.\t \t ↔ ↔ ↔ ↔");
                        Sekil.beklemeEkrani();
                        return;
                    default:
                        System.out.println("\n");
                        System.out.println("Geçersiz seçim. Lütfen 1 ve 4 arasında sayısal bir seçim yapınız.\n\n");
                        System.out.println("\t\t******\t Ana menüye yönlendiriliyorsunuz\t ******\n\n");
                        Sekil.beklemeEkrani();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n");
                System.out.println("* * * Hatalı giriş. Lütfen sayısal bir değer giriniz. * * *\n\n");
                System.out.println("\t\t******\t Ana menüye yönlendiriliyorsunuz\t ******\n\n");
                Sekil.beklemeEkrani();
                scanner.next();
            }
        }
    }
}
