package shopping;

import java.util.Scanner;

class data
{
    static int no;
}
public class Shopping
{
    static int choice;
    static boolean b=true;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
       do
       {
           System.out.println("Select 1 for enter products");
           System.out.println("Select 2 for create  account");
           System.out.println("Select 3 for login");
           System.out.println("Select 4 for show product");
           System.out.println("Select 5 for purchase product");
           System.out.println("Select 6 for logout");
           System.out.println("Select 7 for exit");
           try
           {
               choice = sc.nextInt();
           }
           catch(NumberFormatException e)
           {
               System.out.println("Enter choice between 1 to 7.");
           }
       }while(b); 
    }
}
