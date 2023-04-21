class Rick  //class GetClass extends Object
{
    public int No1;
    public int No2;
}
class HashCodeDemo  //class GetClassDemo extends Object
{
    public static void main(String Arg[])
    {
        Rick robj= new Rick();
        System.out.println("HashCode of robj is:"+robj.hashCode());
    }
}
