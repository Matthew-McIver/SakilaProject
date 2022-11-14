package com.akila.api.sakila.microservice;
import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "film")
public class Film {
    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;

    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    Collection<Film> actors;

    @OneToMany(mappedBy = "film")
    Set<Inventory> inventory;

    @Column(name = "title")
    String filmTitle;

    @Column(name = "description")
    String filmDescription;

    @Column(name = "release_year")
    int releaseYear;

    @Column(name = "rating")
    String ageRating;

    //Constructor
    public Film(String myFilmTitle, String myFilmDescription, int myReleaseYear, String myAgeRating) {
        this.filmTitle = myFilmTitle;
        this.filmDescription = myFilmDescription;
        this.releaseYear = myReleaseYear;
        this.ageRating = myAgeRating; }

    public Film() {}

    //Methods
    public int getFilmId() {
        return filmId;
    }
    public void setFilmId(int myFilmId) {
        filmId = myFilmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }
    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmDescription() {
        return filmDescription;
    }
    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int myReleaseYear) { this.releaseYear = myReleaseYear;}

    public String getAgeRating() { return ageRating;}
    public void setAgeRating(String ageRating) {this.ageRating = ageRating;} }