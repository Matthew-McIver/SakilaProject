package sakila.api;

public class AddressModel {
    private String addressTitle;
    private String districtTitle;
    private int postalCode;

    public AddressModel(String aTitle, String dTitle, int pCode){
        this.addressTitle = aTitle;
        this.districtTitle = dTitle;
        this.postalCode = pCode;
    }

    public String getAddressTitle() { return addressTitle; }
    public String getDistrictTitle() { return districtTitle; }
    public int getPostalCode() { return postalCode; }
}
