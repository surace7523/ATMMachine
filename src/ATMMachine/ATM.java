package ATMMachine;

import java.util.Scanner;

public class ATM {

    float Balance;
    int PIN = 118;


    public void checkpin() {

        System.out.println("ENTER YOUR PIN NUMBER");
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        if (userInput == PIN) {

            menu();
        } else {

            System.out.println("Enter a valid pin number");
        }
    }


    public void menu(){
        System.out.println("Enter an option");
        System.out.println("1. check balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");



        Scanner option = new Scanner(System.in);

        int opt= option.nextInt();

        if(opt ==1){
            checkBalance();
        }
        else if(opt ==2){
            withdrawMoney();
        }
        else if(opt ==3){
            depositCash();
        }
        else if(opt ==4){
          System.exit(0);
        }
        else {

            System.out.println("Enter a valid option");

            menu();

        }
    }


public void checkBalance(){

    System.out.println("your total Balance is: "+ Balance);

    menu();
}

public void withdrawMoney(){

    System.out.println("Enter the money you want to withdraw");
    Scanner sc = new Scanner(System.in);

    float withdrawAmount = sc.nextFloat();
        if(withdrawAmount>Balance){

            System.out.println("Insufficient balance");
        }else {

            Balance = Balance- withdrawAmount;
            System.out.println("withdrawing money successfully:");

        }

        menu();
}


public  void depositCash(){
    System.out.println("Enter the amount you want to deposit");
    Scanner sc = new Scanner(System.in);

    float depositAmount = sc.nextFloat();


        Balance = Balance + depositAmount;
        System.out.println("depositing your money successfully:");

menu();



}

}

