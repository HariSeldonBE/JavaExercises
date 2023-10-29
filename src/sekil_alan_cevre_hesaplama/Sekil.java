package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sekil {
    protected int hesaplamaSecim;

    public void talepEtHesaplamaSecimi(Scanner scanner) {
        System.out.println("Hesaplama seçeneğini belirtin:");
        System.out.println("1. Alan Hesapla");
        System.out.println("2. Çevre Hesapla");

        try {
            hesaplamaSecim = scanner.nextInt();
            if (hesaplamaSecim < 1 || hesaplamaSecim > 2) {
                System.out.println("Geçersiz seçim. Lütfen 1 veya 2 girin.");
                talepEtHesaplamaSecimi(scanner);
            }
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş. Lütfen sayısal bir değer girin.");
            scanner.next();
            talepEtHesaplamaSecimi(scanner);
        }
    }

    public double alanHesapla() {
        return 0.0;
    }

    public double cevreHesapla() {
        return 0.0;
    }
}
