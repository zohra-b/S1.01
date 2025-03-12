package n3ex1;

public class BasketNews extends News {
    private String competition;
    private String club;
    private final int basePrice = 250;
    private final int eurolliga = 75;
    private final int barcaMadrid = 75;

    public BasketNews(String title , String competition, String club) {
        super(title);
        this.competition = competition;
        this.club = club;
    }

    // getters
    public String getCompetition() {
        return this.competition;
    }

    public String getClub() {
        return this.club;
    }


    // setters
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setClub(String club) {
        this.club = club;
    }



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


    public String toString() {
        return "Esto es una noticia de básquet. Mi título es : " + super.getTitle() + ". ";
    }
}
