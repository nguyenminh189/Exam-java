package Bank;

public class Main {
    public static void main(String[] args){
        double realBalance = 1000.0;
        double realRate = 10.0;

        Bank myBank = new Bank(realBalance, realRate);

        double MonthlyInterest = myBank.Calculate();
        System.out.println("Balance: " + realBalance);
        System.out.println("Rate: " + realRate);
        System.out.println("Monthly Interest: " + MonthlyInterest);
    }
}
