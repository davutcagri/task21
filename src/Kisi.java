import java.util.Random;

public abstract class Kisi {
    long kimlikNo;

    int yas;
    String isim;
    String soyisim;

    public void print() {
        System.out.println("-------------------------");
        System.out.println("Kimlik No: " + kimlikNo);
        System.out.println("İsim: " + isim);
        System.out.println("Soyisim: " + soyisim);
        System.out.println("Yaş: " + yas);
    }

    public Kisi(String isim, String soyisim, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;

        Random random = new Random();
        long randomNumber = random.nextLong() % 100000000000L; // 11 basamaklı sayıyı elde etmek için %100000000000L kullanıyoruz
        if (randomNumber < 0) {
            randomNumber *= -1; // Negatif sayıyı pozitife çeviriyoruz
        }

        this.kimlikNo = randomNumber;
    }

    public long getKimlikNo() {
        return kimlikNo;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }
}
