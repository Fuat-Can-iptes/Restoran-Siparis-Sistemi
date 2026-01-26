import java.util.ArrayList;
public class Siparis {

    private int siparisNumarasi;
    private double toplamTutar;
    private String siparisDurumu;
    private ArrayList<Urun> urunListesi;

    public Siparis(int siparisNumarasi)
    {
        this.siparisNumarasi = siparisNumarasi;
        this.toplamTutar = 0.0;
        this.siparisDurumu = "yeni";
        this.urunListesi = new ArrayList<>();
    }

    public void urunEkle(Urun urun)
    {
        this.urunListesi.add(urun);
        System.out.println(urun.getUrunAdi() +  " siparise eklendi ");
    }

    public void  urunCikar(Urun urun) {
        if (urunListesi.isEmpty()) {
            System.out.println(" Henüz siparis listesine ürün eklenmedi ! ");
        } else if (urunListesi.contains(urun)) {
            urunListesi.remove(urun);
            System.out.println(urun.getUrunAdi() + "siparisten cıkarildi !");
        } else {
            System.out.println(urun.getUrunAdi() + " sipariste bulunamadı !");
        }
    }

        public void toplamHesapla()
        {
            toplamTutar = 0;

            for(Urun u: urunListesi)
            {
              toplamTutar += u.getUrunFiyati();
            }

            System.out.println("Toplam tutar : " + toplamTutar);
    }

    public void siparisDurumu(String durum)
    {
        this.siparisDurumu = durum;
        System.out.println("Siparis durumu : " + siparisDurumu);
    }

    public void siparisBilgisiGoster()
    {
        System.out.println(" siparis numarasi : " + siparisNumarasi);

        for(Urun u: urunListesi)
        {
            System.out.println(u.getUrunAdi() + " : " + u.getUrunFiyati());
        }

        System.out.println("Toplam tutar : " + toplamTutar);
        System.out.println("Durum: " + siparisDurumu);
    }



}
