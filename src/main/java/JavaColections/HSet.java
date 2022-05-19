package JavaColections;

import java.util.HashSet;

public class HSet {
    public static void main(String[] args) {
        HashSet<String> animals=new HashSet<String>();
        animals.add("Pisica");
        animals.add("Caine");
        animals.add("Delfin");
        animals.add("Vupe");
        animals.add("Caine");
//        animals.remove("Caine");
//        animals.clear();
//        System.out.println(animals.size());
//        System.out.println(animals);
//        System.out.println("Colectia animals contine obiectul Pisica: "+ animals.contains("Pisica"));
//        System.out.println("Colectia animals contine obiectul Lup: "+ animals.contains("Lup"));

for (String i : animals){
    System.out.println(i);
}
    }
}
