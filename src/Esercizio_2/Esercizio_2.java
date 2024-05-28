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


    /*
    2)
    Scrivere una seconda funzione che accetti una lista e restituisca una nuova lista composta dagli elementi della prima lista
    seguiti dagli stessi elementi disposti in ordine inverso.
    */
    /*
    3)
    Scrivere una terza funzione che accetti una lista ed un booleano:
    se il booleano è true stampa i valori in posizioni pari,
    altrimenti
    stampa i valori in posizioni dispari.
    */


    // main) Creare una main che utilizzi le tre funzioni. Utilizzare l'interfaccia List e l'implementazione ArrayList.
    public static void main(String[] args) {


        // lista interi casuali ordinati
        List<Integer> listaCasualeOrdinata = generaListaCasuale(25);
        System.out.println("Lista casuale ordinata: " + listaCasualeOrdinata);


        //lista secondo es
    }
}
