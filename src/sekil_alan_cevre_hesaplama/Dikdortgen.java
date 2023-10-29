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
    /* Child class durumundaki Kare classında bir constructor tanımladığımız için tanımlanan
    constructorin ilk satırında görünmeyen super() constructor çalışacağından bu class içinde
    parametresiz ve bodysi boş durumda bir Dikdortgen() constructor tanımlamamız gerekir.
    */
    }
    @Override
    public double alan() {
        return uzunluk * genislik;
    }
    /* Parent durumda olan Sekil classı abstract durumdadır
    ayrıca Sekil classında "alan" ve "cevre" adında 2 adet abstract
    method tanımlanmıştır. Bu methodların child classlarda override
    edilmesi gerekir
     */
    @Override
    public double cevre() {
        return 2 * (uzunluk + genislik);
    }

    public double getUzunluk() {
        return uzunluk;
    }/* Dikdortgen classında private olarak tanımlanan uzunluk değerini
     Runner classda ekrana yazdırdığımız için bir getter method gerekir.
     */

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }/* Dikdortgen classında private olarak tanımlanan uzunluk değerini
     Kare classında kenar uzunluğuna eşitlediğimiz için bir setter method gerekir.
     */

    public double getGenislik() {
        return genislik;
    }/* Dikdortgen classında private olarak tanımlanan genişlik değerini
     Runner classda ekrana yazdırdığımız için bir getter method gerekir.
     */

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }/* Dikdortgen classında private olarak tanımlanan genişlik değerini
     Kare classında kenar uzunluğuna eşitlediğimiz için bir setter method gerekir.
     */
}
