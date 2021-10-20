package Platform.Component;


import Customization.MaturityLevel;
import Main.Genres;
import Main.Language;
import Main.Quality;
import java.util.GregorianCalendar; // To change

public class Show {

    private String title;

    private GregorianCalendar release_date;

    private Quality quality; // Enum

    private Genres genres; // Enum

    private Language lang; // Enum

    private String names; // Array of names

    private int num_views; //Should be static 

    private String synopsis; // Summary of the film

    private double average_rating; // Should be calculated or entered by the producer

    private MaturityLevel levels; // Enum 

    private int total_watch; // should be static too (not sure)

    public Show(String title, GregorianCalendar release_date, Quality quality, Genres genres,
            Language lang, String names, String synopsis, MaturityLevel levels) {
        this.title = title;
        this.release_date = release_date;
        this.quality = quality;
        this.genres = genres;
        this.lang = lang;
        this.names = names;
        this.synopsis = synopsis;
        this.levels = levels;
    }
    
}
