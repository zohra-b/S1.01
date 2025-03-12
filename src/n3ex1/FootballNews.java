package n3ex1;

public class FootballNews extends News {
    private String competition;
    private String club;
    private String player;
    private final int basePrice = 300;
    private final int lliga = 100;
    private final int barcaMadrid = 100;
    private final int torresBenze = 50;

    public FootballNews(String title , String competition, String club, String player) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    public String getCompetition() {
        return this.competition;
    }

    public String getClub() {
        return this.club;
    }

    public String getPlayer() {
        return this.player;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int calculatePrice() {
        int price = basePrice;
        if (this.competition.equalsIgnoreCase("Lliga de Campions")) {
            price += lliga;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            price += barcaMadrid;
        }
        if (this.player.equalsIgnoreCase("Ferran Torres") || this.player.equalsIgnoreCase("Benzema")) {
            price += torresBenze;
        }
        return price;
    }

    public int calculatePoints() {
        int points = 5;
        if (this.competition.equalsIgnoreCase("Lliga de Campions")) {
            points +=3;
        } else if (this.competition.equalsIgnoreCase("Lliga")) {
            points +=2;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            points +=1;
        }
        if (this.player.equalsIgnoreCase("Ferran Torres") || this.player.equalsIgnoreCase("Benzema")) {
            points +=1;
        }
        return points;
    }

    public String toString() {
        return "Esto es una noticia de futbol. Mi título es : " + super.getTitle() + ". ";
    }

}
