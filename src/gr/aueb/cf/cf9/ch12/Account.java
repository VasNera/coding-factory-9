package gr.aueb.cf.cf9.ch12;

public class Account {

    private long id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    //default constructor
    public Account(){

    }
    //overloading constructor

    public Account(long id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API

    /**
     * deposits the specified amount of money into the account.
     * @param amount            the amount of money.
     * @throws Exception         if amount is negative.
     */

    public void deposit(double amount)throws Exception{
        try{
            if (amount < 0 ) throw new Exception("The amount should be positive.");
            balance += amount;
            //log
        } catch (Exception e) {
            System.err.println("Negative amount =" + amount +" is not allowed. " + "\n" +e.getMessage());
            throw e;

        }
    }

    /**
     *
     * @param amount       the amount of money to withdraw.
     * @param ssn            the SSN does not match
     * @throws Exception       if the amount is negative, the balance is insufficient or SSN does not match.
     */
    public void withdraw(double amount, String ssn)throws Exception{
        try{
            if (amount < 0)throw new Exception("The amount must be positive.");
            if (amount > balance) throw new Exception("The balance is insufficient.");
            if (!isSsnValid(ssn))throw new Exception("The ssn does not match.");            //καλεί τη μέθοδο από κάτω.
            balance -= amount;
        } catch (Exception e) {
            System.err.println("Withdraw failed. " + "\n " +  e.getMessage());
            throw e;

        }
    }

    /**
     *               returns the current balance of the account.
     * @return       the current balance of the account.
     */
    public double getAccountBalance(){
        return getBalance();            //return balance or Balance είναι το ίδιο.
    }

    public String accountToString(){
        return " Account id: " + id + " IBAN: " + iban + " Firstname: " + firstname +
                 " Lastname: " + lastname + " SSN: " + ssn + " Balance: " + balance;
    }

    private boolean isSsnValid(String ssn){
        return this.ssn.equals(ssn);
    }
}

