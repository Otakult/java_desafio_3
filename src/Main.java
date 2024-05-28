import Classes.Titulo;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("(1)");
        ArrayList<Integer> listaInt = new ArrayList<>();
        listaInt.add(4);
        listaInt.add(7);
        listaInt.add(2);
        listaInt.add(6);
        listaInt.add(1);
        System.out.println(listaInt);
        Collections.sort(listaInt);
        System.out.println(listaInt);
        System.out.println("(2 e 3)");
        Titulo titulo1 = new Titulo("Os sete samurais");
        Titulo titulo2 = new Titulo("Hora de Aventura");
        Titulo titulo3 = new Titulo("Três homens em conflito");
        Titulo titulo4 = new Titulo("Dungeon Meshi");
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);
        System.out.println(listaTitulos);
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

        System.out.println("(4)");
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("Tanjiro");
        lista.add("Inosuke");
        lista.add("Zenitsu");
        System.out.println("ArrayList "+ lista);
        lista = new LinkedList<>();
        lista.add("Akira");
        lista.add("Ryou");
        System.out.println("LinkedList " + lista);

        System.out.println("(4 e 5)");

    }
}