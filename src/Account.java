import java.util.HashMap;

/**
 * Created by joshuakeough on 9/10/16.
 */
public class Account {
    private int balance;
    private String name;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> members = new HashMap<>();




    public void newMember() {
        String memberName;
        System.out.println("Please enter your first name.");
        memberName = Main.scanner.nextLine();
        System.out.println("Lets make a deposit! Please enter an amount.");
        balance = Integer.parseInt(Main.scanner.nextLine());
        name = memberName;
        members.put(memberName, balance);
    }

    public void user() {
        System.out.println("Hello please enter your name.");
        name = Main.scanner.nextLine();
        boolean a = members.containsKey(name);

        if(a) {
            System.out.println("Hello " + name);
            balance = members.get(name);

        } else {
            System.out.println("Ok it seems you do not have an account. Lets set one up!");
            newMember();

        }
    }

}
