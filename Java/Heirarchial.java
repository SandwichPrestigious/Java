


class Heirarchial
{
    public static void main(String Arg[])
    {
       //Base bobj= new Base();// no casting 
        DerivedX dobj= new DerivedX();// no casting
        dobj.fun();
        dobj.gun();

        System.out.println(dobj.A); //11
        System.out.println(dobj.B); //21
        System.out.println(dobj.X); //51
        System.out.println(dobj.Y); //101
        System.out.println(dobj.Z); //111

       // Base bobj2= new Derived();// upcasting
        //Derived dobj2= new Base();//downcasting
    }
}
class Base
{
    public int A;
    public int B;

    public Base()//default constructor
    {
        System.out.println("Inside base constructor");
    }
    public void fun()
    {
        System.out.println("Inside base fun");
        this.A=11;
        this.B=21;
    }
}

class Derived extends Base// class Derived: public Base
{
    public int X;
    public int Y;

    public Derived()//default constructor
    {
        System.out.println("Inside Derived constructor");
        this.X=51;
        this.Y=101;
    }
    public void gun()
    {
        System.out.println("Inside base gun");
    }
}

class DerivedX extends Base
{
    public int Z;

    public DerivedX()
    {
        System.out.println("Inside DerivedX constructor");
        this.Z=111;
    }
    
}
