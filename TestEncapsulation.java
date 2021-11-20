public class TestEncapsulation {

    public static void main(String args[]){

        PintColDepart obj=new PintColDepart();

        obj.setCollegeName("SCTIT");
        obj.setDepartment("IT");

        System.out.println("Collegename:" + obj.getCollegeName());
        System.out.println("Department:" + obj.getDepartname());

     //   System.out.println("First College name is " + obj.getCollegeName());
       // System.out.println("Department is "+ obj.getDepartment());

        obj.setCollegeName("UVC");
        obj.setDepartment("CS");
        System.out.println("Collegename:" + obj.getCollegeName());
        System.out.println("Department:" + obj.getDepartname());

        obj.setCollegeName("NITK");
        obj.setDepartment("CS");
        System.out.println("Collegename:" + obj.getCollegeName());
        System.out.println("Department:" + obj.getDepartname());

        obj.setCollegeName("Expert");
        obj.setDepartment("CS");
        System.out.println("Collegename:" + obj.getCollegeName());
        System.out.println("Department:" + obj.getDepartname());

        obj.setCollegeName("SJCE");
        obj.setDepartment("MECG");
        System.out.println("Collegename:" + obj.getCollegeName());
        System.out.println("Department:" + obj.getDepartname());


        //System.out.println("Collegename:" + obj.getCollegeName());
        //System.out.println("Collegename:" + obj.getDepartname());




    }
}
