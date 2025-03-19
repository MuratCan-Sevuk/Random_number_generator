import java.math.*;

class Rastgele {

    long rastgele(int sinir) { //sınır sayısı ile 0 arasında (sınır dahil değil) rastgele bir sayı döndürür
        long rastgeleSayi = ((1101 * System.currentTimeMillis()) + 1) % sinir;
        return rastgeleSayi;
    }

     long rastgele(int altSinir, int ustSinir) {
        long fark = ustSinir - altSinir;
        long rastgeleSayi = ((1101 * System.currentTimeMillis()) + 1) % fark;
        return rastgeleSayi + altSinir;
    }

    long rastgele() {
        long maxSayi = (long) Math.pow(2, 17);
        long rastgeleSayi = ((1101 * System.currentTimeMillis()) + 1) % maxSayi;
        long offset = (long) Math.pow(2, 16);
        rastgeleSayi = rastgeleSayi - offset;
        return rastgeleSayi;
    }
    long rastgele(int root,int altSinir, int ustSinir){
        long fark = ustSinir - altSinir;
        long rastgeleSayi = ((1101 * root) + 1 ) % fark;
        rastgeleSayi=altSinir+rastgeleSayi;
        return rastgeleSayi;
    }


    public static void main(String[] args) {
        Rastgele random = new Rastgele();
        System.out.println(random.rastgele(24,45));
    }
}
