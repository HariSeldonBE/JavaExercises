import java.util.Arrays;
import java.util.Scanner;

public class C04_ArraydenElemanCikarma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Verilen array
        int[] array = {1, 1, 1, 1, 1};
        System.out.print("Arrayden cikarmak istediginiz sayiyi giriniz: ");
        int cikacakEleman = scanner.nextInt();
        int[] yeniArray = arraydenElamanCikar(array, cikacakEleman);
        System.out.println("Yeni array: " + Arrays.toString(yeniArray));
    }
    public static int[] arraydenElamanCikar(int[] array, int sayi) {
        int index = -1; // Cikarmak istedigimiz sayinin arraydeki indexini tutan bir degisken tanimlayalim
        // index degiskenin degerini baslangic olarak -1 girelim ki arrayde olmayan bir sayinin adresi olsun
        // Simdi cikarmak istedigimiz sayi arrayde hangi indexde yer aliyor onu bulalim
        for (int i = 0; i < array.length; i++) {
            if (array[i] == sayi) {
                index = i;
                break;
                // break komutu arrayde cikaracagimiz hedef sayiyi ilk buldugu yerde (index degerinde) kodu durdurur.
                // Kodu durdurmamizin sebebi cikaracagimiz sayiyi ilk gordugumuz yerde durmak icin
                // Kod devam ederse ve cikarmak istedigimiz sayi birden fazla kez yer aliyorsa son oldugu index degerini gorur ve sayiyi en son gordugu yerde cikarir
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
            // Cikaracagimix sayidan onceki elemanlarin yeri yeni arrayde degismez. O sebeple eski arraydeki ayni indexe yazabilriz.
            yeniArray[i] = array[i];
        }
        // Cıkaracagimiz sayidan sonraki elemanlari yeni arraye girmeye devam edelim
        for (int i = index + 1; i < array.length; i++) {
            // aradan bir sayi ciktigi icin yeni arrayin kalan elemanlari eski arraydeki siralarinden bir önceki sirada olacak
            yeniArray[i - 1] = array[i];
        }
        return yeniArray;
    }
}


