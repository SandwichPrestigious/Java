import java.awt.*;

class MarvellousFrame
{   
    public Frame fobj;
    public MarvellousFrame(String title)
    {
        Frame fobj= new Frame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);
    }
}
class GUI3
{
    public static void main(String Ar[])
    {
        MarvellousFrame mobj= new MarvellousFrame("PPA");
    }
}