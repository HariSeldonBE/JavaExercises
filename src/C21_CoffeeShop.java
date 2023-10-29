import java.util.Scanner;

public class C21_CoffeeShop {
    public static void main(String[] args) {

        String kahve = kahveSecimi();
        String sut = sutSecimi();
        String seker = sekerSecimi();
        String boyut = boyutSecimi();

        System.out.println(seker + sut + boyut + kahve + " hazırdır. Afiyet Olsun!!!");

    }
    public static String kahveSecimi() {

        String secilenKahve = "";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen Kahvenizi Seçiniz \n1.Türk Kahvesi  2.Filtre Kahve  3.Americano");
            System.out.print("Seçiminizi yapınız (1-3) : ");
            String kahve = scanner.next();

            if (kahve.equals("1") || (kahve.toLowerCase()).startsWith("türk")) {
                secilenKahve = "Türk Kahveniz";
                break;
            } else if (kahve.equals("2") || (kahve.toLowerCase()).startsWith("filtre")) {
                secilenKahve = "Filitre Kahveniz";
                break;
            } else if (kahve.equals("3") || (kahve.toLowerCase()).startsWith("americ")) {
                secilenKahve = "Americanonuz";
                break;
            } else System.out.println("Yanlış seçim yaptınız lütfen tekrar deneyiniz.");
        }while (true);
        return secilenKahve;
    }

    public static String sutSecimi() {

        String sut = "";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Süt eklemek ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
            sut = scanner.next();

            if (sut.equalsIgnoreCase("evet")) {
                sut = "sütlü ";
                break;
            } else if (sut.equalsIgnoreCase("hayır")) {
                sut = "";
                break;
            } else {
                System.out.println("Yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");
            }
        }while (true);

        return sut;
    }

    public static String sekerSecimi() {

        String seker = "";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Şeker ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
            seker = scanner.next();

            if (seker.equalsIgnoreCase("evet")) {
                seker = "Şekerli ";
                break;
            } else if (seker.equalsIgnoreCase("hayır")) {
                seker = "Şekersiz ";
                break;
            } else {
                System.out.println("Yanlış giriş yaptınız. Lütfen tekrar deneyiniz.");
            }
        }while (true);

        return seker;
    }
    public static String boyutSecimi() {

        String boyut = "";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hangi boyutta olsun? (Büyük boy - Orta boy - Küçük boy olarak giriniz): ");
            boyut = scanner.nextLine();

            if (boyut.toLowerCase().startsWith("büyük")) {
                boyut = "büyük boy ";
                break;
            } else if (boyut.toLowerCase().startsWith("orta")) {
                boyut = "orta boy ";
                break;
            } else if (boyut.toLowerCase().startsWith("küçük")) {
                boyut = "küçük boy ";
                break;
            } else
                System.out.println("Yanlış giriş yaptınız. Lütfen tekrar deneyiniz:");
        }while (true);
        return boyut;
    }
}
