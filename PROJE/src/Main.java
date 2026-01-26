import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//ürünler oluşturuldu
        Urun pizza = new Urun(1, "Pizza", 50, "Ana Yemek");
        Urun burger = new Urun(2, "Burger", 30, "Ana Yemek");
        Urun ayran = new Urun(3, "Ayran", 10, "İçecek");
        Urun kola = new Urun(4, "Kola", 15, "İçecek");
        Urun salata = new Urun(5, "Salata", 20, "Yan Yemek");
        Urun tatli = new Urun(6, "Tatlı", 25, "Tatlı");

//kullanıcılar olusturuldu
        Customer musteri1 = new Customer(1, "Ali");
        Customer musteri2 = new Customer(2, "Ayşe");
        Waiter garson1 = new Waiter(1, "Ahmet");
        Waiter garson2 = new Waiter(2, "Mehmet");
        Admin admin = new Admin(1, "Fatma");

//siparisler olusturuldu
        Siparis siparis1 = new Siparis(1);
        Siparis siparis2 = new Siparis(2);

//1.musteri siparis veriyor
        siparis1.urunEkle(pizza);
        siparis1.urunEkle(ayran);
        siparis1.urunEkle(tatli);
        siparis1.urunCikar(burger); // bulunmadığı için uyarı verecek
        siparis1.toplamHesapla();

//2.musteri siparis veriyor
        siparis2.urunEkle(burger);
        siparis2.urunEkle(kola);
        siparis2.urunEkle(salata);
        siparis2.toplamHesapla();

//garsonlar siparisi aliyor ve hazirliyor
        garson1.siparisAl();
        garson1.siparisHazirla();
        siparis1.siparisDurumu("Hazırlanıyor");

        garson2.siparisAl();
        garson2.siparisHazirla();
        siparis2.siparisDurumu("Hazırlanıyor");


//Admin menüden  ekleme cikarma yapabilir
        Urun cay = new Urun(7, "Çay", 8, "İçecek");
        


        System.out.println("\n=== Sipariş 1 Bilgileri ===");
        siparis1.siparisBilgisiGoster();

        System.out.println("\n=== Sipariş 2 Bilgileri ===");
        siparis2.siparisBilgisiGoster();
    }
}
