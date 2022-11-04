package cucumberTests;

import com.Sakila.api.SakilaMicroservice.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class SearchFilmByNameStepDef {
    String filmTitle = "";
    Film filmObject = new Film();
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
    @Given("the customer wants to find a certain film")
    public void the_customer_wants_to_find_a_certain_film() {
        filmTitle = "PSYCHO SHRUNK";
    }
    @When("the customer searches for that film by name")
    public void the_customer_searches_for_that_film_by_name() {
        filmObject = filmRepository.getFilmByName(filmTitle);
    }
    @Then("the database will return that film")
    public void the_database_will_return_that_film() {
        Assertions.assertEquals("PSYCHO SHRUNK", filmObject.getFilmTitle(), "Film title is incorrect.");
    }

}
