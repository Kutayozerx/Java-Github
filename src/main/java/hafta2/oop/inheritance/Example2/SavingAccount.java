package hafta2.oop.inheritance.Example2;

public class SavingAccount extends Account {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(double balance,double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
}
