public class Money {
    private long dollars;
    private long cents;

    
    public Money(double amount) {
        long totalCents = Math.round(amount * 100);
        this.dollars = totalCents / 100;
        this.cents = totalCents % 100;
    }

    
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

   
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return Long.compare(this.dollars, other.dollars);
        }
        return Long.compare(this.cents, other.cents);
    }

    
    public Money add(Money other) {
        long totalCents = this.dollars * 100 + this.cents + other.dollars * 100 + other.cents;
        return new Money(totalCents / 100.0);
    }

    
    public Money subtract(Money other) {
        long totalCents = this.dollars * 100 + this.cents - (other.dollars * 100 + other.cents);
        return new Money(totalCents / 100.0);
    }
}