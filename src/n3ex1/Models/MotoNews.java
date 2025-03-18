package n3ex1.Models;

public class MotoNews extends News {

    private String team;
    private final int basePrice = 100;
    private final int honYam = 50;

    public MotoNews(String title , String text, String team) {
        super(title, text);
        this.team = team;

    }

    public String getTeam() {
        return this.team;
    }


    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public int calculatePrice() {
        int price = basePrice;

        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            price += honYam;
        }
        return price;
    }

    @Override
    public int calculatePoints() {
        int points = 3;

        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            points +=3;
        }
        return points;
    }

    @Override
    public String toString() {
        return "noticia de Motociclisme. \n Equipo : " + this.team +
                "\n Título : " + super.getTitle() + ". " +
                "\n Texto : " + super.getText();
    }

}
