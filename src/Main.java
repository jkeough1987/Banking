import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank();


    public static void main(String[] args) {

        while (true) {
            bank.user();
            boolean b = true;
            while (b) {
                String atmOption;
                System.out.println("Please enter an option!\n1. Check my balance.\n2. Deposit\n3. Withdraw.\n4. Delete.\n5. Cancel ");
                atmOption = scanner.nextLine();

                switch (atmOption) {
                    case "1":
                        bank.balance();
                        break;
                    case "2":
                        bank.deposit();
                        break;
                    case "3":
                        bank.withdraw();
                        break;
                    case "4":
                        bank.delete();
                        break;
                    case "5":
                        System.out.println("Thank you and please come again!");
                        b = false;

                        break;
                    default:
                        System.out.println(atmOption + " is not an option.");

                }
            }

        }
    }





}
