public class Urun {

    private String urunAdi;
    private int urunNumarasi;
    private double urunFiyati;
    private String yemekTürü;

    public Urun(int urunNumarasi, String urunAdi, double urunFiyati,String yemekTürü)
    {
        this.urunNumarasi = urunNumarasi;
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
        this.yemekTürü= yemekTürü;
    }

    public String getUrunAdi()
    {
        return urunAdi;
    }

    public double  getUrunFiyati()
    {
        return urunFiyati;
    }

    public void urunBilgisiGoster()
    {
        System.out.println(" Ürün numarası: " + urunNumarasi +
                           " ürün adı: " + urunAdi +
                           " Ürün fiyatı: " + urunFiyati +
                        " Yemek türü: " + yemekTürü
                );

    }



}
