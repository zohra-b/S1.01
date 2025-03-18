package n3ex1.Controllers;

import n3ex1.Models.Copywriter;

import static n3ex1.N3Ex1.copywriters;

public class CopywriterMethods {
    public static String copywritersList() {
        String copywritersList = "Lista redactores : \n";
        for(Copywriter r : copywriters) {
            copywritersList += "Nom : " + r.getName() + " - DNI : " + r.getId() + "\n";
        }
        return copywritersList;
    }

    public static String createCopywriter(String name, String id) {
        String answer;
        if(!existingId(id)) {
            Copywriter newCopywriter = new Copywriter(name, id);
            copywriters.add(newCopywriter);
            answer = "Se ha creado " + newCopywriter.toString();
        } else {
            answer = "Ya existe un redactor con este DNI. Vuelve a intentar";
        }
        return answer;
    }

    public static String deleteCopywriter(String id) {
        String answer;
        int index = copywriterIndex(id);
        if (index == -1){
            answer = "Comprueba el DNI introducido";
        } else {
            copywriters.remove(index);
            answer = "El redactor ha sido eliminado";
        }
        return answer;
    }

    public static boolean existingId(String id) {
        boolean existingId = false;
        for (Copywriter r : copywriters) {
            if (id.equalsIgnoreCase(r.getId())) {
                existingId = true;
            }
        }
        return existingId;
    }

    public static int copywriterIndex(String id) {
        int copywriterIndex = -1;
        for (int i = 0; i < copywriters.size(); i++) {
            if (id.equalsIgnoreCase(copywriters.get(i).getId()))
                copywriterIndex = i;
        }
        return copywriterIndex;
    }

    public static int copywriterIndexByName(String name) {
        int copywriterIndexByName = -1;
        for (int i = 0; i < copywriters.size(); i++) {
            if (name.equalsIgnoreCase(copywriters.get(i).getName()))
                copywriterIndexByName = i;
        }
        return copywriterIndexByName;
    }


}
