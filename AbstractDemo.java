/* abstract class Car
{
    double mileage;
    Car()
    {
        //super();
        System.out.println("Car created...");
    }
    void accelerate()
    {
        System.out.println("Accelerating... ");
    }
    abstract void brake();
    abstract void drive();
}

class AbstractDemo
{
    public static void main (String[] rk)
    {
        Car c1 = new Car();
        c1.accelerate();
    }
}
class BMW extends Car
{ //alleredy accelerated()
    void drive()
    {
        System.out.println("Diving bmw");
    }
    void brake()
    {}
    public void main(String[] rk)
    {
        BMW ob = new BMW();
        ob.accelerate();
    }
}

abstract class Honda extends Car{}*/
class InheritanceDemo
{
    public static void main(String[] rk)
    {
        BMW ob = new BMW();
        ob.buy();
    }
}

abstract class Car
{
    Car()
    {
        System.out.println("Car");
    }
    void buy()
    {
        System.out.println("Car cannot be bought");
    }
    abstract brake();
}
class BMW extends Car
{
    BMW()
    {
        System.out.println("BMW");
    } 
    @Override 
     void brake()
    {
        System.out.println("BMW brake");
    }

    public void buy()
    {
        System.out.println("Buy BMW");

    }
    
}