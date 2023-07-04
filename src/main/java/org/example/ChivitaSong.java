package org.example;

import java.util.*;

public class ChivitaSong {
    public static void main(String[] args) {
        myChivaSong();
    }

    private static void myChivaSong() {

        List<String> animales = new ArrayList<>();
        animales.add("el loro");
        animales.add("el gato");
        animales.add("el perro");
        animales.add("el lobo");
        animales.add("el chancho");
        animales.add("la vaca");
        animales.add("el caballo");
        animales.add("el rinoceronte");
        animales.add("el jaguar");
        animales.add("el leon");
        animales.add("el elefante");
        animales.add("el raton");
        animales.add("el tigre");
        animales.add("el mono");
        animales.add("el dinosaurio");

        Map<String, String> llamarA = new HashMap<>();

        System.out.println("Sal de ahí chivita chivita, sal de ahí de ese lugar");

        String actualmente = "la chiva";
        int count = 0;

        List<String> remover = new ArrayList<>();

        String inspeccionar = "la chiva";

        for (int i = 0; i < 15; i++) {

            Set<String> animalesConjunto = new HashSet<>();
            Set<String> animalesUtilizados = new HashSet<>();

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