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

	public SakilaMicroserviceApplication(ActorRepository myActorRepo, FilmRepository myFilmRepo, RentalRepository myRentalRepo, AddressRepository myAddressRepo) {
		this.actorRepository = myActorRepo;
		this.filmRepository = myFilmRepo;
		this.rentalRepository = myRentalRepo;
		this.addressRepository = myAddressRepo;
	}

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
		return ResponseEntity.ok(updatedActor);
	}

	@DeleteMapping("/deleteActors/{id}")
	public Map<String, Boolean> deleteActor(@PathVariable(value = "actorId") int actorId) {
		Actor actor = actorRepository.findById(actorId).orElseThrow(() -> new ResourceAccessException("Actor not found for this id :: " + actorId));

		actorRepository.delete(actor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@PostMapping("/allActors")
	public Actor createActor(@RequestBody Actor actor) {
		return actorRepository.save(actor);
	}

	//FILM
	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@PutMapping("/putFilms/{id}")
	public ResponseEntity<Film> updateFilm(@PathVariable(value = "id") Integer filmId, @RequestBody Film filmDetails) {
		Film film = filmRepository.findById(filmId).orElseThrow(() -> new ResourceAccessException("Film not found for this id :: " + filmId));

		film.setFilmTitle(filmDetails.getFilmTitle());
		film.setFilmDescription(filmDetails.getFilmDescription());
		film.setReleaseYear(filmDetails.getReleaseYear());
		film.setAgeRating(filmDetails.getAgeRating());
		final Film updatedFilm = filmRepository.save(film);
		return ResponseEntity.ok(updatedFilm);
	}

	//RENTAL

	@GetMapping("/allRentals")
	public @ResponseBody
	Iterable<Rental> getAllRentals() {
		return rentalRepository.findAll();
	}

	@PutMapping("/putRentals/{id}")
	public ResponseEntity<Rental> updateRental(@PathVariable(value = "id") Integer rentalId, @RequestBody Rental rentalDetails) {
		Rental rental = rentalRepository.findById(rentalId).orElseThrow(() -> new ResourceAccessException("Rental not found for this id :: " + rentalId));

		rental.setRentalDate(rentalDetails.getRentalDate());
		final Rental updatedRental = rentalRepository.save(rental);
		return ResponseEntity.ok(updatedRental);
	}

	//ADDRESS

	@GetMapping("/allAddresses")
	public @ResponseBody
	Iterable<Address> getAllAddresses() {
		return addressRepository.findAll();
	}

	@PutMapping("/putAddresses/{id}")
	public ResponseEntity<Address> updateAddress(@PathVariable(value = "id") Integer addressId, @RequestBody Address addressDetails) {
		Address address = addressRepository.findById(addressId).orElseThrow(() -> new ResourceAccessException("Address not found for this id :: " + addressId));

		address.setAddressTitle(addressDetails.getAddressTitle());
		address.setDistrictTitle(addressDetails.getDistrictTitle());
		address.setPostalCode(addressDetails.getPostalCode());
		final Address updatedAddress = addressRepository.save(address);
		return ResponseEntity.ok(updatedAddress);
	}
}
