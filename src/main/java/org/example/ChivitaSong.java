package org.example;

import java.util.*;

public class ChivitaSong {
    public static void main(String[] args) {
        myChivaSong();
    }

    private static void myChivaSong() {

        Stack<String> animales = new Stack<>();
        animales.push("el loro");
        animales.push("el gato");
        animales.push("el perro");
        animales.push("el lobo");
        animales.push("el chancho");
        animales.push("la vaca");
        animales.push("el caballo");
        animales.push("el rinoceronte");
        animales.push("el jaguar");
        animales.push("el leon");
        animales.push("el elefante");
        animales.push("el raton");
        animales.push("el tigre");
        animales.push("el mono");
        animales.push("el dinosaurio");

        Map<String, String> llamarA = new HashMap<>();

        System.out.println("Sal de ahí chivita chivita, sal de ahí de ese lugar");

        String actualmente = "la chiva";
        int count = 0;

        List<String> remover = new ArrayList<>();

        String inspeccionar = "la chiva";

        for (int i = 0; i < 15; i++) {

            String prox = animales.get(count);
            llamarA.put(actualmente, prox);
            System.out.println("Hay que llamar a " + prox + " para que saque a " + actualmente);
            actualmente = prox;

            do {
                remover.add(llamarA.get(inspeccionar) + " no quiere sacar a " + inspeccionar);
                inspeccionar = llamarA.get(inspeccionar);
            } while (!llamarA.containsValue(inspeccionar));


            for (int j = remover.size()-1; j >= 0; j--) {
                System.out.println(remover.get(j));
            }
            System.out.println("La chiva no quiere salir de ahí. Sal de ahí chivita chivita. Sal de ahí de ese lugar");
            count++;
        }
    }
}