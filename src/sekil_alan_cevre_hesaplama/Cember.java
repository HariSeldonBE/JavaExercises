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
    public double alan() {
        return Math.PI * yaricap * yaricap; // Cemberin alanını hesaplamak için Math Classından Pi değerini alabiliriz
    }
    /* Parent durumda olan Sekil classı abstract durumdadır
    ayrıca Sekil classında "alan" ve "cevre" adında 2 adet abstract
    method tanımlanmıştır. Bu methodların child class durumundaki
     Cember classında override edilmesi gerekir.
     */
    @Override
    public double cevre() {
        return 2 * Math.PI * yaricap; // Cemberin çevresini hesaplamak için Math Classından Pi değerini alabiliriz
    }

    public double getYaricap() {
        return yaricap;
    }/* Cember classında private olarak tanımlanan yaricap değerini
     Runner classda ekrana yazdırdığımız için bir getter method gereklidir.
     */
}
