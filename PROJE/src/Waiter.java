public class Waiter extends Kullanici implements SiparisAlabilir{

    public Waiter(int id,String name)
    {
        super(id,name);
    }

    @Override
    public void siparisAl()
    {
        System.out.println(getName() +" isimli garson sipariş aldı.");
    }

    @Override
    public void siparisHazirla()
    {
        System.out.println(getName() + " isimli garson siparişi hazırlıyor.");
    }



}
