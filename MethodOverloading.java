public class MethodOverloading {

    void GreatestNumber(int a, int b) {
        if (a > b)

            System.out.println(a + " is greated than " + b);
        else if (b > a)
            System.out.println(b + " is greated than " + a);
        else
            System.out.println("Both number are equal");

    }

    void GreatestNumber(int a, int b, int c)
    {
        if (a >= b && a >= c)
            System.out.println(a + "Largest number");
        else if (b >= a && b >= c)
            System.out.println(b + "Largest number");
        else
            System.out.println(c + "Largest number");
    }


    public static void main(String[] args)
    {
        MethodOverloading obj=new MethodOverloading();
        obj.GreatestNumber(2,3);
        obj.GreatestNumber(4,5,6);
    }

}



