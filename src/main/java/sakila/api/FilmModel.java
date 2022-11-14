package sakila.api;

public class FilmModel {
    private String filmTitle;
    private String filmDescription;
    private int filmYear;
    private String filmRating;

    public FilmModel(String fTitle, String fDescription, int fYear, String fRating){
        this.filmTitle = fTitle;
        this.filmDescription = fDescription;
        this.filmYear = fYear;
        this.filmRating = fRating;
    }

    public String getFilmTitle(){ return filmTitle; }
    public String getFilmDescription(){ return filmDescription; }
    public int getFilmYear(){ return filmYear; }
    public String getFilmRating(){ return filmRating; }
}
