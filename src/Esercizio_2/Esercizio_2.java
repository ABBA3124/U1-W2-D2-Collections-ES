package Esercizio_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio_2 {


    // 1) Scrivere una funzione che accetti un intero N e restituisca una lista ordinata di N interi casuali da O a 100.

    //funzione che genera una lista ordinata di N interi casuali da 0 a 100
    public static List<Integer> generaListaCasuale(int N) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(101));
        }

        Collections.sort(lista);
        return lista;

    }


    /* 2) Scrivere una seconda funzione che accetti una lista e restituisca una nuova lista composta dagli elementi della prima lista
    seguiti dagli stessi elementi disposti in ordine inverso.*/

    //funziona che crea una nuova lista con gli elementi della lista originale seguiti dagli stessi elementi in ordine inverso
    public static List<Integer> addListaSpecchio(List<Integer> lista) {
        List<Integer> listaSpecchio = new ArrayList<>(lista);

        for (int i = lista.size() - 1; i >= 0; i--) {
            listaSpecchio.add(lista.get(i));
        }
        return listaSpecchio;
    }


    /*
    3)
    Scrivere una terza funzione che accetti una lista ed un booleano:
    se il booleano è true stampa i valori in posizioni pari,
    altrimenti
    stampa i valori in posizioni dispari.
    */

    public static void pariODispari(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println(lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }

    // main) Creare una main che utilizzi le tre funzioni. Utilizzare l'interfaccia List e l'implementazione ArrayList.
    public static void main(String[] args) {


        // lista interi casuali ordinati
        List<Integer> listaCasualeOrdinata = generaListaCasuale(15);
        System.out.println("\nLista casuale ordinata: " + listaCasualeOrdinata);


        //lista con ordine inverso
        List<Integer> listaSpecchio = addListaSpecchio(listaCasualeOrdinata);
        System.out.println("\nLista con ordine inverso: " + listaSpecchio);
//        System.out.println("Lista con ordine inverso: " + addListaSpecchio(listaCasualeOrdinata));

        //valori pari
        System.out.println("\nValori in posizione pari: ");
        pariODispari(listaCasualeOrdinata, true);

        //valori dispari
        System.out.println("\nValori in posizione dispari: ");
        pariODispari(listaCasualeOrdinata, false);
    }
}
