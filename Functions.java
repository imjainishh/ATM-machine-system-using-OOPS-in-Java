import java.util.Scanner;

public class Functions {
    //int pin = 9459;
    int balance;

    public void checkpin(int pin){
        System.out.println("Enter the PIN Number- ");
        Scanner sc = new Scanner(System.in);
        int EnteredPin = sc.nextInt();

        if(EnteredPin == pin){
            menu();
        }
        else{
            System.out.println("Enter a valid PIN.");
            checkpin(pin);
        }
    }

    public void menu(){
        System.out.println("What do you like to do:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc= new Scanner(System.in);
        int menu = sc.nextInt();
        if(menu == 1){
            check_balance();
        }
        else if (menu==2) {
            withdraw_money();
        }
        else if (menu==3) {
            deposit_money();
        }
        else if (menu==4) {
            return;
        }
        else{
            System.out.println("Wrong Input(Enter 1-4)");
            menu();
        }
    }

    public void check_balance(){
        System.out.println("Balance: "+ balance);
        menu();
    }

    public void withdraw_money(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount>balance){
            System.out.println("Insufficient Balance.");
        }
        else{
            balance = balance - amount;
            System.out.println("Successfully withdrawn. Current Balance= "+ balance);
        }
        menu();
    }

    public void deposit_money(){
        System.out.println("Enter amount to Deposit: ");
        Scanner sc=new Scanner(System.in);
        int Depo_amount = sc.nextInt();
            balance = balance + Depo_amount;
            System.out.println("Successfully withdrawn. Current Balance= "+ balance);
        menu();
    }

}
