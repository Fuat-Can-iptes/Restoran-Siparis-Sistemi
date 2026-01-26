public class Customer extends Kullanici implements SiparisVerebilir{

    public Customer(int id,String name)
    {
        super(id,name);
    }

    @Override
    public  void siparisVer()
    {
        System.out.println(getName() + " siparis verdi.");
    }

    @Override
    public void siparisIptalEt()
    {
        System.out.println(getName() + " siparisi iptal etti ! ");
    }
}
