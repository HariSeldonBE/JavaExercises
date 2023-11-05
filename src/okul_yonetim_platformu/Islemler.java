package okul_yonetim_platformu;

public interface Islemler {
    Ogrenci ogrenciIslemleri = new Ogrenci();
    Ogretmen ogretmenIslemleri = new Ogretmen();

    void ekleme ();
    void arama ();
    void listeleme ();
    void silme ();
}