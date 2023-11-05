package okul_yonetim_platformu;

public interface Islemler {
    Ogrenci ogrenciIslemleri = new Ogrenci();
    Ogretmen ogretmenIslemleri = new Ogretmen();

    void ekleme ();
    void arama ();
    void listeleme ();
    void silme ();
}
/* protected static void beklemeEkrani() {
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
    }*/