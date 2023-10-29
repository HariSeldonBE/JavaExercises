import java.util.Random;
import java.util.Scanner;

public class C02_SayiTahmin {
    public static void main(String[] args) {

        guess();

    }
    public static void guess() {
        Random random = new Random();
        int tahminEdilecekSayi = random.nextInt(2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tahmin icin bir sayi giriniz");
        int input = scanner.nextInt();


        do {
            if(!(input == tahminEdilecekSayi)){
                System.out.println("Tahmin Edilecek Sayi = " + tahminEdilecekSayi);
                System.out.println("Girdiginiz Sayi = " + input);
                System.out.println("Kaybettin. Tekrar dene:(");
                tahminEdilecekSayi = random.nextInt(2);
                input = scanner.nextInt();
            }
        }
        while(!(input == tahminEdilecekSayi));
        System.out.println("Tahmin Edilecek Sayi = " + tahminEdilecekSayi);
        System.out.println("Girdiginiz Sayi = " + input);
        System.out.println("Tebrikler!! Tahminin dogru:)");

    }
}
