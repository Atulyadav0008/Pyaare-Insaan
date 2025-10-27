package Minor_Projects;

import java.io.InputStream;
import java.util.Scanner;

public class AtmMachine{
    int PIN = 8513;
    float Balance;
    Scanner sc = new Scanner(System.in);

    //It is a menu function.
    public  void menu() {
        System.out.println("Choose any option:-");
        System.out.println("1. Withdrawal money.");
        System.out.println("2. Check balance.");
        System.out.println("3. Deposit Money.");
        System.out.println("4. exit.");
        int opt = sc.nextInt();
        if (opt == 1) {
            Withdrawl();
        } else if (opt == 2) {
            CheckBalance();
        } else if (opt == 3) {
            DepositMoney();
        } else if (opt == 4) {
            System.out.println("Thank you! Visit again ❤️.");
            return;
        }

    }

    // CheckPin function
    public void CheckPin() {
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin:- ");
            CheckPin();
        }
    }

    // Withdrawl function
        public  void Withdrawl(){
            System.out.println("Enter your amount:- ");
            float amount = sc.nextFloat();
            if(Balance > amount) {
                Balance = Balance - amount;
                System.out.println("Withdrawl successfully:- " + amount);
            }
            else{
                System.out.println("Insufficient balance.");
            }
            menu();
        }

// CheckBalance function
    public  void CheckBalance(){
        System.out.println("Current balance is = " + Balance);
        menu();
    }
//DepositMoney function
    public void DepositMoney(){
        System.out.println("Enter your amount:- ");
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Deposit successfully. " + amount);
        menu();
    }
    // we created non-static methods so we need to a object
    // to call them.
    public static void main(String[] args) {
     AtmMachine atm = new AtmMachine();
        System.out.println("Enter your pin:- ");
        atm.CheckPin();
        }
    }
    //Project by atul yadav

