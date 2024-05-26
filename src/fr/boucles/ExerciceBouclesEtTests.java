package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] tableau = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        // Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("Éléments du tableau:");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("Éléments du tableau dans l'ordre inverse:");
        for (int i = tableau.length - 1; i >= 0; i--) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        // Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        System.out.println("Éléments du tableau supérieurs à 3:");
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > 3) {
                System.out.print(tableau[i] + " ");
            }
        }
        System.out.println();
        // Afficher les entiers pairs
        System.out.println("Éléments pairs du tableau:");
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] % 2 == 0) {
                System.out.print(tableau[i] + " ");
            }
        }
        System.out.println();
        // Afficher les valeurs des index pairs
        System.out.println("Valeurs aux index pairs du tableau:");
        for (int i = 0; i < tableau.length; i++) {
            if (i % 2 == 0) {
                System.out.print(tableau[i] + " ");
            }
        }
        System.out.println();
        // Afficher les entiers impairs
        System.out.println("Éléments impairs du tableau:");
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] % 2 != 0) {
                System.out.print(tableau[i] + " ");
            }
        }
    }
}
