package Esercizio_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user deve inserire un numero intero N
        System.out.println("Inserisci il numero di parole che vuoi inserire: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //set per memorizzare le parole distinte
        Set<String> paroleDistinte = new HashSet<>();
        //set per momorizzare le parole duplicate
        Set<String> paroleDuplicate = new HashSet<>();

        //ciclo per N volte per inserire le parole
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci la parola " + (i + 1) + ": ");
            String parola = scanner.nextLine();

            //if se la parola è già presente nel set delle parole distinte significa che  è una duplicata
            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        //parole duplicate
        if (!paroleDuplicate.isEmpty()) System.out.println("Parole duplicate: " + paroleDuplicate);

        else System.out.println("Non ci sono parole duplicate.");


        //parole distinte
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());

        // parole distinte
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);

        scanner.close();
    }
}
