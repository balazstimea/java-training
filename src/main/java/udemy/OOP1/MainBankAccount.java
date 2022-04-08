package udemy.OOP1;

public class MainBankAccount {
    public static void  main(String[] args){

        BankAccount bobsBankAccount = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        //bobsBankAccount.setAccountNumber("12345");
        //bobsBankAccount.setBalance(0.00);
        //bobsBankAccount.setName("Bob Brown");
        //bobsBankAccount.setEmail("myemail@bob.com");
        //bobsBankAccount.setPhone("(087) 123-4567");

        bobsBankAccount.withdrawal(100.0);

        bobsBankAccount.deposit(50.0);
        bobsBankAccount.withdrawal(100.0);

        bobsBankAccount.deposit(51.0);
        bobsBankAccount.withdrawal(100.0);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getName());
    }
}
