abstract class Denomination {

    public abstract void bankNamehdfc();
    public  abstract  void bankNameICI();
    public  abstract void  bankNameSBI();


}
class bank extends Denomination{


    public void bankNameSBI()
    {
        System.out.println("Available denomination" +2000);
    }
    public void bankNamehdfc()
    {
        System.out.println("Available denomination" +500);
    }
    public  void bankNameICI()
    {
        System.out.println("Available denomination" +500);
    }
}


