package sakila.api;
import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "address")
public class Address {
    //Attributes
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int addressId;

    @OneToMany(mappedBy = "address")
    Set<Customer> customer;

    @Column(name = "address")
    String addressTitle;

    @Column(name = "district")
    String districtTitle;

    @Column(name = "phone")
    String phoneNumber;

    @Column(name = "postal_code")
    int postalCode;

    @Column(name = "city_id")
    int cityId;

    //Constructor
    public Address(String myAddress, String myDistrict, int myPostalCode, String myPhoneNumber) {
        this.addressTitle = myAddress;
        this.districtTitle = myDistrict;
        this.postalCode = myPostalCode;
        this.phoneNumber = myPhoneNumber;
        this.cityId = 1; }

    public Address() {}

    //Methods
    public int getAddressId() { return addressId; }
    public void setAddressId(int myId) { addressId = myId; }

    public String getAddressTitle() { return addressTitle; }
    public void setAddressTitle(String myAddressTitle) { addressTitle = myAddressTitle; }

    public String getDistrictTitle() { return districtTitle; }
    public void setDistrictTitle(String myDistrictTitle) { districtTitle = myDistrictTitle; }

    public int getPostalCode() { return postalCode; }
    public void setPostalCode(int myPostCode) { postalCode = myPostCode; }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}