package n3ex1;

import n3ex1.Models.Copywriter;

import java.util.ArrayList;
import java.util.Scanner;

import static n3ex1.Views.Display.*;


public class N3Ex1 {

    public static ArrayList<Copywriter> copywriters = new ArrayList<>();


    public static void main(String[] args) {
        ////  AÑADIMOS UNOS REDACTORES AL ARRAY PARA TESTEAR EL CODIGO  /////////
        copywriters.add(new Copywriter("Carlos López", "123456"));
        copywriters.add(new Copywriter("Silvia Rodríguez", "234567"));
        copywriters.add(new Copywriter("Marc Faure", "345678"));


        do {
            displayGeneralMenu();
            option = input.nextInt();
            input.nextLine();
            generalMenuSwitchCases();

        } while (option != 0);
        input.close();
    }





}

