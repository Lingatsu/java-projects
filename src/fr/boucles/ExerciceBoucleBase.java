package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        // Affichez tous les nombres de 1 à 10
        System.out.println("Nombres de 1 à 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Affichez 20 fois votre nom et votre prénom
        String nomPrenom = "Barbin Kévin";
        System.out.println("\nNom et prénom affichés 20 fois:");
        for (int i = 0; i < 20; i++) {
            System.out.println(nomPrenom);
        }
        // Affichez les éléments pairs de 2 à 100
        System.out.println("\nÉléments pairs de 2 à 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
        // Affichez les éléments impairs de 1 à 99
        System.out.println("\nÉléments impairs de 1 à 99:");
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
    }
}
}
