package bank;
import static bank.Data.lid;
import static bank.Data.lpassword;
import java.util.*;
class Data
{
    static String name[] = new String[3];
    static String accountnum[] = new String[3];
    static String id[] = new String[3];
    static String password[] = new String[3];
    static Scanner sc = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    static int[] amount = new int[3];
    static int[] FD = new int[3];
    static String lid,lpassword,pname,paccountno;
    static int pamount;
     static boolean hello = false;
    public void create()
    {
         for(int i=0;i<3;i++)
                    {
                        System.out.println("Enter your Name : ");
                        name[i] = sc.nextLine();
                        System.out.println("Enter your User Name : ");
                        id[i] = sc.nextLine();
                        System.out.println("Enter your Password : ");
                        password[i] = sc.nextLine();
                        System.out.println("Enter your Amount : ");
                        amount[i] = in.nextInt();
                        accountnum[i]="00"+(i+1);
                        System.out.println("Your acoount has been created successfully.");
                        System.out.println("Your Account Number is "+accountnum[i]);
                    }
    }
    public void login()
    {
        System.out.println("Enter User Name : ");
                    lid = sc.nextLine();
                    System.out.println("Enter Your Password : ");
                    lpassword = sc.nextLine();
                    for(int i=0;i<3;i++)
                    {
                        if(lid.equals(id[i])&&lpassword.equals(password[i]))
                            System.out.println("Login Successful.");
                    }
                    for(int i=0;i<3;i++)
                    {
                        if(!lid.equals(id[i])&&!lpassword.equals(password[i]))
                            System.out.println("User Name or Password not match.");
                            break;
                    }
    }
    public void Display()
    {
        for(int i=0;i<3;i++)
                    {
                        if(lid==null&&lpassword==null)
                        {
                           System.out.println("Please Login First.");
                           break;
                        }
                        if(lid.equals(id[i])&&lpassword.equals(password[i]))
                        {
                            System.out.println("Account Holder Name = "+name[i]);
                            System.out.println("Account Number = "+accountnum[i]);
                            System.out.println("User Name = "+id[i]);
                            System.out.println("Amount = "+amount[i]);
                            System.out.println("FD Amount = "+FD[i]);
                        }
                    }
    }
    public void Transfer()
    {
        
                    System.out.println("Enter Paypee Name : ");
                    pname = sc.nextLine();
                    System.out.println("Enter Paypee Account No : ");
                    paccountno = sc.nextLine();
                    System.out.println("Enter Amount to Transfer : ");
                    pamount = in.nextInt();
                    for(int i=0;i<3;i++)
                    {
                        if(pname.equals(name[i])&&paccountno.equals(accountnum[i]))
                        {
                            
                            for(int j=0;j<3;j++)
                            {
                                if(lid.equals(id[j])&&lpassword.equals(password[j]))
                                {
                                    hello=true;
                                    if(pamount<=amount[j])
                                    {
                                        amount[j] = amount[j]-pamount;
                                        amount[i]=amount[i]+pamount;
                                        System.out.println("Your Transaction Successfully");
                                        System.out.println("Transaction Detail : ");
                                        System.out.println("        Paypee Name       : "+pname);
                                        System.out.println("        Paypee Account No : "+paccountno);
                                        System.out.println("        Transferd Amount  : "+pamount);
                                    }
                                    else
                                        System.out.println("Transaction fail because your balance is low.");
                                    
                                        break;
                                }
                            }
                        }
                    }
                    if(!hello)
                            System.out.println("Paypee account does not exits.");
    }
    public void FD()
    {
        for(int i=0;i<3;i++)
                    {
                        if(lid==null&&lpassword==null)
                        {
                           System.out.println("Please Login First.");
                           break;
                        }
                        if(lid.equals(id[i])&&lpassword.equals(password[i]))
                        {
                            System.out.println("Enter amount for FD : ");
                            FD[i] = in.nextInt();
                            if(FD[i]<=amount[i])
                            {
                                amount[i] = amount[i]-FD[i];
                                System.out.println("FD Done Successfully.");
                                System.out.println("FD price is "+FD[i]);
                            }
                            else
                                System.out.println("Fail!!!!\nFD price is greater then your account balance.");
                        }
                    }
    }
}
public class Bank 
{
    static Data d = new Data();
    static Scanner sc = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    
    
    static int choice;
    static boolean loop = true;
   
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Bank\n");
        do
        {
            System.out.println("Select 1 for Open Account");
            System.out.println("Select 2 for Login");
            System.out.println("Select 3 for Account Detail");
            System.out.println("Select 4 for Fund Transfer");
            System.out.println("Select 5 for Open FD");
            System.out.println("Select 6 for Logout");
            System.out.println("Select 7 for Exit");
            try{
            choice = Integer.parseInt(in.next());                
            }catch(Exception e){
                System.out.println("Error 121: Enter valid input.");
               continue;
            }
            switch(choice)
                    {
                case 1:
                    d.create();
                   break;
                case 2:
                    d.login();
                    break;
                case 3:
                    d.Display();
                    break;
                case 4:
                    if(lid==null&&lpassword==null)
                    {
                       System.out.println("Please Login First.");
                       break;
                    }
                    d.Transfer();
                    break;
                case 5:
                    d.FD();
                    break;
                case 6:
                    if(lid==null&&lpassword==null)
                        {
                           System.out.println("Please Login First.");
                           break;
                        }
                    lid=null;
                    lpassword=null;
                    System.out.println("Logout successfully.");
                    System.out.println("Do you want to Exit?(y/n)");
                    String c = sc.nextLine();
                    if(c.equals("n")||c.equals("n"))
                        break;
                    else
                    {
                        loop=false;
                        System.exit(0);
                    }
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Select Number Between 1 to 7.");
                    break;
                    } 
            }while(loop);
    }
}