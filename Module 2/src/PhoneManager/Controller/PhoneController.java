package PhoneManager.Controller;

import PhoneManager.Model.Phone;
import PhoneManager.View.PhoneService;
import java.util.List;
import java.util.Scanner;

public class PhoneController {
    private static Scanner scanner = new Scanner(System.in);
    private static PhoneService phoneService = new PhoneService();
    public static void main(String[] args) {
        displayMainMenu();
    }
    private static void displayMainMenu(){
        System.out.println("1.Thêm Mới\n2.Xóa\n3.Xem danh sách điện thoại\n4.Tìm kiếm theo tên\n5.Tìm kiếm theo id\n6.Thoát");
        String tmp ="";
        int choice=0;
        do {
            System.out.print(tmp.isEmpty() ? "Input your choice:":" Please input value from 1 to 5: ");
            tmp = scanner.nextLine();
            if (isNumber(tmp)) choice=Integer.parseInt(tmp);
        }while (choice<=0||choice>5);
        switch (choice){
            case 1:
                create();
                break;
            case 2:
                delete();
                break;
            case 3:
                phoneService.show();
                break;
            case 4:
               searchByName();
               break;
            case 5:
                searchByID();
                break;
            case 6:
                System.exit(0);
                break;
        }
        backToMainMenu();
    }
    private static void backToMainMenu(){
        System.out.println("Do you want to menu(Y/n)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y")) displayMainMenu();
        else System.exit(0);
    }
    private static boolean isNumber(String choice) {
        try {
            Integer.parseInt(choice);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    private static void create(){
        inputAndSave(0);
        System.out.println("Create successful!!!");
    }

    private static void inputAndSave(int id){
        System.out.print("Name:");
        String name = scanner.nextLine();
        System.out.print("Price:");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Quantity:");
        Double quantity = Double.parseDouble(scanner.nextLine());
        System.out.print("Producer:");
        String producer = scanner.nextLine();
        Phone phone = new Phone(id, name, price, quantity, producer);
        PhoneService.save(phone);
    }
    private static void delete(){
        try {
            phoneService.show();
            System.out.println("Choice phone id to delete:"+" ");
            int id =Integer.parseInt(scanner.nextLine());
            phoneService.delete(id);
            System.out.println("Delete succesful!!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private static void searchByName(){
        System.out.println("Input name to search:");
        String name = scanner.nextLine();
        List<Phone> phones = PhoneService.searchByName(name);
        PhoneService.show(phones);
    }
    private static void searchByID(){
        System.out.println("input id to search:");
        int id = scanner.nextInt();
        List<Phone> phones = PhoneService.searchByID(id);
        PhoneService.show(phones);
    }

}
