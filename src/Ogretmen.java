import java.util.List;

public class Ogretmen extends Kisi {
    List<String> dersler;
    String bolum;

    public void print() {
        super.print();
        System.out.println("Verdiği Dersler: " + dersler);
        System.out.println("Bölümü: " + bolum);
    }

    public Ogretmen(String isim, String soyisim, int yas, List<String> dersler, String bolum) {
        super(isim, soyisim, yas);
        this.dersler = dersler;
        this.bolum = bolum;
    }
}
