import java.util.Arrays;
import java.util.Scanner;

public class C06_ArraydenElemanCikarma4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Verilen array
            int[] array = {1, 2, 3, 4, 5};

            System.out.print("Arrayden cikarmak istediginiz sayiyi giriniz: ");
            int cikacakEleman = scanner.nextInt();

            int[] yeniArray = arraydenElamanCikar(array, cikacakEleman);

            System.out.println("Yeni array: " + Arrays.toString(yeniArray));

        }

        public static int[] arraydenElamanCikar(int[] array, int sayi) {

            int index = -1; // Cikarmak istedigimiz elemanin arraydeki indexini tutan bir degisken
            // index degiskenin degerini baslangic olarak -1 girelim ki arrayde olmayan bir adres olsun


            // Simdi cikarmak istedigimiz sayi arrayde hangi indexde yer aliyor onu bulalim
            for (int i = 0; i < array.length; i++) {
                if (array[i] == sayi) {
                    index = i;
                    break; // break komutu arrayde hedef sayiyi ilk buldugu index de kodu durdurur
                }
            }

            // Eger kullanicinin girdigi sayi arrayde yoksa array eski haliyle geri dondurulur
            if (index == -1) { //index degeri -1 olarak kalmis ise girdigimiz sayi arrayde yok demektir
                return array;
            }

            // Simdi eski arrayden bir eksik sayida eleman iceren yeni bir array olusturalim
            int[] yeniArray = new int[array.length - 1];

            // Cikarmak istedigimiz elemandan onceki elemanlari tek tek yeni arraye girelim
            for (int i = 0; i < index; i++) {
                // i index degerine kadar ilerleyecek boylece sadece cıkarmak istedigimiz elemandan onceki elemanlar yeni arraye tanimlanir
                yeniArray[i] = array[i];
            }

            // Kalan elemanlari yeni arraye girmeye devam edelim
            for (int i = index + 1; i < array.length; i++) {
                // aradan bir eleman ciktigi icin yeni arrayin kalan elemanlari bir eksik index degerinde olacak
                yeniArray[i - 1] = array[i];

            }

            return yeniArray;
        }
    }
