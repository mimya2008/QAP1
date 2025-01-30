public class TestAccount {
    public static void main(String[] args) {
        Account A1 = new Account("SIBL0012", "Acc1", 5000);

        Account A2 = new Account("SIBL0013", "Acc2", 4000);

        System.out.println("Current Balance of " + A1.getName() + " is "+A1.getBalance());
        System.out.println("Current Balance of " + A2.getName() + " is "+A2.getBalance());

        System.out.println("\nTransferring $1000 from " + A1.getName() + " to " + A2.getName() + "...\n");
        A1.transferTo(A2, 1000);

        // Display updated balances
        System.out.println("Balance after transfer of " + A1.getName() + " is "+A1.getBalance());
        System.out.println("Balance after transfer of " + A2.getName() + " is "+A2.getBalance());
    }

}
