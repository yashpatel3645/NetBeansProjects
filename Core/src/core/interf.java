package core;
interface Bank
{
    void login();
    void createAccount();
    void Logout();
    void transfer();
    void FD();
    void viewdeatil();
}
abstract class hi implements Bank
{
   public void viewdetail(){System.out.println("hello");}
            }
abstract public class interf extends hi
{
    @Override
    public void login(){}
    @Override
    public void createAccount(){}
    @Override
    public void Logout(){}
    @Override
    public void transfer(){}
    @Override
    public void FD(){}
    public static void main(String[] args) 
    {
        
    }
}