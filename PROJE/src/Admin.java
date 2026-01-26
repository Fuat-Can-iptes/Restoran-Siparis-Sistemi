public class Admin extends Kullanici implements MenuYonetebilir {

    public Admin(int id,String name)
    {
        super(id,name);
    }

    public  void urunEkle()
    {
        System.out.println(getName() + " adlı Admin ürün ekledi");
    }

    public void urunSil()
    {
        System.out.println(getName() + " adlı Admin ürün sildi ! ");
    }
}
