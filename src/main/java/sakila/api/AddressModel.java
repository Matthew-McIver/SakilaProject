package sakila.api;

public class AddressModel {
    private String addressTitle;
    private String districtTitle;
    private int postalCode;
    private String phoneNumber;

    public AddressModel(String aTitle, String dTitle, int pCode, String pNum){
        this.addressTitle = aTitle;
        this.districtTitle = dTitle;
        this.postalCode = pCode;
        this.phoneNumber = pNum;
    }

    public String getAddressTitle() { return addressTitle; }
    public String getDistrictTitle() { return districtTitle; }
    public int getPostalCode() { return postalCode; }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
