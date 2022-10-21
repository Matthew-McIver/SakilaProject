package com.Sakila.api.SakilaMicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/BootUp")
@CrossOrigin
public class SakilaMicroserviceApplication {

	@Autowired
	private ActorRepository actorRepository;
	private FilmRepository filmRepository;
	public SakilaMicroserviceApplication(ActorRepository myActorRepo, FilmRepository myFilmRepo)
	{
		this.actorRepository = myActorRepo;
		this.filmRepository = myFilmRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaMicroserviceApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms() { return filmRepository.findAll(); }

}
