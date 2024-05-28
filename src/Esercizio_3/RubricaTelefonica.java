package Esercizio_3;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
Esercizio #3
Scrivere una classe Java che permetta di gestire una rubrica telefonica.

La lista dei contatti è realizzata mediante una HashMap in cui le chiavi sono i
nomi delle persone e i valori sono i numeri di telefono.

Realizzare i metodi per:
 */


public class RubricaTelefonica {
    //mappa che  memorizza i contatti con nome, telefono
    private Map<String, String> contatti;

    //costruttore che inizializza la hashmap
    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Cancella contatto");
            System.out.println("3. Cerca persona per numero");
            System.out.println("4. Cerca numero per nome");
            System.out.println("5. Stampa contatti");
            System.out.println("6. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci il numero di telefono:");
                    String telefono = scanner.nextLine();
                    rubrica.aggiungiContatto(nome, telefono);
                    break;
                case 2:
                    System.out.println("Inserisci il nome del contatto da cancellare:");
                    nome = scanner.nextLine();
                    rubrica.cancellaContatto(nome);
                    break;
                case 3:
                    System.out.println("Inserisci il numero di telefono:");
                    telefono = scanner.nextLine();
                    System.out.println(rubrica.cercaPersonaPerNumero(telefono));
                    break;
                case 4:
                    System.out.println("Inserisci il nome:");
                    nome = scanner.nextLine();
                    System.out.println(rubrica.cercaNumeroPerNome(nome));
                    break;
                case 5:
                    rubrica.stampaContatti();
                    break;
                case 6:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
        System.out.println("chiusura programma.");
    }
//1. L'inserimento di una coppia <Nome, telefono>

    //inserire una coppia <Nome, Telefono>
    public void aggiungiContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " --> " + telefono);
    }

    //2. La cancellazione di una coppia «Nome, telefono> a partire dal nome
    //cancellare un contatto a partire dal nome
    public void cancellaContatto(String nome) {
        if (contatti.containsKey(nome)) {
            contatti.remove(nome);
            System.out.println("Contatto rimosso: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }

    //3. La ricerca di una Persona di cui si conosce il numero di telefono
    //cerca una persona conoscendo il numero di telefono
    public String cercaPersonaPerNumero(String telefono) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return "Nessuna persona trovata con il numero: " + telefono;
    }

    //4. La ricerca del numero di telefono di una Persona di cui si conosce il Nome
    //cerca il numero di telefono conoscendo il nome
    public String cercaNumeroPerNome(String nome) {
        return contatti.getOrDefault(nome, "Nessun numero trovato per: " + nome);
    }

    //5. La stampa di tutti i contatti con nome e numero.
    //stampa contatti
    public void stampaContatti() {
        if (contatti.isEmpty()) {
            System.out.println("Rubrica vuota.");
        } else {
            System.out.println("Contatti nella rubrica:");
            for (Map.Entry<String, String> entry : contatti.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
