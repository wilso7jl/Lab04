public class MonthlyCCBalance {
    public static void main(String[] args) {
        double interestRate = 0.17;
        int initialBalance = 5000;
        double oneMonthInterest;
        double twoMonthInterest;
        double oneMonthTotal;
        double twoMonthTotal;
        oneMonthInterest = initialBalance * interestRate;
        oneMonthTotal = initialBalance + oneMonthInterest;
        twoMonthInterest = oneMonthTotal * interestRate;
        twoMonthTotal = oneMonthTotal +twoMonthInterest;

        system.out.println("The one month interest: " + oneMonthInterest + " and the two month interest is: " + twoMonthInterest);
    }
}
