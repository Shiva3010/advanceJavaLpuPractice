public class Overloading
{
    void demo(long l)
    {
        System.out.println("Long");
    }
    void demo(short l)
    {
        System.out.println("short");
    }
    void demo(float l)
    {
        System.out.println("Float");
    }

    public static void main(String[] rk)
    {
        Overloading ob = new Overloading();
        ob.demo(5);
    }
}