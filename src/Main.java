import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);
    public static Account account = new Account();


    public static void main(String[] args) {
        account.user();
        boolean a = true;

        while (a) {
            System.out.println("Please enter an option!\n1. Check my balance.\n2. Deposit\n3. Withdraw.\n4. Delete.\n5. Cancel ");
            atmOption = scanner.nextLine();

            switch (atmOption) {
                case "1":
                    balance();
                    break;
                case "2":
                    deposit();
                    break;
                case "3":
                    withdraw();
                    break;
                case "4":
                    delete();
                    break;
                case "5":
                    System.out.println("Thank you and please come again!");
                    a = false;

                    break;
                default:
                    System.out.println(atmOption + " is not an option.");

            }
        }
    }


    public static String atmOption;


    public static void balance() {
        boolean a = true;
        while (a) {
            System.out.println("Your Balance is $" + account.members.get(account.getName()));
            a = false;
        }


    }

    public static void delete() {
        boolean a = true;
        while (a) {
            account.members.remove(account.getName());
            a = false;
            account.user();
        }


    }

    public static void withdraw() {
        boolean a = true;
        while (a) {
            System.out.println("How much would you like to withdraw?");
            int withdrawal;
            withdrawal = Integer.parseInt(scanner.nextLine());
            if (withdrawal <= account.members.get(account.getName())) {
                int withdraw = account.members.get(account.getName()) - withdrawal;
                account.setBalance(withdraw);
                System.out.println("Thanks please take your cash. Your remaining balance is $" + account.getBalance());
                a = false;
                account.members.put(account.getName(), account.getBalance());
            } else if (withdrawal > account.members.get(account.getName())) {
                System.out.println("Sorry funds not available please try again.");
            }
            a = false;
        }

    }

    public static void deposit() throws NullPointerException {
        System.out.println("How much would you like to deposit?");
        int deposit = Integer.parseInt(scanner.nextLine()) + account.members.get(account.getName());
        System.out.println("Your money has been deposited!");
        account.members.put(account.getName(), deposit);

    }


}
