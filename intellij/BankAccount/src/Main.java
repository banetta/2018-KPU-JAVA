public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();

        System.out.println(">> Created Acnt#=1001");
        ba1.setAccountNumber(1001);
        ba1.setOwner("노영주");
        ba1.setBalance(0);
        System.out.printf("Acnt#=%d, Owner = %s, Balanc=%d\n",ba1.getAccountNumber(), ba1.getOwner(), ba1.getBalance());

        System.out.println(">> Created Acnt#=1002");
        ba2.setAccountNumber(1002);
        ba2.setOwner("노영주");
        ba2.setBalance(0);
        System.out.printf("Acnt#=%d, Owner = %s, Balanc=%d\n",ba2.getAccountNumber(), ba2.getOwner(), ba2.getBalance());

        System.out.println(">> Deposit 10000 into Acnt#=1001");
        ba1.deposit();
        System.out.printf("Acnt#=%d, Owner = %s, Balanc=%d\n",ba1.getAccountNumber(), ba1.getOwner(), ba1.getBalance());
        System.out.printf("Acnt#=%d, Owner = %s, Balanc=%d\n",ba2.getAccountNumber(), ba2.getOwner(), ba2.getBalance());

        System.out.println(">> Withdraw 8000 from Acnt#=1001");
        ba1.withdraw();
        System.out.printf("Acnt#=%d, Owner = %s, Balanc=%d\n",ba1.getAccountNumber(), ba1.getOwner(), ba1.getBalance());
        System.out.printf("Acnt#=%d, Owner = %s, Balanc=%d\n",ba2.getAccountNumber(), ba2.getOwner(), ba2.getBalance());

        System.out.println(">> Transfer 1000 from Acnt#=1001 to Acnt#=1002");
        ba1.transfer();
        ba2.transfer();
        System.out.printf("Acnt#=%d, Owner = %s, Balanc=%d\n",ba1.getAccountNumber(), ba1.getOwner(), ba1.getBalance());
        System.out.printf("Acnt#=%d, Owner = %s, Balanc=%d\n",ba2.getAccountNumber(), ba2.getOwner(), ba2.getBalance());

        System.out.printf(">> %s`s total balance=%d\n",ba1.getOwner() ,(ba1.getBalance()+ba2.getBalance()));


    }
}
