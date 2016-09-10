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

}
