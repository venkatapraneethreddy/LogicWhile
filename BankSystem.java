<<<<<<< HEAD
package LogicWhile;

public class BankSystem {

    // Base class
    static class BankAccount {
        protected int accountNumber;
        protected double balance;

        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        public void displayBalance() {
            System.out.println("Balance: " + balance);
        }
    }

    // SavingsAccount class
    static class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(int accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        public void addInterest() {
            double interest = balance * interestRate / 100;
            balance += interest;
            System.out.println("Interest Added: " + interest);
        }
    }

    // CheckingAccount class
    static class CheckingAccount extends BankAccount {
        private double overdraftLimit;

        public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
            super(accountNumber, balance);
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= balance + overdraftLimit) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
                if (balance < 0) {
                    System.out.println("Overdraft Used: " + (-balance));
                }
            } else {
                System.out.println("Overdraft limit exceeded.");
            }
        }
    }

    // FDAccount class
    static class FDAccount extends BankAccount {
        private int termInYears;
        private double fdInterestRate;

        public FDAccount(int accountNumber, double balance, int termInYears, double fdInterestRate) {
            super(accountNumber, balance);
            this.termInYears = termInYears;
            this.fdInterestRate = fdInterestRate;
        }

        public double calculateMaturityAmount() {
            return balance + (balance * fdInterestRate * termInYears / 100);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Savings Account
        System.out.println("Savings Account");
        SavingsAccount sa = new SavingsAccount(101, 1000.0, 5.0);
        sa.displayBalance();
        sa.addInterest();
        sa.displayBalance();
        System.out.println();

        // Checking Account
        System.out.println("Checking Account");
        CheckingAccount ca = new CheckingAccount(102, 2000.0, 1000.0);
        ca.displayBalance();
        ca.withdraw(2500.0);
        ca.displayBalance();
        System.out.println();

        // FD Account
        System.out.println("FD Account");
        FDAccount fda = new FDAccount(103, 5000.0, 2, 6.0);
        fda.displayBalance();
        double maturity = fda.calculateMaturityAmount();
        System.out.println("Maturity Amount (after 2 years at 6%): " + maturity);
    }
}

=======
package LogicWhile;

public class BankSystem {

    // Base class
    static class BankAccount {
        protected int accountNumber;
        protected double balance;

        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        public void displayBalance() {
            System.out.println("Balance: " + balance);
        }
    }

    // SavingsAccount class
    static class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(int accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        public void addInterest() {
            double interest = balance * interestRate / 100;
            balance += interest;
            System.out.println("Interest Added: " + interest);
        }
    }

    // CheckingAccount class
    static class CheckingAccount extends BankAccount {
        private double overdraftLimit;

        public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
            super(accountNumber, balance);
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= balance + overdraftLimit) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
                if (balance < 0) {
                    System.out.println("Overdraft Used: " + (-balance));
                }
            } else {
                System.out.println("Overdraft limit exceeded.");
            }
        }
    }

    // FDAccount class
    static class FDAccount extends BankAccount {
        private int termInYears;
        private double fdInterestRate;

        public FDAccount(int accountNumber, double balance, int termInYears, double fdInterestRate) {
            super(accountNumber, balance);
            this.termInYears = termInYears;
            this.fdInterestRate = fdInterestRate;
        }

        public double calculateMaturityAmount() {
            return balance + (balance * fdInterestRate * termInYears / 100);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Savings Account
        System.out.println("Savings Account");
        SavingsAccount sa = new SavingsAccount(101, 1000.0, 5.0);
        sa.displayBalance();
        sa.addInterest();
        sa.displayBalance();
        System.out.println();

        // Checking Account
        System.out.println("Checking Account");
        CheckingAccount ca = new CheckingAccount(102, 2000.0, 1000.0);
        ca.displayBalance();
        ca.withdraw(2500.0);
        ca.displayBalance();
        System.out.println();

        // FD Account
        System.out.println("FD Account");
        FDAccount fda = new FDAccount(103, 5000.0, 2, 6.0);
        fda.displayBalance();
        double maturity = fda.calculateMaturityAmount();
        System.out.println("Maturity Amount (after 2 years at 6%): " + maturity);
    }
}

>>>>>>> 7c6af5c93464cd0b1db3618f53dc94fd3133006f
