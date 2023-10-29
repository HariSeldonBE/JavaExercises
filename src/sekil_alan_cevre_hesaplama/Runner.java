package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Geometrik Şekil Seçiniz:");
            System.out.println("1. Çember");
            System.out.println("2. Dikdörtgen");
            System.out.println("3. Kare");
            System.out.println("4. Çıkış");

            try {
                int secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        Cember cember = new Cember(scanner);
                        boolean devam = true;

                        while (devam) {
                            cember.talepEtHesaplamaSecimi(scanner);

                            if (cember.hesaplamaSecim == 1) {
                                System.out.println("Çember Alan: " + cember.alanHesapla() + " cm2");
                            } else if (cember.hesaplamaSecim == 2) {
                                System.out.println("Çember Çevre: " + cember.cevreHesapla() + " cm");
                            } else {
                                System.out.println("Geçersiz seçim.");
                            }

                            System.out.println("Başka bir hesaplama yapmak istiyor musunuz? (Evet/Hayır): ");
                            String cevap = scanner.next();
                            if (cevap.equalsIgnoreCase("Hayır")) {
                                devam = false;
                            }
                        }
                        break;
                    case 2:
                        Dikdortgen dikdortgen = new Dikdortgen(scanner);
                        devam = true;

                        while (devam) {
                            dikdortgen.talepEtHesaplamaSecimi(scanner);

                            if (dikdortgen.hesaplamaSecim == 1) {
                                System.out.println("Dikdörtgen Alan: " + dikdortgen.alanHesapla() + " cm2");
                            } else if (dikdortgen.hesaplamaSecim == 2) {
                                System.out.println("Dikdörtgen Çevre: " + dikdortgen.cevreHesapla() + " cm");
                            } else {
                                System.out.println("Geçersiz seçim.");
                            }

                            System.out.println("Başka bir hesaplama yapmak istiyor musunuz? (Evet/Hayır): ");
                            String cevap = scanner.next();
                            if (cevap.equalsIgnoreCase("Hayır")) {
                                devam = false;
                            }
                        }
                        break;
                    case 3:
                        Kare kare = new Kare(scanner);
                        devam = true;

                        while (devam) {
                            kare.talepEtHesaplamaSecimi(scanner);

                            if (kare.hesaplamaSecim == 1) {
                                System.out.println("Kare Alan: " + kare.alanHesapla() + " cm2");
                            } else if (kare.hesaplamaSecim == 2) {
                                System.out.println("Kare Çevre: " + kare.cevreHesapla() + " cm");
                            } else {
                                System.out.println("Geçersiz seçim.");
                            }

                            System.out.println("Kare için başka bir hesaplama yapmak istiyor musunuz?\n(Evet veya Hayır yazın:)");
                            String cevap = scanner.next();
                            if (cevap.equalsIgnoreCase("Hayır")) {
                                devam = false;
                            } else if (cevap.equalsIgnoreCase("Evet")) {
                            }else {
                                System.out.println("Hatalı giriş yaptınız, lütfen 'Evet' veya 'Hayır' giriniz");
                                scanner.next();
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Programdan çıkılıyor.");
                        return;
                    default:
                        System.out.println("Geçersiz seçim.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş. Lütfen sayısal bir değer girin.");
                scanner.next();
            }
        }
    }
}
