package shopping;

import java.util.*;
import static shopping.data.lid;
import static shopping.data.lpassword;
class data
{
    static Scanner sc = new Scanner(System.in);
    static int[] pid = new int[5];
    static String[] pname= new String[5];
    static int[] pprice = new int[5];
    static int[] pqty = new int[5];
    static String[] cname = new String[3];
    static String[] cid = new String[3];
    static String[] cpassword = new String[3];
    static String lid,lpassword;
    static String[][] cartname = new String[3][10];
    static int[][] cartqty = new int[3][10];
    static int[][] cartid = new int[3][10];
    static int[][] cartprice = new int[3][10];
    static int carttotal;
    public void addproduct()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter product name : ");
            pname[i] = sc.next();
            pid[i] = (i+1);
            System.out.println("Enter product price : ");
            pprice[i] = sc.nextInt();
            System.out.println("Enter product QTY : ");
            pqty[i] = sc.nextInt();
            System.out.println("Product added successfull.");
        }
    }
    public void createaccount()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter your name : ");
            cname[i] = sc.next();
            System.out.println("Enter your useid : ");
            cid[i] = sc.next();
            System.out.println("Enter your password : ");
            cpassword[i] = sc.next();
            System.out.println("Account created successfull.");
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
            {
                System.out.println("Login Successful.");
                break;
            }
            if(i==(cid.length-1))
            {
            if(!lid.equals(cid[i])&&!lpassword.equals(cpassword[i]))
            {
                System.out.println("User Name or Password not match.");
                lpassword=null;
                lid=null;
                break;
            }
            }
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
        for(int i=0;i<3;i++)
        {
            if(lid.equals(cid[i])&&lpassword.equals(cpassword[i]))
            {
                for(int k=0;k<10;k++)
                {
                    if(cartname[i][k]==null)
                    {
                        System.out.println("Enter product name : ");
                        cartname[i][k] = sc.next();
                        System.out.println("Enter QTY : ");
                        cartqty[i][k] = sc.nextInt();
                        for(int j=0;j<5;j++)
                        {
                            if(cartname[i][k].equals(pname[j])&&cartqty[i][k]<=pqty[j])
                            {
                                cartprice[i][k] = pprice[j];
                                cartid[i][k] = pid[j];
                                pqty[j] = pqty[j]-cartqty[i][k];
                                System.out.println("Product added to cart successfull.");
                                break;
                            }
                            if(!cartname[i].equals(pname[j]))
                            {
                                System.out.println("Product not found.");
                                break;
                            }
                            if(cartqty[i][k]>pqty[j])
                            {
                                System.out.println("QTY is large then available QTY");
                                break;
                            }
                            break;
                        }
                    }
                    
                }
            }
        }
    }
    public void showcart()
    {
        System.out.format("%5s%20s%20s%20s%20s%20s","No.","Product ID","Product Name","Product Price","Product QTY","Total Price");
        for(int i=0;i<3;i++)
        {
            if(lid.equals(cid[i])&&lpassword.equals(cpassword[i]))
            {
                for(int k=0;k<10;k++)
                {
                    if(cartname[i][k]!=null)
                    {
                        System.out.println();
                        System.out.format("%5s%20s%20s%20s%20s%20s",(k+1),cartid[i][k],cartname[i][k],cartprice[i][k],cartqty[i][k],(cartprice[i][k]*cartqty[i][k]));
                    }
                }
                for(int k=0;k<9;k++)
                {
                    carttotal = (cartprice[i][k]*cartqty[i][k])+(cartprice[i][k+1]*cartqty[i][k+1]);
                }
                System.out.format("%5s%20s%20s%20s%20s%20s","","","","","total",carttotal);
            }
        }
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
           System.out.println("Select 6 for Show cart");
           System.out.println("Select 7 for buy items from cart");
           System.out.println("Select 8 for show purchase products");
           System.out.println("Select 9 for logout");
           System.out.println("Select 10 for exit");
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
                   if(lid==null&&lpassword==null)
                   {
                        System.out.println("Login first.");
                        break;
                   }
                   d.addcart();
                   break;
               case 6:
                   if(lid==null&&lpassword==null)
                   {
                        System.out.println("Login first.");
                        break;
                   }
                   d.showcart();
                   break;
               case 7:
                   if(lid==null&&lpassword==null)
                   {
                        System.out.println("Login first.");
                        break;
                   }
               case 8:
                   if(lid==null&&lpassword==null)
                   {
                        System.out.println("Login first.");
                        break;
                   }
               case 9:
                   if(lid==null&&lpassword==null)
                   {
                        System.out.println("Login first.");
                        break;
                   }
               case 10:
                   System.exit(0);
                   break;
               default :
                   System.out.println("Enter choice between 1 to 7.");
                   break;
           }
       }while(b); 
    }
}
