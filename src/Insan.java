import java.util.Random;

public class Insan {
    private String isim;
    private String soyisim;
    private String[] isimler = {"Ali","Veli","Ahmet","Ayşe","Fatma"};
    private String[] soyisimler = {"Demir","Okkay","Çakmak","Gümrükçü"};

    public Insan(String isim,String soyisim){
        this.isim = isim;
        this.soyisim = soyisim;
    }
    public Insan(){
        Random random = new Random();
        int isimIndex = random.nextInt(isimler.length);
        int soyIsimIndex = random.nextInt(soyisimler.length);
        this.isim = isimler[isimIndex];
        this.soyisim = soyisimler[soyIsimIndex];
    }



}
