
class Base
{
    public int A;
    public Base()//default constructor
    {
        System.out.println("Inside base default constructor");
    }
    public Base(int i)
    {
        System.out.println("Inside base parameterized constructor");
        this.A=i;
    }
    public void fun()
    {
        System.out.println("Inside base fun");
        this.A=11;
    }
}

class Derived extends Base// class Derived: public Base
{
    
    public int A;
    public Derived()//default constructor
    {
        super(11);            //this should always be the first line in a constructor                          //3
        System.out.println("Inside Derived constructor");
        this.A =51;
    }
    public void gun()
    {
        System.out.println("Inside derived gun");
        System.out.println("Value of A:"+this.A);  //1
        System.out.println("Value of A:"+super.A);
        fun();
        super.fun();                                   //2
    }
}



class Superdemo
{
    public static void main(String Agr[])
    {
       Derived dobj= new Derived();
       dobj.gun();
    }
}