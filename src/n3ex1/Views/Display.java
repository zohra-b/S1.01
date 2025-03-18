package n3ex1.Views;

import java.util.Scanner;

import static n3ex1.Controllers.CopywriterMethods.*;
import static n3ex1.Controllers.NewsMethods.*;

public class Display {
    public static Scanner input = new Scanner(System.in);

    public static int option;
    static String answer = "";
    static String name;
    static String id;
    static String title;
    static String text;
    static String competition;
    static String club;
    static String player;
    static String team;

    public static void displayGeneralMenu() {
        System.out.println("""
                1.- Introducir redactor/a.
                2.- Eliminar redactor/a.
                3.- Introducir noticia a un redactor/a.
                4.- Eliminar noticia (ha de demanar redactor/a i titular de la notícia).
                5.- Mostrar todas las noticias por redactor/a.
                6.- Calcular puntuación de la noticia.
                7.- Calcular precio de la noticia.
                0.- Salir del programa."""
        );
    }

    public static void generalMenuSwitchCases() {

        switch (option) {
            case 1:
                System.out.println("Introduce el nombre seguido del apellido del redactor");
                name = input.nextLine();
                System.out.println("Introduce el DNI del redactor");
                id = input.nextLine();
                System.out.println(
                        createCopywriter(name, id) + "\n" +
                                copywritersList());
                break;

            case 2:
                System.out.println(copywritersList());
                System.out.println("Introduce el DNI del redactor que quieres eliminar");
                id = input.nextLine();
                System.out.println(
                        deleteCopywriter(id) + "\n" +
                                copywritersList());
                break;

            case 3:
                System.out.println(
                        "Introduce el numero de DNI del redactor \n" +
                                copywritersList());
                id = input.nextLine();
                System.out.println("Introduce el título de la noticia");
                title = input.nextLine();
                System.out.println("Introduce el texto de la noticia");
                text = input.nextLine();
                System.out.print("Introduce el tipo de noticia : "
                        + "1. Futbol "
                        + "2. Basquet "
                        + "3. Tenis "
                        + "4. F1 "
                        + "5. Motociclisme ");
                option = input.nextInt();
                input.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Introduce la competición");
                        competition = input.nextLine();
                        System.out.println("Introduce el club");
                        club = input.nextLine();
                        System.out.println("Introduce el nombre del jugador");
                        player = input.nextLine();
                        answer = createFootballNews(id, title, text, competition, club, player);
                        break;
                    case 2:
                        System.out.println("Introduce la competición");
                        competition = input.nextLine();
                        System.out.println("Introduce el club");
                        club = input.nextLine();
                        answer = createBasketNews(id, title, text, competition, club);
                        break;
                    case 3:
                        System.out.println("Introduce la competición");
                        competition = input.nextLine();
                        System.out.println("Introduce el nombre del tenista");
                        player = input.nextLine();
                        answer = createTennisNews(id, title, text, competition, player);
                        break;
                    case 4:
                        System.out.println("Introduce la escudería");
                        team = input.nextLine();
                        answer = createF1News(id, title, text, team);
                        break;
                    case 5:
                        System.out.println("Introduce el equipo");
                        team = input.nextLine();
                        answer = createMotoNews(id, title, text, team);
                        break;

                }
                break;

            case 4:
                System.out.println(copywritersList());
                System.out.println("Introduce el nombre y apellido del redactor que quieres consultar");
                name = input.nextLine();
                if (copywriterIndexByName(name) == -1) {
                    answer = copywriterArticlesByName(name);
                } else {
                    System.out.println(copywriterArticlesByName(name));
                    System.out.println("Introduce el titular de la noticia que quieres eliminar");
                    title = input.nextLine();
                    answer = deleteNews(name, title) + "\n" + copywriterArticlesByName(name);
                }
                break;

            case 5:
                answer = newsList();
                break;

            case 6:
                System.out.println(newsList());
                System.out.println("Introduce el nombre y apellido del redactor de la noticia");
                name = input.nextLine();
                System.out.println("Introduce el titular de la noticia para calcular los puntos");
                title = input.nextLine();
                answer = calculatePoints(name, title);
                break;

            case 7:
                System.out.println(newsList());
                System.out.println("Introduce el nombre y apellido del redactor de la noticia");
                name = input.nextLine();
                System.out.println("Introduce el titular de la noticia para calcular el precio");
                title = input.nextLine();
                answer = calculatePrice(name, title);
                break;

            case 0:
                answer = "Saliendo del programa";
                break;

            default:
                answer = "Introduce une opción válida";
        }

        System.out.println(answer);
    }
}
