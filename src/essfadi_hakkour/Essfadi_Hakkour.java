package essfadi_hakkour;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Authentication.Account;
import Authentication.Finance.PaymentMethod;
import Authentication.Finance.Plan;
import Main.Netflix;
import java.util.Scanner;

/**
 *
 * @author oessf
 */
public class Essfadi_Hakkour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Netflix netflix = new Netflix();
        Account fakeAccount;
        Plan myPlan;
        PaymentMethod method;
        int choice_menu = 0, choice_card = 0, choice_plan = 0, month_exp = 0, year_exp = 0, card_number = 0;
        String full_name;
        Scanner scanner = new Scanner(System.in);
                //MENU
        while (choice_menu == 0) {
            System.out.print("Enter your Choice: ");
            choice_menu = scanner.nextInt();
        }
        switch (choice_menu) {
            case 1:
                fakeAccount = netflix.register();
                System.out.println("1. Basic\n2. Standard\n3. Premuim\n");
                do {
                    System.out.print("Enter Your Plan: ");
                    choice_plan = scanner.nextInt();
                } while(!(choice_plan > 0 && choice_plan < 4));
                myPlan = new Plan(choice_plan);
                System.out.println("Enter Your Legal Full Name: ");
                full_name = scanner.nextLine();
                System.out.println("1. Visa\n2. MasterCard\n3. American Express\n");
                do {
                    System.out.println("Enter The Type of Your Card: ");
                    choice_card = scanner.nextInt();
                } while(!(choice_card > 0 && choice_card < 4));
                System.out.println("Enter Month of Expiration: ");
                month_exp = scanner.nextInt();
                System.out.println("Enter Year of Expiration: ");
                year_exp = scanner.nextInt();
                System.out.println("Enter Card Number: ");
                card_number = scanner.nextInt();
                method = new PaymentMethod(full_name, month_exp, year_exp, choice_card, card_number);
                System.out.println(fakeAccount);
                System.out.println(myPlan);
                System.out.println(method);
                break;
        }
    }
    
}
