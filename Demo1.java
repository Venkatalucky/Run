public class Demo1
{
    int a =2;
    int b =3;
    String name ;
    int class ;
    String town;
    String district;
    String State;
    int pincode;
    public Demo1(String name, int class, String town, String district, String State, int pincode)
    {
        this.name = name ;
        this.class = class;
        this.town = town;
        this.district = district;
        this.State = State;
        this.pincode = pincode;
    }

    public static void main(String [] args)
    {
        Demo demo = new Demo();
        System.out.println("main starts");
        System.out.println(demo.a);
        System.out.println(demo.b);
        System.out.println("Main ends");
        
    }
}