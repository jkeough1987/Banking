import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank();


    public static void main(String[] args) {
        boolean a = true;
        while (a) {
            bank.user();
            boolean b = true;

            while (b) {
                String atmOption;
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
                        b = false;

                        break;
                    default:
                        System.out.println(atmOption + " is not an option.");

                }
            }

        }
    }


    public static void balance() {
        boolean a = true;
        while (a) {
            System.out.println("Your Balance is $" + bank.members.get(bank.getName()));
            a = false;
        }


    }

    public static void delete() {
        boolean a = true;
        while (a) {
            bank.members.remove(bank.getName());
            a = false;
            bank.user();
        }


    }

    public static void withdraw() {
        boolean a = true;
        while (a) {
            System.out.println("How much would you like to withdraw?");
            double withdrawal;
            withdrawal = Integer.parseInt(scanner.nextLine());
            if (withdrawal <= bank.members.get(bank.getName())) {
                double withdraw = bank.members.get(bank.getName()) - withdrawal;
                bank.setBalance(withdraw);
                System.out.println("Thanks please take your cash. Your remaining balance is $" + bank.getBalance());
                a = false;
                bank.members.put(bank.getName(), bank.getBalance());
            } else if (withdrawal > bank.members.get(bank.getName())) {
                System.out.println("Sorry funds not available please try again.");
            }
            a = false;
        }

    }

    public static void deposit() throws NullPointerException {
        System.out.println("How much would you like to deposit?");
        double deposit = Integer.parseInt(scanner.nextLine()) + bank.members.get(bank.getName());
        System.out.println("Your money has been deposited!");
        bank.members.put(bank.getName(), deposit);

    }


}
