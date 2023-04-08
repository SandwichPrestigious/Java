class Demo
{
    public int Addition(int a, int b)
    {
        return a+b;
    }
    public int Addition(int a, int b, int c)
    {
        return a+b+c;
    }
    public int Addition(double a , double b)
    {
        return a+b;
    }
    public int Addition(double a, double b, double c)
    {
        return a+b+c;
    }
}


class Overloading
{
    public static void main(String Arg[])
    {
        Demo obj= new Demo();
        int a=10 ,b=20,c=30, iRet=0;
        double x=10.0, y=90.7, dRet= 0.0;

        iRet= obj.Addition(a,b);    //call 9
        System.out.println(iRet);
        iRet= obj.Addition(a,b,c);  //call 13
        System.out.println(iRet);

        dRet= obj.Addition(a,b);    //call 17
        System.out.println(dRet);
        dRet= obj.Addition(a,b,c);  //call 21
        System.out.println(dRet);
    }
}