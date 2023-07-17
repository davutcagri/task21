import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ogretmenDersleri = new ArrayList();
        ogretmenDersleri.add("Java'ya Giriş");
        ogretmenDersleri.add("Java da OOP");
        ogretmenDersleri.add("Spring Framework");
        ogretmenDersleri.add("Matematik");
        ogretmenDersleri.add("Fizik");

        Ogrenci ogrenci = new Ogrenci("Davut Çağrı", "Akbıyık", 19, 98.5);
        Ogretmen ogretmen = new Ogretmen("Umut Serdar", "Demir", 22, ogretmenDersleri, "Mühendislik");
        Gorevli gorevli = new Gorevli("Ali", "Yılmaz", 45, "Bahçe");

        ogrenci.print();
        ogretmen.print();
        gorevli.print();
    }
}