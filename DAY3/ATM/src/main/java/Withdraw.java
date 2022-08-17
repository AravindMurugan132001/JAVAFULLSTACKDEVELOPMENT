public class Withdraw {
    public Withdraw(int amount) {
        long balance = Utils.initialBalance;
        if (amount < balance) {
            System.out.println("SUCCESFULLY WITHDRAWAL");
            Utils.initialBalance = balance - amount;
            System.out.print("Your Current Balance Is : " + Utils.initialBalance);
        } else
            System.out.println("Insufficiant Balance");
    }
}
