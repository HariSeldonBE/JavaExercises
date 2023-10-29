import java.util.ArrayList;
import java.util.List;

public class C08_KullanicidanNTaneFibonacciDizisi {

    // Verilen pozitif bir n tamsayisini alarak,
    // bize ilk n tane tane Fibonacci sayisini
    // bir list olarak donduren bir method olusturun.

    public static void main(String[] args) {

        System.out.println(fibonacciListesiOlustur(5)); // [0, 1, 1, 2, 3]
        System.out.println(fibonacciListesiOlustur(10)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

    }
    public static List<Integer> fibonacciListesiOlustur(int listedekiSayiAdedi){
       List<Integer> fibonacciList = new ArrayList<>();
       if (listedekiSayiAdedi == 1){
           fibonacciList.add(0);
       } else if (listedekiSayiAdedi == 2) {
           fibonacciList.add(0);
           fibonacciList.add(1);
       }else {

           fibonacciList.add(0);
           fibonacciList.add(1);

           for (int i = 2; i < listedekiSayiAdedi; i++){
               fibonacciList.add(fibonacciList.get(i-1) +fibonacciList.get(i-2));
           }


       }

        return fibonacciList;
    }

}
