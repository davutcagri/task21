public class Gorevli extends Kisi {
    String gorevAlani;

    public void print() {
        super.print();
        System.out.println("Görev Alani: " + gorevAlani);
    }

    public Gorevli(String isim, String soyisim, int yas, String gorevAlani) {
        super(isim, soyisim, yas);
        this.gorevAlani = gorevAlani;
    }
}
