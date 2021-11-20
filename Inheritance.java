public class Inheritance {

    public static void main(String[] args)
    {
        HomeBase r1=new HomeBase();
        System.out.println(r1.noOfLights(20));
        Room1 r2=new Room1();
        System.out.println(r2.noOfLights(3));
        Room2 r3=new Room2();
        System.out.println(r3.noOfLights(67));


    }

}
