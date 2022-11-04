import java.util.*;
public class Atm_Machine {
    public static void main(String[] args) {
        int usr_input;
        int amt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your password");
        String password = sc.nextLine();
            if (password.equals("1234")) {

                System.out.println("*********** " + "Welcome " + name + " ***********");
                System.out.println("*********** " + "Yes Bank Limited" + " ***********");
                do {


                    System.out.println("Press 1 for deposit cash");
                    System.out.println("Press 2 for withdrawal cash");
                    System.out.println("Press 3 for to see the account balance");
                    System.out.println("Press 4 for exit");

                    usr_input = sc.nextInt();

                    if (usr_input == 1) {
                        System.out.println("Enter the amount to deposit");
                        int depositcsh = sc.nextInt();
                        amt = amt + depositcsh;
                        System.out.println("********************************");
                        System.out.println("Amount deposited Sucessfully....");
                        System.out.println("********************************");

                    } else if (usr_input == 2) {
                        System.out.println("Enter the amount to withdraw");
                        int withdrawcsh = sc.nextInt();
                        if (withdrawcsh < amt) {
                            amt = amt - withdrawcsh;
                            System.out.println("********************************");
                            System.out.println("Amount Withdrawed Sucessfully....");
                            System.out.println("********************************");

                        } else {
                            System.out.println("********************************");
                            System.out.println("Sorry you have insufficient balance....");
                            System.out.println("********************************");
                        }
                    } else if (usr_input == 3) {
                        System.out.println("********************************");
                        System.out.println("Your Account Balance is " + amt);
                        System.out.println("********************************");
                    }
                } while (usr_input != 4);
                System.out.println("********************************");
                System.out.println("Thank you have a nice day");
                System.out.println("********************************");
            } else {
                System.out.println("Invalid Password");
            }
        }

    }

