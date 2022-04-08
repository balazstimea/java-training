package udemy.OOP1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount(){
        this("56789", 2.5, "Default name","default email", "default phone"); //default constructor
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String name, String email, String phone){
        System.out.println("Account constructor whith parameters calls");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;

    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balace is " + this.balance);

    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance: " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
