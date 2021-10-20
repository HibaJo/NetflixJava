package Main;


import Platform.Component.Request;
import Platform.Component.Show;
import Authentication.Account;
import Customization.MaturityLevel;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Scanner;

public class Netflix {
        
    private Show shows; // Array or List

    private Account customers; // Array or List

    private Request requests; // Array or List

    private Map plans_by_country; // Countries Selector or enum

    private Map maturity_by_region; // Regions Selector or enum
    
    public Netflix() {
    }
    
    Netflix(Show shows, Map plans_by_country, Map maturity_by_region) {
        this.shows = shows;
        this.plans_by_country = plans_by_country;
        this.maturity_by_region = maturity_by_region;
    }

    public Account register() {
        System.out.println("======================================");
        Scanner scanner = new Scanner(System.in);
        //Should be developped later for checking the format!
        String email; 
        String password; 
        System.out.print("Enter an email: ");
        email = scanner.next();
        scanner.nextLine();
        System.out.print("Enter a password: ");
        password = scanner.next();       
        System.out.println("======================================");
     
        return (new Account(email, password));
    }

    public void search() {
    }

    public void browse() {
    }

    public Show addShow() {
        System.out.println("======================================");
        Scanner scanner = new Scanner(System.in);
        String title;
        GregorianCalendar gcal;
        Quality quality;
        Genres genres = Genres.TVSHOWS;
        Language language = Language.ENGLISH;
        String names;
        String synopsis;
        int choice = 0;
        int release_year;
        int release_month;
        int release_day;
        int age;
        MaturityLevel levels;
        System.out.print("Enter the title of your show: ");
        title = scanner.nextLine();
        System.out.print("Enter the release year: ");
        release_year = scanner.nextInt();
        System.out.print("Enter the release month: ");
        release_month = scanner.nextInt();
        System.out.print("Enter the release day: ");
        release_day = scanner.nextInt();
        gcal = new GregorianCalendar(release_year, release_month, release_day);
        System.out.println("\n1. UHD\n2. ATOMOS\n3. HD");
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.print("Chooose a quality: ");
            choice = scanner.nextInt();
        }
        if (choice == 1) {
            quality = Quality.UHD;
        }
        else if (choice == 2) {
            quality = Quality.ATMOS;
        }
        else {
            quality = Quality.HD;
        }
        System.out.println("\n1.ACTION\n2.ANIME\n3.FAMILY\n4.CLASSIC\n5.COMEDIES\n6.DRAMAS"
                + "\n7.HORROR\n8.ROMANTIC\n9.SCIENCEFICTION\n10.SPORTS\n11.TVSHOWS");
        choice = 0;
        while (choice < 1 || choice > 11) {
            System.out.print("Enter your choice of genres: ");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                genres = Genres.ACTION;
                break;
            case 2:
                genres = Genres.ANIME;
                break;
            case 3:
                genres = Genres.FAMILY;
                break;
            case 4:
                genres = Genres.CLASSIC;
                break;
            case 5:
                genres = Genres.COMEDIES;
                break;
            case 6:
                genres = Genres.DRAMAS;
                break;
            case 7:
                genres = Genres.HORROR;
                break;
            case 8:
                genres = Genres.ROMANTIC;
                break;
            case 9:
                genres = Genres.SCIENCEFICTION;
                break;
            case 10: 
                genres = Genres.SPORTS;
                break;
            case 11:
                genres = Genres.TVSHOWS;
                break;
        }
        System.out.println("\n1.ENGLISH\n2.FRENCH\n3.GERMAN\n4.ITALIEN\n5.SPANISH\n6.POTUGUESE"
                + "\n7.ARABIC\n8.KOREAN\n9.TURKISH\n10.HEBREW\n11.CHINESE");
        choice = 0;
        while (choice < 1 || choice > 11) {
            System.out.print("Enter your choice of languages: ");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                language = Language.ENGLISH;
                break;
            case 2:
                language = Language.FRENCH;
                break;
            case 3:
                language = Language.GERMAN;
                break;
            case 4:
                language = Language.ITALIEN;
                break;
            case 5:
                language = Language.SPANISH;
                break;
            case 6:
                language = Language.POTUGUESE;
                break;
            case 7:
                language = Language.ARABIC;
                break;
            case 8:
                language = Language.KOREAN;
                break;
            case 9:
                language = Language.TURKISH;
                break;
            case 10: 
                language = Language.HEBREW;
                break;
            case 11:
                language = Language.CHINESE;
                break;
        }
        scanner.nextLine();
        System.out.print("Enter the names of actors: ");
        names = scanner.nextLine();
        System.out.print("Enter the synopsis of your show: ");
        synopsis = scanner.nextLine();
        System.out.print("Enter the minimum age allowed to watch: "); // Should be a switch (not sure)
        age = scanner.nextInt();
        levels = new MaturityLevel(age);
        System.out.println("======================================");
        
        return (new Show(title, gcal, quality, genres,language, names, synopsis, levels));
    }
}
