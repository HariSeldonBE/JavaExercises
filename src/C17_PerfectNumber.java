import java.util.Scanner;

public class C17_PerfectNumber {
    public static void main(String[] args) {
    /*
    Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
    Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
    ORNEK:
    INPUT     : 6
    OUTPUT : 1,2,3
                  1+2+3 = 6 = 6 (Mükemmel)

                  mukemmel sayi kontrolu
                  1. kullanicidan sayi alalim
                  2. bir toplam degiskeni olusturuyoruz
                  3. sayinin bolenleri bul
                  4. bolenleri toplamla topla
                  5. sayiyla toplamin esitligini kontrol et

    */
        System.out.print("INPUT     : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        perfectNumber(number);
    }
    public static void perfectNumber(int number){
                String divider = "";
        int sum = 0;
        for (int i = 1; i<number; i++) {
            if (number % i == 0) {
                sum+=i;
                divider+=i+",";
            }
        }
        divider=divider.substring(0, divider.length() - 1);
        if (sum==number){
            System.out.println("OUTPUT    : " + divider);
            System.out.println("\t" + divider.replace(',','+') + " = " + sum + " = " + number + " (Mükemmel)");
        }else {
            System.out.println("OUTPUT    : " + divider);
            System.out.println("\t" + divider.replace(',','+') + " = " + sum + " != " + number + " (Mükemmel Sayı Değil)");
        }
    }
}
