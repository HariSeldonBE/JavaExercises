package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dikdortgen extends Sekil{
    private double uzunluk;
    private double genislik;

    public Dikdortgen(Scanner scanner) {
        try {
            System.out.print("Dikdörtgenin uzunluğunu cm olarak girin: ");
            uzunluk = scanner.nextDouble();
            System.out.print("Dikdörtgenin genişliğini cm olarak girin: ");
            genislik = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş. Lütfen sayısal bir değer girin.");
        }
    }

    public Dikdortgen() {
    }

    @Override
    public double alanHesapla() {
        return uzunluk * genislik;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (uzunluk + genislik);
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }
}
