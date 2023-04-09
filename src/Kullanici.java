import java.util.Random;

public class Kullanici {
    private String isim;
    private String ulke;
    private int dogumYili;
    private static int kullaniciSayisi = 0;

    public Kullanici(String isim, String ulke, int dogumYili) {
        this.isim = isim;
        this.ulke = ulke;
        this.dogumYili = dogumYili;
        kullaniciSayisi++;
    }

    public Kullanici() {

        Random rnd = new Random();
        this.dogumYili = rnd.nextInt(2023);
        kullaniciSayisi++;
    }
}
