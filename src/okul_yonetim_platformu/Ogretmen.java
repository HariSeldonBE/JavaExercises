package okul_yonetim_platformu;

public class Ogretmen extends Runner implements Islemler{

    @Override
    public void ekleme() {
        System.out.println("ogretmen ekleme");
        islemlerMenu();
    }

    @Override
    public void arama() {
        System.out.println("ogretmen arama");
        islemlerMenu();
    }

    @Override
    public void listeleme() {
        System.out.println("ogretmen listeleme");
        islemlerMenu();
    }

    @Override
    public void silme() {
        System.out.println("ogretmen silme");
        islemlerMenu();
    }
}
/*
 protected static void islemSecim() {

        switch (secilenIslem){
            case "1":
                ogretmenIslem.ekleme();
            case "2":
                ogretmenIslem.arama();
            case "3":
                ogretmenIslem.listeleme();
            case "4":
                ogretmenIslem.silme();
            case "q":
            case "Q":
                anaMenu();
            default:
                System.out.print("Yanlış giriş yaptınız. Lütfen 1,2,3,4 veya Q tuşlayınız: ");
                islemSecim();
        }
    }
 */