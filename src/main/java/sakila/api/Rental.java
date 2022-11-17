package sakila.api;
import javax.persistence.*;
@Entity
@Table(name = "rental")
public class Rental {
    //Attributes
    @Id
    @Column(name = "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rentalId;

//    @ManyToOne
//    @MapsId("customerId")
//    @JoinColumn(name = "customer_id")
//    Customer customer;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    Inventory inventory;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "payment_id", referencedColumnName = "paymentId")
//    private Payment payment;

    @Column(name = "rental_date")
    int rentalDate;

    //Constructor
    public Rental(int myRentalDate)
    {
        this.rentalDate = myRentalDate;
    }

    public Rental() {}

    //Methods
    public int getRentalId() { return rentalId; }
    public void setRentalId(int myId) { rentalId = myId; }

    public int getRentalDate() { return rentalDate; }
    public void setRentalDate(int myRentalDate) { rentalDate = myRentalDate; } }