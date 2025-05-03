
# **Rastgele Sayı Üretici (Rastgele Class)**

Bu Java sınıfı, farklı parametreler kullanarak rastgele sayılar üretmek için çeşitli yöntemler sunar. Kullanıcı, belirli bir aralıkta veya sınırsız şekilde rastgele sayılar elde edebilir.

## **Özellikler:**

* **`rastgele(int sinir)`**: Bu metot, verilen `sinir` değeri kadar 0 ile sinir arasında rastgele bir sayı döndürür.
* **`rastgele(int altSinir, int ustSinir)`**: Bu metot, verilen `altSinir` ve `ustSinir` arasındaki sayılar arasında rastgele bir sayı döndürür.
* **`rastgele()`**: Bu metot, `2^17` (131072) kadar bir sayı aralığında rastgele bir sayı üretir. Sayı, `2^16` (65536) bir offset ile düzeltilmiştir.
* **`rastgele(int root, int altSinir, int ustSinir)`**: Bu metot, belirli bir `root` değeriyle, `altSinir` ve `ustSinir` arasındaki sayılar arasında rastgele bir sayı üretir.

## **Gereksinimler:**

* Java 8 veya daha yeni bir sürüm gereklidir.

## **Kullanım:**

1. `Rastgele` sınıfını kullanarak rastgele sayılar üretmek için aşağıdaki örneği inceleyebilirsiniz.

```java
Rastgele random = new Rastgele();
System.out.println(random.rastgele(24,45)); // 24 ile 45 arasındaki rastgele sayıyı döndürür
```

2. İhtiyacınıza göre farklı `rastgele()` metodlarını kullanabilirsiniz:

   * `random.rastgele(10)` ile 0 ile 10 arasında rastgele bir sayı alabilirsiniz.
   * `random.rastgele(5, 50)` ile 5 ile 50 arasındaki rastgele bir sayı alabilirsiniz.

## **Açıklamalar:**

* **Sayı Üretimi:** Rastgele sayılar üretirken, `System.currentTimeMillis()` fonksiyonu kullanılarak zaman tabanlı bir sayı üretme işlemi yapılır. Bu, sayıların rastgele ve genellikle öngörülemez olmasını sağlar.
* **Modül Hesaplama:** Üretilen sayı, belirtilen aralığa göre modüler bir hesaplama ile ayarlanır.

## **Örnek Çıktı:**

```java
Rastgele random = new Rastgele();
System.out.println(random.rastgele(10));  // Çıktı: 0 ile 10 arasında bir sayı
System.out.println(random.rastgele(5, 50));  // Çıktı: 5 ile 50 arasında bir sayı
System.out.println(random.rastgele());  // Çıktı: -32768 ile 32767 arasında bir sayı
```

