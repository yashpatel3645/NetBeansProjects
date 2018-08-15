package shopping;

import java.util.*;

class data
{
    static Scanner sc = new Scanner(System.in);
    static String[] pid = new String[5];
    static String[] pname= new String[5];
    static int[] pprice = new int[5];
    static int[] pqty = new int[5];
    static String[] cname = new String[3];
    static String[] cid = new String[3];
    static String[] cpassword = new String[3];
    static String lid,lpassword;
    static String[] cartname = new String[10];
    static int[] cartqty = new int[10];
    public void addproduct()
    {
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter product name : ");
            pname[i] = sc.next();
            System.out.println("Enter product id : ");
            pid[i] = sc.next();
            System.out.println("Enter product price : ");
            pprice[i] = sc.nextInt();
            System.out.println("Enter product QTY : ");
            pqty[i] = sc.nextInt();
        }
    }
    public void createaccount()
    {
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter your name : ");
            cname[i] = sc.next();
            System.out.println("Enter your useid : ");
            cid[i] = sc.next();
            System.out.println("Enter your password : ");
            cpassword[i] = sc.next();    
        }
    }
    public void login()
    {
        System.out.println("Enter your userid : ");
        lid = sc.next();
        System.out.println("Enter your password : ");
        lpassword = sc.next();
        for(int i=0;i<3;i++)
        {
            if(lid.equals(cid[i])&&lpassword.equals(cpassword[i]))
                System.out.println("Login Successful.");
        }
        for(int i=0;i<3;i++)
        {
            if(!lid.equals(cid[i])&&!lpassword.equals(cpassword[i]))
                System.out.println("User Name or Password not match.");
                break;
        }
    }
    public void showproduct()
    {
        System.out.format("%5s%20s%20s%20s%20s","No.","Product ID","Product Name","Product Price","Product QTY");
        for(int i=0;i<5;i++)
        {
            System.out.println();
            System.out.format("%5s%20s%20s%20s%20s",(i+1),pid[i],pname[i],pprice[i],pqty[i]);
        }
        System.out.println();
    }
    public void addcart()
    {
        
    }
}
public class Shopping
{
    static int choice;
    static boolean b=true;
    static Scanner sc = new Scanner(System.in);
    static data d = new data();
    public static void main(String[] args)
    {
       do
       {
           System.out.println("Select 1 for enter products");
           System.out.println("Select 2 for create  account");
           System.out.println("Select 3 for login");
           System.out.println("Select 4 for show product");
           System.out.println("Select 5 for Add product into cart");
           System.out.println("Select 6 for buy items from cart");
           System.out.println("Select 7 for show purchase products");
           System.out.println("Select 8 for logout");
           System.out.println("Select 9 for exit");
           try
           {
               choice = sc.nextInt();
           }
           catch(NumberFormatException e)
           {
               System.out.println("Error 100 : Enter choice between 1 to 7.");
           }
           switch(choice)
           {
               case 1:
                   d.addproduct();
                   break;
               case 2:
                   d.createaccount();
                   break;
               case 3:
                   d.login();
                   break;
               case 4:
                   d.showproduct();
                   break;
               case 5:
                   d.addcart();
                   break;
               case 6:
                   
               case 9:
                   System.exit(0);
                   break;
               default :
                   System.out.println("Enter choice between 1 to 7.");
                   break;
           }
       }while(b); 
    }
}
