package com.Sakila.api.SakilaMicroservice;
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
@CrossOrigin
public class SakilaMicroserviceApplication {
	@Autowired
	private ActorRepository actorRepository;
	private FilmRepository filmRepository;
	private RentalRepository rentalRepository;
	private AddressRepository addressRepository;
	private CustomerRepository customerRepository;
	private InventoryRepository inventoryRepository;
	private PaymentRepository paymentRepository;
	public SakilaMicroserviceApplication(ActorRepository myActorRepo, FilmRepository myFilmRepo, RentalRepository myRentalRepo, AddressRepository myAddressRepo, CustomerRepository myCustomerRepo, InventoryRepository myInventoryRepo, PaymentRepository myPaymentRepo) {
		this.actorRepository = myActorRepo;
		this.filmRepository = myFilmRepo;
		this.rentalRepository = myRentalRepo;
		this.addressRepository = myAddressRepo;
		this.customerRepository = myCustomerRepo;
		this.inventoryRepository = myInventoryRepo;
		this.paymentRepository = myPaymentRepo; }
	public static void main(String[] args) {
		SpringApplication.run(SakilaMicroserviceApplication.class, args);
	}

	//ACTOR
	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors() {
		return actorRepository.findAll();
	}
	@PutMapping("/putActors/{id}")
	public ResponseEntity<Actor> updateActor(@PathVariable(value = "id") Integer actorId, @RequestBody Actor actorDetails) {
		Actor actor = actorRepository.findById(actorId).orElseThrow(() -> new ResourceAccessException("Actor not found for this id :: " + actorId));
		actor.setFirstName(actorDetails.getFirstName());
		actor.setLastName(actorDetails.getLastName());
		final Actor updatedActor = actorRepository.save(actor);
		return ResponseEntity.ok(updatedActor); }
	@DeleteMapping("/deleteActor/{actorId}")
	public Map<String, Boolean> deleteActor(@PathVariable(value = "actorId") int actorTimeId)
			throws ResourceAccessException {
		Actor actor = actorRepository.findById(actorTimeId)
				.orElseThrow(() -> new ResourceAccessException("Actor not found for this id :: " + actorTimeId));
		actorRepository.deleteById(actorTimeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response; }
	@PostMapping("/putActor")
	public Actor createActor(@RequestBody Actor actor) {
		return actorRepository.save(actor);
	}

	//FILM
	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}
	@GetMapping("/randomFilms{number}")
	public List<Film> getRandomFilms(@PathVariable(value = "number") int number)
	{
		return filmRepository.getRandomFilms(number);
	}

	@PutMapping("/putFilms/{id}")
	public ResponseEntity<Film> updateFilm(@PathVariable(value = "id") Integer filmId, @RequestBody Film filmDetails) {
		Film film = filmRepository.findById(filmId).orElseThrow(() -> new ResourceAccessException("Film not found for this id :: " + filmId));
		film.setFilmTitle(filmDetails.getFilmTitle());
		film.setFilmDescription(filmDetails.getFilmDescription());
		film.setReleaseYear(filmDetails.getReleaseYear());
		film.setAgeRating(filmDetails.getAgeRating());
		final Film updatedFilm = filmRepository.save(film);
		return ResponseEntity.ok(updatedFilm); }
	@DeleteMapping("/deleteFilm/{actorId}")
	public Map<String, Boolean> deleteFilm(@PathVariable(value = "filmId") int filmTimeId)
			throws ResourceAccessException {
		Film film = filmRepository.findById(filmTimeId)
				.orElseThrow(() -> new ResourceAccessException("Film not found for this id :: " + filmTimeId));
		actorRepository.deleteById(filmTimeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response; }
	@PostMapping("/putFilm")
	public Film createFilm(@RequestBody Film film) {
		return filmRepository.save(film); }

	//RENTAL
	@GetMapping("/allRentals")
	public @ResponseBody
	Iterable<Rental> getAllRentals() { return rentalRepository.findAll(); }
	@PutMapping("/putRentals/{id}")
	public ResponseEntity<Rental> updateRental(@PathVariable(value = "id") Integer rentalId, @RequestBody Rental rentalDetails) {
		Rental rental = rentalRepository.findById(rentalId).orElseThrow(() -> new ResourceAccessException("Rental not found for this id :: " + rentalId));
		rental.setRentalDate(rentalDetails.getRentalDate());
		final Rental updatedRental = rentalRepository.save(rental);
		return ResponseEntity.ok(updatedRental); }
	@DeleteMapping("/deleteRental/{rentalId}")
	public Map<String, Boolean> deleteRental(@PathVariable(value = "rentalId") int rentalTimeId)
			throws ResourceAccessException {
		Rental rental = rentalRepository.findById(rentalTimeId)
				.orElseThrow(() -> new ResourceAccessException("Rental not found for this id :: " + rentalTimeId));
		rentalRepository.deleteById(rentalTimeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response; }
	@PostMapping("/putRental")
	public Rental createRental(@RequestBody Rental rental) { return rentalRepository.save(rental);}

	//ADDRESS
	@GetMapping("/allAddresses")
	public @ResponseBody
	Iterable<Address> getAllAddresses() { return addressRepository.findAll(); }
	@PutMapping("/putAddresses/{id}")
	public ResponseEntity<Address> updateAddress(@PathVariable(value = "id") Integer addressId, @RequestBody Address addressDetails) {
		Address address = addressRepository.findById(addressId).orElseThrow(() -> new ResourceAccessException("Address not found for this id :: " + addressId));
		address.setAddressTitle(addressDetails.getAddressTitle());
		address.setDistrictTitle(addressDetails.getDistrictTitle());
		address.setPostalCode(addressDetails.getPostalCode());
		final Address updatedAddress = addressRepository.save(address);
		return ResponseEntity.ok(updatedAddress); }
	@DeleteMapping("/deleteAddress/{addressId}")
	public Map<String, Boolean> deleteAddress(@PathVariable(value = "addressId") int addressTimeId)
			throws ResourceAccessException {
		Address address = addressRepository.findById(addressTimeId)
				.orElseThrow(() -> new ResourceAccessException("Address not found for this id :: " + addressTimeId));
		addressRepository.deleteById(addressTimeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response; }
	@PostMapping("/putAddress")
	public Address createAddress(@RequestBody Address address) { return addressRepository.save(address); }

	//CUSTOMER
	@GetMapping("/allCustomers")
	public @ResponseBody
	Iterable<Customer> getAllCustomers() { return customerRepository.findAll(); }
	@GetMapping("/CustomersById/{id}")
	public Optional<Customer> getCustomerById(@PathVariable(value = "id") int customerId) { return customerRepository.findById(customerId); }
	@GetMapping("CustomersByName/{firstName}/{lastName}")
	public Customer getCustomerByName(@PathVariable(value = "firstName") String firstName, @PathVariable(value = "lastName") String lastName) { return customerRepository.getCustomerByName(firstName, lastName); }
	@PutMapping("/putCustomer/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable(value = "id") Integer customerId, @RequestBody Customer customerDetails) {
		Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new ResourceAccessException("Customer not found for this id :: " + customerId));
		customer.setFirstName(customerDetails.getFirstName());
		customer.setLastName(customerDetails.getLastName());
		customer.setEmail(customerDetails.getEmail());
		final Customer updatedCustomer = customerRepository.save(customer);
		return ResponseEntity.ok(updatedCustomer); }
	@DeleteMapping("/deleteCustomer/{customerId}")
	public Map<String, Boolean> deleteCustomer(@PathVariable(value = "customerId") int customerTimeId)
			throws ResourceAccessException {
		Customer customer = customerRepository.findById(customerTimeId)
				.orElseThrow(() -> new ResourceAccessException("Customer not found for this id :: " + customerTimeId));
		customerRepository.deleteById(customerTimeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response; }
	@PostMapping("/putCustomer")
	public Customer createCustomer(@RequestBody Customer customer) { return customerRepository.save(customer); }

	//INVENTORY
	@GetMapping("/allInventory")
	public @ResponseBody
	Iterable<Inventory> getAllInventory() { return inventoryRepository.findAll(); }
	@PutMapping("/putInventory/{id}")
	public ResponseEntity<Inventory> updateInventory(@PathVariable(value = "id") Integer inventoryId, @RequestBody Inventory inventoryDetails) {
		Inventory inventory = inventoryRepository.findById(inventoryId).orElseThrow(() -> new ResourceAccessException("Inventory not found for this id :: " + inventoryId));
		final Inventory updatedInventory = inventoryRepository.save(inventory);
		return ResponseEntity.ok(updatedInventory); }
	@DeleteMapping("/deleteInventory/{inventoryId}")
	public Map<String, Boolean> deleteInventory(@PathVariable(value = "inventoryId") int inventoryTimeId)
			throws ResourceAccessException {
		Inventory inventory = inventoryRepository.findById(inventoryTimeId)
				.orElseThrow(() -> new ResourceAccessException("Inventory not found for this id :: " + inventoryTimeId));
		inventoryRepository.deleteById(inventoryTimeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response; }
	@PostMapping("/putInventory")
	public Inventory createInventory(@RequestBody Inventory inventory) { return inventoryRepository.save(inventory); }

	//PAYMENT
	@GetMapping("/allPayment")
	public @ResponseBody
	Iterable<Payment> getAllPayment() { return paymentRepository.findAll(); }
	@PutMapping("/putPayment/{id}")
	public ResponseEntity<Payment> updatePayment(@PathVariable(value = "id") Integer paymentId, @RequestBody Payment paymentDetails) {
		Payment payment = paymentRepository.findById(paymentId).orElseThrow(() -> new ResourceAccessException("Payment not found for this id :: " + paymentId));
		payment.setAmount(paymentDetails.getAmount());
		final Payment updatedPayment = paymentRepository.save(payment);
		return ResponseEntity.ok(updatedPayment); }
	@DeleteMapping("/deletePayment/{paymentId}")
	public Map<String, Boolean> deletePayment(@PathVariable(value = "paymentId") int paymentTimeId)
			throws ResourceAccessException {
		Payment payment = paymentRepository.findById(paymentTimeId)
				.orElseThrow(() -> new ResourceAccessException("Payment not found for this id :: " + paymentTimeId));
		paymentRepository.deleteById(paymentTimeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response; }
	@PostMapping("/putPayment")
	public Payment createPayment(@RequestBody Payment payment) { return paymentRepository.save(payment); } }