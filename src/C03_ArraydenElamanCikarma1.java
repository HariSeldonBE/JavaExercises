import java.util.Arrays;
import java.util.Scanner;

public class C03_ArraydenElamanCikarma1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Verilen array
        int[] array = {5, 1, 3, 2, 1};
        System.out.println("Arrayden cikarmak istediginiz sayiyi giriniz: ");
        int cikacakEleman = scanner.nextInt();
        int[] yeniArray = removeElementFromArray(array, cikacakEleman);
        System.out.println("Yeni array: " + Arrays.toString(yeniArray));
    }

    public static int[] removeElementFromArray(int[] arr, int e) {

        boolean finded = false;
        for (int i : arr) {
            if (i == e) {
                finded = true;
                break;
            }
        }
        if (!finded) return arr;

        int[] newArr = new int[arr.length - 1];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != e || index == 1) {
                newArr[i-index] = arr[i];
            } else {
                index = 1;
            }
        }

        return newArr;
    }
}
