package n3ex1;

public class TennisNews extends News {
    //atributs
    private String competition;
    private String player;
    private final int basePrice = 150;
    private final int goat = 100;

    //constructor
    public TennisNews(String title , String competition, String player) {
        super(title);
        this.competition = competition;
        this.player = player;
    }

    // getters
    public String getCompetition() {
        return this.competition;
    }

    public String getPlayer() {
        return this.player;
    }


    // setters
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setClub(String player) {
        this.player = player;
    }

    // metodes generals
    public int calculatePrice() {
        int price = basePrice;

        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
            price += goat;
        }
        return price;
    }

    public int calculatePoints() {
        int points = 4;

        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
            points += 3;
        }
        return points;
    }

    // metodes propis
    public String toString() {
        return "Esto es una noticia de tenis. Mi título es : " + super.getTitle() + ". ";
    }

}
