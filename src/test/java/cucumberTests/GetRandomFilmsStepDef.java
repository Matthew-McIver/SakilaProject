package cucumberTests;
import com.Sakila.api.SakilaMicroservice.*;
import com.Sakila.api.sakila.microservice.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.ScenarioScope;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@ScenarioScope
public class GetRandomFilmsStepDef {
    int noOfFilms = 0;
    List<Film> randomFilms;
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
    @Given("a user wants to see their most recently rented films")
    public void a_user_wants_to_see_their_most_recently_rented_films() {
        noOfFilms = 10;
    }
    @When("a user accesses their most recently rented films")
    public void a_user_accesses_their_most_recently_rented_films() {
        randomFilms = filmRepository.getRandomFilms(noOfFilms);
    }
    @Then("random films are listed with their title, description, release year, and age rating")
    public void random_films_are_listed_with_their_title_description_release_year_and_age_rating() {
        Assertions.assertEquals(10, randomFilms.size(), "Size of film list is incorrect.");
    }

}
