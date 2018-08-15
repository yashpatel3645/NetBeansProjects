package core;
interface A{
    void getid(int i);
    void getname(String n);
    int setid();
    String setname();
}
class user implements A
{
    int id;
    String name;
    public void getid(int i)
    {
        id=i;
    }
    public void getname(String n)
    {
        name=n;
    }
    public int setid()
    {
     return id;   
    }
    public String setname()
    {
        return name;
    }
}
class user1 implements A
{
    private int id;
    private String name;
   
    public void getid(int i)
    {
        id=i;
    }
    
    public void getname(String n)
    {
        name=n;
    }
    public int setid()
    {
     return id;   
    }
    
    public String setname()
    {
        return name;
    }
}
public class test 
{
    void savedata(A b)
    {
        System.out.println(b.setid());
        System.out.println(b.setname());
    }
    public static void main(String[] args)
    {
        test t = new test();
        A u = new user();
        u.getid(10);
        u.getname("yash");
        t.savedata(u);
        A g = new user1();
        g.getid(4);
        g.getname("hii");
        t.savedata(g);
    }
}