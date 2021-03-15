package nl.novi.basicprogramming;

public class Bank {
    public void transferMoney(Person sender, Person receiver, double amount) {
        if (amount > sender.getBalance()) {
            System.out.println("The sender does not have that kind of money ...");
        } else {
            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);
            System.out.println("The sender transferred " + amount + " to the receiver");
        }
    }
}
