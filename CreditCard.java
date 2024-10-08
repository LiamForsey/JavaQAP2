public class CreditCard {
    private Person owner;  
    private Money balance;  
    private Money creditLimit;  

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);  
        this.balance = new Money(0);  
    }

    public Money getCurrentBalance() {
        return new Money(balance);  
    }

    public Money getMaxCredit() {
        return new Money(creditLimit);  
    }

    public String getOwnerDetails() {
        return owner.toString(); 
    }

    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Charge exceeds credit limit.");
        }
    }

    public void makePayment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
