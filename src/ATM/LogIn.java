package ATM;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LogIn extends Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the ATM!\nPlease insert the following data: ");
        int i = 0;
        int personal = 1000000;
        int acc= 0;
        int exit = 0;
        int personalC = 0;
        int savings = 1000000;
        int savingsC=0;
        do{
            if (exit==1){
                exit--;
            }
            System.out.println("\nUser Login");
            int login = scanner.nextInt();
            if(login == 123){

                do {
                    if (exit == 1){
                        break;

                    }
                    System.out.println("Insert the password");
                    int pass = scanner.nextInt();
                    if (pass == 123) {
                        System.out.println("\nSelect the account you want to check:\n1 - Personal account\n2 - Savings account\n3 - exit");
                        int scan = scanner.nextInt();
                        do {
                            switch (scan) {
                                case (1) -> {
                                    System.out.println(""" 
                                            \nPersonal account
                                            what do you want to do?
                                            1 - Check Balance
                                            2 - Withdraw money
                                            3 - Deposit money
                                            4 - Exit""");
                                    acc = scanner.nextInt();
                                    if (exit == 1){
                                        break;
                                    }
                                    switch (acc) {
                                        case (1) -> System.out.println("Your balance is: " + personal);
                                        case (2) -> {
                                            System.out.println("Withdraw money");
                                            personalC = scanner.nextInt();
                                            if (personal <= 0 || personalC <0) {
                                                System.out.println("U cant withdraw that amount of money");
                                            } else {
                                                if (personal < personalC) {
                                                    System.out.println("You can't withdraw that amount of money, u have " + personal);
                                                    break;
                                                }
                                                personal = personal - personalC;
                                                personalC = 0;
                                                System.out.println("Your balance now is: " + personal);

                                            }

                                        }
                                        case (3) ->{
                                            do {
                                            System.out.println("Deposit money");
                                            personalC = scanner.nextInt();
                                            if(personalC <10){
                                                System.out.println("Sorry you can't deposit less than 10 euros");
                                            }else{
                                                personal = personal + personalC;
                                                System.out.println("Money deposited successfully\n Your balance now is: " + savings);
                                            }
                                            }while (personalC < 10);
                                            personalC = 0;
                                        }
                                        case (4) -> {System.out.println("Exiting");
                                        exit++;}
                                    }
                                }
                                case (2) -> {
                                    if (exit == 1){
                                        break;
                                    }
                                    System.out.println("Savings account\n" +
                                            "what do you want to do?\n" +
                                            "1 - Check Balance\n" +
                                            "2 - Withdraw money\n" +
                                            "3 - Deposit money\n" +
                                            "4 - Exit");
                                    acc = scanner.nextInt();
                                    switch (acc){
                                        case(1):
                                            System.out.println("Your balance is: " + savings);
                                            break;
                                        case(2):
                                            System.out.println("Withdraw money");
                                            savingsC = scanner.nextInt();
                                            if (savings <= 0 || savingsC <0) {
                                                System.out.println("U cant withdraw that amount of money");
                                            } else {
                                                if (savings < savingsC) {
                                                    System.out.println("You can't withdraw that amount of money, u have " + savings);
                                                    break;
                                                }
                                                savings = savings - savingsC;
                                                savingsC = 0;
                                                System.out.println("Your balance now is: " + savings);
                                                break;
                                            }
                                        case(3):
                                            do {
                                                System.out.println("Deposit money");
                                                savingsC = scanner.nextInt();
                                                if(savingsC <10){
                                                    System.out.println("Sorry you can't deposit less than 10 euros");
                                                }else{
                                                    savings = savings + savingsC;
                                                    System.out.println("Money deposited successfully\n Your balance now is: " + savings);
                                                }
                                            }while (savingsC < 10);
                                            savingsC = 0;
                                            break;
                                        case(4):
                                            System.out.println("Exiting");
                                            exit++;

                                    }
                                }
                                case (3) -> {
                                    System.out.println("Exiting");
                                    exit++;
                                }
                                default -> System.out.println("Try again");

                            }
                        }while (exit != 1);


                    }else {
                        i++;
                        if (i < 3){
                        System.out.println("Wrong Password, try again!");
                    }else{
                        System.out.println("Wrong password, aborting");
                        break;
                    }}
                }while (i < 3);

            }else{
                System.out.println("Wrong User, try again!");
                i++;
            }
        }while(i<3);
    }
}