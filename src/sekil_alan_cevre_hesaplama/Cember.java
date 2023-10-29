package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cember extends Sekil{
    private double yaricap;

    public Cember(Scanner scanner) {
        try {
            System.out.print("Çemberin yarıçapını cm olarak girin: ");
            yaricap = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş. Lütfen sayısal bir değer girin.");
        }
    }

    @Override
    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }
}
