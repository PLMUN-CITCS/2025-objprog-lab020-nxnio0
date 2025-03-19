import java.util.Scanner;
public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            choice = scan.nextInt();
            handleMenuChoice(choice, scan);
        } while (choice !=3);

        scan.close();
    }
    public static void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1. Greet User ");
        System.out.println("1. Greet User ");
        System.out.println("2. Check Even/Odd ");
        System.out.println("3.Exit ");
        System.out.print("Enter your choice (1-3): ");
    }
    public static void handleMenuChoice(int choice, Scanner scan){
            if(choice == 1){
                greetUser();
            }else if(choice == 2){
                checkEvenorOdd(scan);
            }else if (choice == 3){
                System.out.println("Exiting program. Goodbye!");
            }else {
                System.out.println("Invalid choice. Please try again.");
            }
        
    }
    public static void checkEvenorOdd(Scanner scan){
        System.out.print("Enter an integer: ");
        int number = scan.nextInt();
        if (number %2 == 0){
            System.out.println(number + " is an Even Number.");
        }else if (number %2!=0){
            System.out.println(number + " is an Odd Number.");
        }else{
            System.out.println("Error: Invalid Input");
        }
    }
    public static void greetUser(){
        System.out.println("Hello Welcome!");
    }
}