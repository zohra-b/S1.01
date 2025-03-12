package n3ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class N3Ex1 {

    static ArrayList<Copywriter> copywriters = new ArrayList<Copywriter>();

    public static void main(String[] args) {
        String answer = "";
        int option;
        String name;
        String id;
        String title;
        String text;
        String competition;
        String club;
        String player;
        String team;
        Scanner input = new Scanner(System.in);

////  AÑADIMOS UNOS REDACTORES AL ARRAY PARA TESTEAR EL CODIGO  /////////////////////////////////////////////////////////
        copywriters.add(new Copywriter("Carlos López", "123456") );
        copywriters.add(new Copywriter("Silvia Rodríguez", "234567") );
        copywriters.add(new Copywriter("Marc Faure", "345678") );
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        do {
            System.out.println(""
                    + "1.- Introducir redactor/a.\r\n"
                    + "2.- Eliminar redactor/a.\r\n"
                    + "3.- Introducir noticia a un redactor/a.\r\n"
                    + "4.- Eliminar noticia (ha de demanar redactor/a i titular de la notícia).\r\n"
                    + "5.- Mostrar todas las noticias por redactor/a.\r\n"
                    + "6.- Calcular puntuación de la noticia.\r\n"
                    + "7.- Calcular precio de la noticia.\r\n"
                    + "0.- Salir del programa.");

            option = input.nextInt();
            input.nextLine();

            switch(option) {
                case 1 :
                    System.out.println("Introduce el nombre seguido del apellido del redactor");
                    name = input.nextLine();
                    System.out.println("Introduce el DNI del redactor");
                    id = input.nextLine();
                    System.out.println(
                            createCopywriter(name, id) + "\n" +
                                    copywritersList());
                    break;

                case 2 :
                    System.out.println(copywritersList());
                    System.out.println("Introduce el DNI del redactor que quieres eliminar");
                    id = input.nextLine();
                    System.out.println(
                            deleteCopywriter(id) + "\n" +
                                    copywritersList());
                    break;

                case 3 :
                    System.out.println(
                            "Introduce el numero de DNI del redactor \n" +
                                    copywritersList());
                    id = input.nextLine();
                    System.out.println("Introduce el título de la noticia");
                    title =  input.nextLine();
                    System.out.println("Introduce el texto de la noticia");
                    text =  input.nextLine();
                    System.out.print("Introduce el tipo de noticia : "
                            + "1. Futbol "
                            + "2. Basquet "
                            + "3. Tenis "
                            + "4. F1 "
                            + "5. Motociclisme ");
                    option = input.nextInt();
                    input.nextLine();
                    switch(option) {
                        case 1:
                            System.out.println("Introduce la competición");
                            competition = input.nextLine();
                            System.out.println("Introduce el club");
                            club = input.nextLine();
                            System.out.println("Introduce el nombre del jugador");
                            player = input.nextLine();
                            answer = createFootballNews(id, title, text, competition, club, player);
                            break;
                        case 2 :
                            System.out.println("Introduce la competición");
                            competition = input.nextLine();
                            System.out.println("Introduce el club");
                            club = input.nextLine();
                            answer = createBasketNews(id, title, text, competition, club);
                            break;
                        case 3 :
                            System.out.println("Introduce la competición");
                            competition = input.nextLine();
                            System.out.println("Introduce el nombre del tenista");
                            player = input.nextLine();
                            answer = createTennisNews(id, title, text, competition, player);
                            break;
                        case 4 :
                            System.out.println("Introduce la escudería");
                            team = input.nextLine();
                            answer = createF1News(id, title, text,team);
                            break;
                        case 5 :
                            System.out.println("Introduce el equipo");
                            team = input.nextLine();
                            answer = createMotoNews(id, title, text,team);
                            break;
                    }
                    break;

                case 4 :
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


                case 5 :
                    System.out.println(copywritersList());
                    System.out.println("Introduce el DNI del redactor que quieres consultar");
                    id = input.nextLine();
                    answer =copywriterArticles(id);
                    break;

                case 6 :
                    System.out.println(newsList());
                    System.out.println("Introduce el nombre y apellido del redactor de la noticia");
                    name = input.nextLine();
                    System.out.println("Introduce el titular de la noticia para calcular los puntos");
                    title = input.nextLine();
                    answer = calculatePoints(name, title);
                    break;

                case 7 :
                    System.out.println(newsList());
                    System.out.println("Introduce el nombre y apellido del redactor de la noticia");
                    name = input.nextLine();
                    System.out.println("Introduce el titular de la noticia para calcular el precio");
                    title = input.nextLine();
                    answer = calculatePrice(name, title);
                    break;

                case 0 :
                    answer = "Saliendo del programa";

                default :
                    answer = "Introduce une opción válida";
            }

            System.out.println(answer);

        } while (option != 0);
        input.close();
    }



    /////////////////// BUSCAR EL INDICE DE UN REDACTOR DENTRO DEL ARRAYLIST redactors por id
    public static int copywriterIndex(String id) {
        int copywriterIndex = -1;
        for (int i = 0; i < copywriters.size(); i++) {
            if (id.equalsIgnoreCase(copywriters.get(i).getId()))
                copywriterIndex = i;
        }
        return copywriterIndex;
    }


    /////////////////// BUSCAR EL INDICE DE UN REDACTOR DENTRO DEL ARRAYLIST redactors por nombre
    public static int copywriterIndexByName(String name) {
        int copywriterIndexByName = -1;
        for (int i = 0; i < copywriters.size(); i++) {
            if (name.equalsIgnoreCase(copywriters.get(i).getName()))
                copywriterIndexByName = i;
        }
        return copywriterIndexByName;
    }

    /////////////////// BUSCAR EL INDICE DE UNA NOTICIA POR EL Nombre DEL REDACTOR y el titulo
    public static int articleIndex(String name, String title) {
        int copywriterIndex = copywriterIndexByName(name);
        int articleIndex = -1;
        for (int i = 0 ; i < copywriters.get(copywriterIndex).getNews().size(); i++) {
            if(title.equalsIgnoreCase(copywriters.get(copywriterIndex).getNews().get(i).getTitle())) {
                articleIndex = i;
            }
        }
        return articleIndex;

    }
    /////////////////// COMPROBAR SI ESTE id YA EXISTE DENTRO DE LA APP
    public static boolean existingId(String id) {
        boolean existingId = false;
        for (Copywriter r : copywriters) {
            if (id.equalsIgnoreCase(r.getId())) {
                existingId = true;
            }
        }
        return existingId;
    }
    /////////////////// MOSTRAR LA LISTA DE TODOS LOS REDACTORES
    public static String copywritersList() {
        String copywritersList = "Lista redactores : \n";
        for(Copywriter r : copywriters) {
            copywritersList += "Nom : " + r.getName() + " - DNI : " + r.getId() + "\n";
        }
        return copywritersList;
    }

    /////////////////// MOSTRAR LA LISTA DE TODAS LAS NOTICIAS
    public static String newsList() { /////////ATTENTION NE MARCHE PAS

        //////0. unr - Carlos López.1. waw - Carlos López.
        /////2. unr - Silvia Rodríguez.3. waw - Silvia Rodríguez.
        /////4. unr - Marc Faure.5. waw - Marc Faure.
        String newsList = "Lista noticias : \n";
        int i = 0;
        for(Copywriter r : copywriters) {
            for (News n : r.getNews()) {
                newsList += i++ + ". " + n.getTitle() + " - " + r.getName() + ".";
                ;			}
        }
        return newsList;
    }

    /////////////////// DETERMINAR DE QUE DEPORTE HABLA LA NOTICIA DE NOTICIAS
    public static String getSport(News news) {
        String sport = "";
        if(news instanceof FootballNews) {
            sport = "Futbol";
        } else if(news instanceof BasketNews) {
            sport = "Basquet";
        } else if(news instanceof TennisNews) {
            sport = "Tenis";
        } else if(news instanceof F1News) {
            sport = "F1";
        } else if(news instanceof MotoNews) {
            sport = "Motociclisme";
        }
        return sport;
    }
    /////////////////// MOSTRAR LA LISTA DE NOTICIAS POR CADA REDACTOR BUSQUEDA POR DNI
    public static String copywriterArticles(String id) {
        int index = copywriterIndex(id);
        String copywriterArticles = "Lista de las noticias del redactor/a : \n";
        News copywriterArticle;
        String answer = "";
        if (index == -1){
            answer = "Comprueba el DNI introducido";
        } else {
            for (int i = 0 ; i < copywriters.get(index).getNews().size() ; i++) {

                copywriterArticle = copywriters.get(index).getNews().get(i);
                copywriterArticles += (i+1) + ".- " + getSport(copywriterArticle) + " - " + copywriterArticle.getTitle() + "\n";
            }
            answer = copywriterArticles;
        }
        return answer;
    }

    /////////////////// MOSTRAR LA LISTA DE NOTICIAS POR CADA copywriter BUSQUEDA POR NOMBRE
    public static String copywriterArticlesByName(String name) {
        int index = copywriterIndexByName(name);
        String copywriterArticles = "Lista de las noticias del redactor/a : \n";
        String answer = "";
        News news;
        if (index == -1){
            answer = "Se ha equivocado introduciendo el nombre. Inténtalo de nuevo.";
        } else {
            for (int i = 0 ; i < copywriters.get(index).getNews().size() ; i++) {

                news = copywriters.get(index).getNews().get(i);
                copywriterArticles += (i+1) + ".- " + getSport(news) + " - " + news.getTitle() + "\n";
            }
            answer = copywriterArticles;
        }
        return answer;
    }


    ///////////////// CREAR Y ELIMINAR UN REDACTOR
    public static String createCopywriter(String name, String id) {
        String answer = "";
        if(!existingId(id)) {
            Copywriter newCopywriter = new Copywriter(name, id);
            copywriters.add(newCopywriter);
            answer = "El redactor " + name + " con DNI " + id + " se ha creado." ;
        } else {
            answer = "Ya existe un redactor con este DNI. Vuelve a intentar";
        }
        return answer;
    }


    public static String deleteCopywriter(String id) {
        String answer="";
        int index = copywriterIndex(id);
        if (index == -1){
            answer = "Comprueba el DNI introducido";
        } else {
            copywriters.remove(index);
            answer = "El redactor ha sido eliminado";
        }
        return answer;
    }

    /////////////// CREAR LOS VARIOS TIPOS DE NOTICIAS
    public static String createFootballNews(String id, String title, String text,
                                             String competition, String club, String player){
        String answer = "";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    FootballNews newArticle = new FootballNews(title, competition, club, player);
                    r.getNews().add(newArticle);
                    answer = "La noticia ha sido creada"; // + lista noticias del redactor
                }
            }
        }
        return answer;
    }

    public static String createBasketNews(String id, String title, String text,
                                              String competition, String club){
        String answer = "";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    BasketNews newArticle = new BasketNews(title, competition, club);
                    r.getNews().add(newArticle);
                    answer = "La noticia ha sido creada"; // + lista noticias del copywriter
                } 			}
        }
        return answer;
    }

    public static String createTennisNews(String id, String title, String text,
                                          String competition, String player){
        String answer = "";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    TennisNews newArticle = new TennisNews(title, competition, player);
                    r.getNews().add(newArticle);
                    answer = "La noticia ha sido creada"; // + lista noticias del copywriter
                }
            }
        }
        return answer;
    }

    public static String createF1News(String id, String title, String text,
                                      String team){
        String answer = "";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    F1News newArticle = new F1News(title, team);
                    r.getNews().add(newArticle);
                    answer = "La noticia ha sido creada"; // + lista noticias del copywriter
                }
            }
        }
        return answer;
    }


    public static String createMotoNews(String id, String title, String text,
                                        String team){
        String answer = "";
        int index = copywriterIndex(id);
        if (index == -1) {
            answer = "No se ha encontrado este redactor";
        } else {
            for (Copywriter r : copywriters) {
                if (id.equalsIgnoreCase(r.getId())) {
                    MotoNews newArticle = new MotoNews(title, team);
                    r.getNews().add(newArticle);
                    answer = "La noticia ha sido creada"; // + lista noticias del copywriter
                }
            }
        }
        return answer;
    }

    /////////////////////ELIMINAR NOTICIA
    private static String deleteNews(String name, String title) {
        int copywriterIndex = copywriterIndexByName(name);
        int articleIndex = articleIndex(name, title);
        String answer = "";

        if(copywriterIndex == -1) {
            answer = "Este nombre no existe ";
        } else if(articleIndex == -1) {
            answer = "Este título no existe";
        } else {
            copywriters.get(copywriterIndex).getNews().remove(articleIndex);
            answer =  "La noticia ha sido eliminada";
        }
        return answer ;
    }


    //////////////////// CALCULAR PRECIO y puntos NOTICIA
    private static String calculatePrice(String name, String title) {
        int copywriterIndex = copywriterIndexByName(name);
        int articleIndex = articleIndex(name, title);
        String answer = "";
        int price;
        if(copywriterIndex == -1) {
            answer = "Este nombre no existe ";
        } else if(articleIndex == -1) {
            answer = "Este título no existe";
        } else {
            price = copywriters.get(copywriterIndex).getNews().get(articleIndex).calculatePrice();
            answer = "El precio de la noticia es de " + price + " euros";
        }
        return answer;
    }

    private static String calculatePoints(String name, String title) {
        int copywriterIndex = copywriterIndexByName(name);
        int articleIndex = articleIndex(name, title);
        String answer = "";
        int points;
        if(copywriterIndex == -1) {
            answer = "Este nombre no existe ";
        } else if(articleIndex == -1) {
            answer = "Este título no existe";
        } else {
            points =  copywriters.get(copywriterIndex).getNews().get(articleIndex).calculatePoints();
            answer = "la noticia vale " + points + " puntos";
        }
        return answer;
    }


}

