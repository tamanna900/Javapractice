public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }
    public static void main(String[]args){
        BankAccount bb=new BankAccount();
        bb.deposit(500);

        System.out.println("Balance after deposit: " + bb.getBalance());


        bb.withdraw(89);
        System.out.println("Balance after withdrawl: " + bb.getBalance());



//  bb.withdraw(1000);
//        System.out.println("Balance after withdrawl: " + bb.getBalance());





    }
}
