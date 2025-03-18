package n3ex1.Models;

public class TennisNews extends News {
    private String competition;
    private String player;
    private final int basePrice = 150;
    private final int goat = 100;

    public TennisNews(String title , String text, String competition, String player) {
        super(title, text);
        this.competition = competition;
        this.player = player;
    }

    public String getCompetition() {
        return this.competition;
    }

    public String getPlayer() {
        return this.player;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setClub(String player) {
        this.player = player;
    }

   @Override
    public int calculatePrice() {
        int price = basePrice;

        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
            price += goat;
        }
        return price;
    }
    @Override
    public int calculatePoints() {
        int points = 4;

        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
            points += 3;
        }
        return points;
    }

    @Override
    public String toString() {
        return "noticia de tenis. \n Competicion : " + this.competition +
                " - Tenista : " + this.player + ". \n Título : " + super.getTitle() + ". " +
                "\n Texto : " + super.getText();
    }

}
