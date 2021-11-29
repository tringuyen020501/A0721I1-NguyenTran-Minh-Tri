package CaseStudy.Controller;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        boolean check =true;
        while (check){
            System.out.println("1.Employee Management\n2.Customer Management\n3.Facility Management\n4.Booking Management\n5.Promotion Management\n6.Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
            diplayReturnToMenu();
        }
    }
    private static void diplayReturnToMenu(){
        System.out.println("Do you want to Menu(Y/n)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) displayMainMenu();
        else System.exit(0);
    }

    public static void displayEmployeeMenu(){
            boolean check =true;
            while (check){
                System.out.println("1.Display list employees\n2.Add new employees\n3.Edit employees\n4.Return main menu");
                Scanner scanner = new Scanner(System.in);
                switch (scanner.nextInt()){

                }
            }
        }

    public static void displayCustomerMenu(){
        boolean check =true;
        while (check){
            System.out.println("1.Display list customers\n2.Add new customer\n3.Edit customer\n4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){

            }
        }
    }

    public static void displayFacilityMenu(){
        boolean check =true;
        while (check){
            System.out.println("1.Display list facility\n2.Add new facility\n3.Display list facility maintenance\n4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){

            }
        }
    }

    public static void displayBookingMenu(){
        boolean check =true;
        while (check){
            System.out.println("1.Add new booking\n2.Display list booking\n3.Create new constracts\n4.Display list contracts\n5.Edit contracts\n6.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){

            }
        }
    }

    public static void displayPromotionMenu(){
        boolean check =true;
        while (check){
            System.out.println("1.Display list customers use service\n2.Display list customers get voucher\n4.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){

            }
        }
    }
}
