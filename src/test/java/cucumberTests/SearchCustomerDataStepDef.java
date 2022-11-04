package cucumberTests;
import com.Sakila.api.sakila.microservice.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
@ScenarioScope
public class SearchCustomerDataStepDef {
    String testFirstName = "";
    String testLastName = "";
    Customer customerData = new Customer();
    @Autowired
    ActorRepository actorRepository;
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    FilmRepository filmRepository;
    @Autowired
    InventoryRepository inventoryRepository;
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    RentalRepository rentalRepository;
    @Autowired
    SakilaMicroserviceApplication sakilaMicroserviceApplication = new SakilaMicroserviceApplication(actorRepository, filmRepository, rentalRepository, addressRepository, customerRepository, inventoryRepository, paymentRepository);

    @Given("a user wants to know their customer data at Blockbuster.")
    public void a_user_wants_to_see_their_customer_data() {
        testFirstName = "MARY";
        testLastName = "SMITH"; }
    @When("a user searches for specific customer data with their first and last name.")
    public void a_user_searches_for_their_customer_data() {
        customerData = sakilaMicroserviceApplication.getCustomerByName(testFirstName, testLastName); }
    @Then("the customer ID, first name, last name, and email address of the user is shown.")
    public void their_customer_data_appears() {
        Assertions.assertNotNull(customerData);
    } }