package Bank;

public class Bank {
    private double balance;
    private double rate;


    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double Calculate(){
        return balance * (rate/1200);    }
}

