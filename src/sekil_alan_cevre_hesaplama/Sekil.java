package sekil_alan_cevre_hesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Sekil {
    /* Sekil classı abstract olarak tanımlanmıştır aşağıda tanımlanan
    abstart methodların child classlarda override edilmesi gerekir.*/
    public abstract double alan();
    public abstract double cevre();
}
