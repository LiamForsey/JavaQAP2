public class Address {
    private String streetAddress;
    private String town;
    private String stateCode;
    private String postalCode;

    public Address(String streetAddress, String town, String stateCode, String postalCode) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.stateCode = stateCode;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return streetAddress + ", " + town + ", " + stateCode + " " + postalCode;
    }
}
