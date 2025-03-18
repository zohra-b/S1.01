package n3ex1.Models;

public class BasketNews extends News {
    private String competition;
    private String club;
    private final int basePrice = 250;
    private final int eurolliga = 75;
    private final int barcaMadrid = 75;

    public BasketNews(String title , String text, String competition, String club) {
        super(title, text);
        this.competition = competition;
        this.club = club;
    }

    public String getCompetition() {
        return this.competition;
    }

    public String getClub() {
        return this.club;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public int calculatePrice() {
        int price = basePrice;
        if (this.competition.equalsIgnoreCase("Eurolliga")) {
            price += eurolliga;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            price += barcaMadrid;
        }
        return price;
    }

    @Override
    public int calculatePoints() {
        int points = 4;
        if (this.competition.equalsIgnoreCase("Eurolliga")) {
            points +=3;
        } else if (this.competition.equalsIgnoreCase("ACB")) {
            points +=2;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            points +=1;
        }
        return points;
    }
    @Override
    public String toString() {
        return "noticia de básquet. \n Competicion : " + this.competition +
                " - Club : " + this.club + ". \n Título : " + super.getTitle() + ". " +
                "\n Texto : " + super.getText();
    }
}
