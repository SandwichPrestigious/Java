class Student implements Cloneable
{
    public String name;
    public int marks;
    public int age;

    public Student(String str, int a, int b)
    {
        this.name= str;
        this.marks= a;
        this.age= b;
    }

    public Object clone() throws CloneNotSupportedException
    {
        
        return super.clone();
    }
}
class CloneMethod
{
    public static void main(String Arg[])
    {
        try
        {
        Student sobj1= new Student("Swaroop",87,19);
        Student sobj2= (Student)sobj1.clone();

        System.out.println("Name:"+sobj1.name);
        System.out.println("Name:"+sobj1.age);
        System.out.println("Name:"+sobj1.marks);

        System.out.println("Name:"+sobj2.name);
        System.out.println("Name:"+sobj2.age);
        System.out.println("Name:"+sobj2.marks);



        }
        catch(Exception sobj)
        {

        }
    }
}