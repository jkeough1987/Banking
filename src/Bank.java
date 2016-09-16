import java.util.HashMap;

/**
 * Created by joshuakeough on 9/10/16.
 */
public class Bank {
    private double balance;
    private String name;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Double> members = new HashMap<>();




    public void acceptNewMember() {
        System.out.println("Please enter your first name.");
        name = Main.scanner.nextLine();
        System.out.println("Lets make a deposit! Please enter an amount.");
        balance = Integer.parseInt(Main.scanner.nextLine());
        members.put(this.name, balance);
    }

    public void user() {
        System.out.println("Hello please enter your name.");
        name = Main.scanner.nextLine();
        boolean a = members.containsKey(name);

        if(a) {
            System.out.println("Hello " + name);
            balance = members.get(name);

        } else {
            System.out.println("Ok it seems you do not have an bank. Lets set one up!");
            acceptNewMember();

        }
    }

    public  void balance() {
        boolean a = true;
        while (a) {
            System.out.println("Your Balance is $" + members.get(getName()));
            a = false;
        }


    }

    public  void delete() {
        boolean a = true;
        while (a) {
            members.remove(getName());
            a = false;
            user();
        }


    }

    public void withdraw() {
        boolean a = true;
        while (a) {
            System.out.println("How much would you like to withdraw?");
            double withdrawal;
            withdrawal = Integer.parseInt(Main.scanner.nextLine());
            if (withdrawal <= members.get(getName())) {
                double withdraw = members.get(getName()) - withdrawal;
                setBalance(withdraw);
                System.out.println("Thanks please take your cash. Your remaining balance is $" + getBalance());
                a = false;
                members.put(getName(), getBalance());
            } else if (withdrawal > members.get(getName())) {
                System.out.println("Sorry funds not available please try again.");
            }
            a = false;
        }

    }

    public void deposit() throws NullPointerException {
        System.out.println("How much would you like to deposit?");
        double deposit = Integer.parseInt(Main.scanner.nextLine()) + members.get(getName());
        System.out.println("Your money has been deposited!");
        members.put(getName(), deposit);

    }

}
