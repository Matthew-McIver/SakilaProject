package sakila.api;

public class CustomerModel {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int addressId;
    private String addressTitle;
    private String districtTitle;
    private String phoneNumber;
    private int postalCode;

    public CustomerModel(String fName, String lname, String eAddress, int myAddressId, String myAddressTitle, String myDistrictTitle, String myPhoneNumber, int myPostalCode) {
        this.firstName = fName;
        this.lastName = lname;
        this.emailAddress = eAddress;
        this.addressId = myAddressId;
        this.addressTitle = myAddressTitle;
        this.districtTitle = myDistrictTitle;
        this.phoneNumber = myPhoneNumber;
        this.postalCode = myPostalCode;
    }

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public String getEmailAddress(){ return emailAddress; }

    public int getAddressId() {
        return addressId;
    }

    public String getAddressTitle() {
        return addressTitle;
    }

    public String getDistrictTitle() {
        return districtTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }
}
