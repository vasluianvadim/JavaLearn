package TestareJunit5;

import java.util.Objects;

public class ComparString {
    public static void main(String[] args) {
        System.out.println(compara("nume","Nume"));

    }
    public static boolean compara(String unu,String doi){
        if (unu.equalsIgnoreCase(doi))return true;
        else return false;
    }
}