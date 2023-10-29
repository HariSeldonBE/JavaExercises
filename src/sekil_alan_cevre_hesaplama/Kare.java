package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kare extends Dikdortgen{
    public Kare(Scanner scanner) {
        try {
            System.out.print("Kare'nin kenar uzunluğunu cm olarak girin: ");
            double kenarUzunlugu = scanner.nextDouble();
            super.setUzunluk(kenarUzunlugu);
            super.setGenislik(kenarUzunlugu);
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş. Lütfen sayısal bir değer girin.");
        }
    }
}
