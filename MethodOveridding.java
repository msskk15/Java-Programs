public class MethodOveridding
{

   int num1,num2;
    int add(int a,int b)
   {
       return(a+b);
   }

}
class StringAdd extends  MethodOveridding
{

    String add(String str1, String str2)
    {
        String str3 = str1 + str2;
        return(str3);
      //  System.out.print(str3 + "string");

    }

}

