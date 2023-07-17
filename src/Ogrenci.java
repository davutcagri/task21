public class Ogrenci extends Kisi {
    double notOrtalamasi;

    public void print() {
        super.print();
        System.out.println("Not Ortalaması: " + notOrtalamasi);
    }

    public Ogrenci(String isim, String soyisim, int yas, double notOrtalamasi) {
        super(isim, soyisim, yas);
        this.notOrtalamasi = notOrtalamasi;
    }
}
