import java.util.Scanner;

public class C01_DaireCevreAlan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dairenin yari capini cm cinsinden giriniz:");
        double yaricap = scanner.nextDouble();

        System.out.println("2 ayrı method ile alan ve cevre hesaplatma");

        cevre(yaricap); //Sadece dairenin cevresini hesaplayan method

        alan(yaricap);  //Sadece dairenin alanini hesaplayan method


        System.out.println("***************************************************");

        System.out.println("Tek method ile hem alan hem cevre hesaplatma");

        alancevre(yaricap);  //Dairenin alanini ve cevresini hesaplayan tek method

    }
    public static void cevre(double r) {
        double Pi = 3.14;
        System.out.println("Dairenin Cevresi = " + 2*Pi*r + " cm");

    }
    public static void alan(double r) {
        double Pi = 3.14;
        System.out.println("Dairenin Alani = " + Pi*r*r + " cm2");
    }
    public static void alancevre(double r) {
        double Pi = 3.14;
        System.out.println("Dairenin Cevresi = " + 2*Pi*r + " cm");
        System.out.println("Dairenin Alani = " + Pi*r*r + " cm2");
    }
}
