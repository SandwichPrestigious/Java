class Rick  //class GetClass extends Object
{
    public int No1;
    public int No2;
    public Rick()
    {   
        System.out.println("Inside default constructor");
        No1=0;
        No2=0;
    }
    public Rick(int a, int b)
    {
        System.out.println("Inside parameterized constructor");
        No1=a;
        No2=b;
    }
    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}
class FinalizeDemo  //class GetClassDemo extends Object
{
    public static void main(String Arg[])
    {
        Rick robj1= new Rick();
        Rick robj2= new Rick(11,21);
        robj1= null;
        robj2=null; 
        System.gc();
    }
}
