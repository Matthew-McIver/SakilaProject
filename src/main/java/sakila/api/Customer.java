package sakila.api;
import javax.persistence.*;
@Entity
@Table(name = "customer")
public class Customer {
    //Attributes
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;

    @ManyToOne
    @MapsId("addressId")
    @JoinColumn(name = "address_id")
    Address address;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "store_id")
    int storeId;

    @Column(name = "address_id")
    int addressId;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "email")
    String email;

    //Constructor
    public Customer(String myFirstName, String myLastName, String myEmail, int myAddressId, Address address) {
        this.firstName = myFirstName;
        this.lastName = myLastName;
        this.email = myEmail;
        this.storeId = 1;
        this.addressId = myAddressId;
        this.address = address; }

    public Customer() {}

    //Methods
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int myId) { customerId = myId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String myFirstName) { firstName = myFirstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String myLastName) { lastName = myLastName; }

    public String getEmail() { return email; }
    public void setEmail(String myEmail) { email = myEmail; }

    public Address getAddress() { return address; }
    public void setAddress(Address myAddress) { address = myAddress; } }