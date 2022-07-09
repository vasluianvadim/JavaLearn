package Recapitulare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {


        ArrayList<String> Planete = new ArrayList<>();
        Planete.add("Venus");
        Planete.add("Mercur");
        Planete.add("Jupiter");
        Planete.remove("Venus");
        Planete.add("Venus");
        System.out.println(Planete);
        LinkedList<String> Bancnote = new LinkedList<>();
        Bancnote.add("LEI");
        Bancnote.add("EURO");
        Bancnote.add("DOLARI");
        Bancnote.removeFirst();
        System.out.println(Bancnote);
        HashMap<String, String> tari = new HashMap();
        tari.put("Chisinau", "Moldova");
        tari.put("Bucuresti", "Romania");
        tari.put("Roma", "Italia");
        System.out.println(tari.containsKey("Chisinau"));



    }
}

