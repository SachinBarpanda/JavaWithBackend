package justForfun;

public class Account {
    private int balance ;
    private String name;
    private String id;
    private long phoneNumber;

    //Using constructors we can just pass the value from the very start

    Account(){
        this(0,"default","default", 0L);
    }

    Account(int balance, String name, String id, long phoneNumber) {
        this.balance = balance;
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        System.out.println("Parameter wala called ");
    }

    String withdraw(int amount){
        if(balance>amount)
        this.balance = balance - amount;
        else{
            return "Not sufficient balance ";
        }
        return "Remaining balance is : "+this.balance;
    }
    String deposit(int amount){
        this.balance = (this.balance+amount);
        return "Now your balance is "+ (this.balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return this.balance;
    }
}
