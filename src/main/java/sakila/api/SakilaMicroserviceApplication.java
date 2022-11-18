package sakila.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.*;
@SpringBootApplication
@RestController
@RequestMapping("/BootUp")
@CrossOrigin(origins = {"https://localhost:8080","http://localhost:3000"})
public class SakilaMicroserviceApplication {
	@Autowired
	private ActorRepository actorRepository;
	private FilmRepository filmRepository;
	private AddressRepository addressRepository;
	private CustomerRepository customerRepository;
	public SakilaMicroserviceApplication(ActorRepository myActorRepo, FilmRepository myFilmRepo, AddressRepository myAddressRepo, CustomerRepository myCustomerRepo) {
		this.actorRepository = myActorRepo;
		this.filmRepository = myFilmRepo;
		this.addressRepository = myAddressRepo;
		this.customerRepository = myCustomerRepo; }
	public static void main(String[] args) {
		SpringApplication.run(SakilaMicroserviceApplication.class, args);
	}
	String delete = "deleted";

	//FILM
	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}
	@GetMapping("/randomFilms{number}")
	public List<Film> getRandomFilms(@PathVariable(value = "number") int number) { return filmRepository.getRandomFilms(number); }

	//CUSTOMER
	@GetMapping("CustomersByName/{firstName}/{lastName}")
	public Customer getCustomerByName(@PathVariable(value = "firstName") String firstName, @PathVariable(value = "lastName") String lastName) { return customerRepository.getCustomerByName(firstName, lastName); }
	@GetMapping("CustomersByEmail/{email}")
	public Customer getCustomerByEmail(@PathVariable(value = "email") String email) { return customerRepository.getCustomerByEmail(email); }
	@PutMapping("/putCustomer/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable(value = "id") Integer customerId, @RequestBody CustomerModel customerModelDetails) {
		Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new ResourceAccessException("Customer not found for this id :: " + customerId));
		customer.setFirstName(customerModelDetails.getFirstName());
		customer.setLastName(customerModelDetails.getLastName());
		customer.setEmail(customerModelDetails.getEmailAddress());
		final Customer updatedCustomer = customerRepository.save(customer);
		return ResponseEntity.ok(updatedCustomer); }
	@DeleteMapping("/deleteCustomer/{customerId}")
	public Map<String, Boolean> deleteCustomer(@PathVariable(value = "customerId") int customerTimeId)
			throws ResourceAccessException {
		Customer customer = customerRepository.findById(customerTimeId)
				.orElseThrow(() -> new ResourceAccessException("Customer not found for this id :: " + customerTimeId));
		customerRepository.deleteById(customerTimeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put(delete, Boolean.TRUE);
		return response; }
	@PostMapping("/putCustomer")
	public Customer createCustomer(@RequestBody CustomerModel newCustomerModel) {
		Address newAddress = new Address(newCustomerModel.getAddressTitle(), newCustomerModel.getDistrictTitle(), newCustomerModel.getPostalCode(), newCustomerModel.getPhoneNumber());
		Address output = addressRepository.save(newAddress);
		Customer newCustomer = new Customer(newCustomerModel.getFirstName(), newCustomerModel.getLastName(), newCustomerModel.getEmailAddress(), output.getAddressId(), output);
		return customerRepository.save(newCustomer); }}