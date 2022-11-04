import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int amt = 0;
        int count = 0;
        int usr_input;
        int cycle = 0;
        int bike = 0;
        int car = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for cycle");
            System.out.println("Press 2 for Bike");
            System.out.println("Press 3 for Car");
            System.out.println("Press 4 for to see whole record");
            System.out.println("Press 5 for to delete whole record");
            usr_input = sc.nextInt();
            if (usr_input == 1) {
                if (count <= 60) {
                    amt = amt + 5;
                    count++;
                    cycle++;
                    System.out.println("***********************************");
                    System.out.println("Cycle Entered Sucessfully");
                    System.out.println("***********************************");

                } else {
                    System.out.println("No Parking");
                }
            } else if (usr_input == 2) {
                if (count <= 60) {
                    amt = amt + 15;
                    count++;
                    bike++;
                    System.out.println("***********************************");
                    System.out.println("Bike Entered Sucessfully");
                    System.out.println("***********************************");

                } else {
                    System.out.println("No Parking");

                }
            } else if (usr_input == 3) {
                if (count <= 60) {
                    amt = amt + 30;
                    count++;
                    car++;
                    System.out.println("***********************************");
                    System.out.println("Car Entered Sucessfully");
                    System.out.println("***********************************");

                } else {
                    System.out.println("No Parking");
                }
            } else if (usr_input == 4) {
                System.out.println("***********************************");
                System.out.println("The total amount is " + amt);
                System.out.println("***********************************");
                System.out.println("Total Number of Vehicles is " + count);
                System.out.println("***********************************");
                System.out.println("Total number of cycles " + cycle);
                System.out.println("***********************************");
                System.out.println("Total number of bike "+ bike);
                System.out.println("***********************************");
                System.out.println("Total number of car "+car);
                System.out.println("***********************************");
            } else if (usr_input == 5) {
                amt = 0;
                count = 0;
                cycle = 0;
                bike = 0;
                car = 0;
                System.out.println("***********************************");
                System.out.println("Record Sucessfully deleted");
                System.out.println("***********************************");
            } else {
                System.out.println("Invalid Input");
            }

        }
    }
}