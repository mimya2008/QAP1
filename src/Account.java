public class Account {
    //attributes
    private String id;
    private String name;
    private int balance = 0;

    // constructors

    public Account(){
        this.id = "no id";
        this.name = "no name";
        this.balance = 0;
    }
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // getters setters

    public String getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance() {
        return balance;
    }


    // methods
    public int credit(int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }

    public int debit(int amount){
        if (amount <= balance){
            this.balance = this.balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            another.balance += amount;

        } else {
            System.out.println("Amount exceeded balance");
        }
        return (balance);
    }

    // to String
    public String toString() {
        return ("AccountID: " + this.id + " Account Name: " + this.name + " Balance: " + this.balance);
    }
}
