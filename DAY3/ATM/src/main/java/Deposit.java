public class Deposit {
    public void dept(int amount) {
        long balance = Utils.initialBalance;
        System.out.println("SUCCESFULLY WITHDRAWAL");
        Utils.initialBalance = balance + amount;
        System.out.println("Your Current Balance Is : "+Utils.initialBalance );

    }
}

