package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Sekil {

    protected static void beklemeEkrani() {
        // Her işlemden sonra 5 saniye bekleme süresi
        try {
            Thread.sleep(400);
            System.out.print("...");
            Thread.sleep(400);
            System.out.print("......");
            Thread.sleep(400);
            System.out.print("............");
            Thread.sleep(400);
            System.out.print("........................");
            Thread.sleep(400);
            System.out.print("................................................\n\n");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // İstisna işleme
            e.printStackTrace();
        }
    }




    /* Sekil classı abstract olarak tanımlanmıştır aşağıda tanımlanan
        abstart methodların child classlarda override edilmesi gerekir.*/
    public abstract double alan();
    public abstract double cevre();
}
