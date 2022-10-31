package com.Sakila.api.SakilaMicroservice;

import org.apache.maven.wagon.ResourceDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
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
	public SakilaMicroserviceApplication(ActorRepository myActorRepo, FilmRepository myFilmRepo, RentalRepository myRentalRepo)
	{
		this.actorRepository = myActorRepo;
		this.filmRepository = myFilmRepo;
		this.rentalRepository = myRentalRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaMicroserviceApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
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
	public Actor createActor(@RequestBody Actor actor){
		return actorRepository.save(actor);
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms() { return filmRepository.findAll(); }

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

}
