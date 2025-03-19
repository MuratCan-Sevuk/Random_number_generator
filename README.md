Rastgele Sayı Üretici (Java)

Bu proje, Java'da rastgele sayılar üretmek için geliştirilmiş özel bir sınıftır. Rastgele sınıfı, belirli sınırlar arasında veya belirli bir kök değer (root) ile rastgele sayılar oluşturabilir.

Bunu yaparken  sistem zamanını kullanır.(modunu alır) 

--Özellikler--

-Belirtilen Üst Sınıra Kadar Rastgele Sayı Üretimi

-Belirtilen Alt ve Üst Sınır Arasında Rastgele Sayı Üretimi

-Negatif ve Pozitif Değerler Arasında Rastgele Sayı Üretimi

-Özel Kök Değeri (root) ile Rastgele Sayı Üretimi

--Kullanım--

1. rastgele(int sinir)

Belirtilen sınır içinde (0 dahil, sınır hariç) rastgele bir sayı döndürür.

Rastgele random = new Rastgele();
System.out.println(random.rastgele(100)); // 0-99 arasında bir sayı üretir

2. rastgele(int altSinir, int ustSinir)

Belirtilen alt ve üst sınır arasında rastgele bir sayı üretir.

System.out.println(random.rastgele(10, 50)); // 10 ile 49 arasında bir sayı üretir

3. rastgele()

Varsayılan olarak ±16384 (2^16) arasında rastgele bir sayı üretir.

System.out.println(random.rastgele());

4. rastgele(int root, int altSinir, int ustSinir)

Belirtilen bir kök (root) ile rastgele bir sayı üretir.

System.out.println(random.rastgele(1234, 5, 30)); //5 ile 29 arasında kökü kullanarak random sayı üretir .Kodu her çalıştırmada kök değişmediği için aynı random sayıyı döndürür.

--Çalıştırma--

Bu sınıfı çalıştırmak için aşağıdaki adımları izleyin:

Rastgele.java dosyasını indirin veya kopyalayın.

Bir Java derleyicisi veya IDE (IntelliJ, Eclipse, VS Code vb.) kullanarak çalıştırın.

--Lisans--

Bu proje MIT lisansı ile lisanslanmıştır. Dilediğiniz gibi kullanabilir ve geliştirebilirsiniz.

