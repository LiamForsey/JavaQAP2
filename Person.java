public class Person {
    private String givenName;
    private String surname;
    private Address residence;

    public Person(String givenName, String surname, Address residence) {
        this.givenName = givenName;
        this.surname = surname;
        this.residence = residence;  
    }

    @Override
    public String toString() {
        return surname + ", " + givenName + " - " + residence.toString();
    }
}
