import java.util.*;
import java.io.*;
class Atm
{
    double balance=10000;
    double withdraw_amount=0;
    double deposit_amount=0;
    Scanner sc = new Scanner(System.in);
    public void withdraw()
    {   
        System.out.println("enter withdraw amount ");
        double withdraw_amount=sc.nextDouble();
        if withdraw_amount > balance
        {
            System.out.println("insuffficent balance");
        }
        else
        {
            balance=balance-withdraw_amount;
        }
    balance=balance-withdraw_amount;
    }
    public void deposit()
    {
        
        System.out.println("enter deposit amount ");
        double deposit_amount=sc.nextDouble();
        balance=balance+deposit_amount;
    }
    public void checkbalance()
    {
        System.out.println(balance);
    }
    class atm_interface
    {
        public static void main(String arg[])
        {
            Scanner sc =new Scanner(System.in);
            int a=1;
            int pin1=1020;
            Atm atm =new Atm();
            System.out.println("enter the pin");
            int pin=sc.nextInt();
            if(pin==pin1)
            {
                while(a)
                {
                    System.out.println("Welcome to Atm");
                    System.out.println("enter the choice\n 1.withdraw\n 2.deposit\n 3.balancecheck\n");
                    int choice=sc.nextInt();

                    switch(choice)
                    {
                        case 1: atm.withdraw() break;
                        case 2: atm.deposit() break;
                        case 3:atm.checkbalance() break;
                        default : System.out.println("enter the correct choice");

                    }
                    System.out.println(" enter 1 to continue/0 to exit ");
                    a=sc.nextInt();
                }
            }
            else
            {
                System.out.println("invalid pin");
            }
        }
    } 
}
