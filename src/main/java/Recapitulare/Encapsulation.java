package Recapitulare;

import java.util.Enumeration;

public class Encapsulation {
    private String nume="Ion";
    private String prenume="Ivanov";
    private int virsta =22;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public void setPrenume(String prenume){
        this.prenume=prenume;
    }
    public String getPrenume(){
        return prenume;
    }
    public void setVirsta(int virsta){
        this.virsta=virsta;
    }
    public int getVirsta(){
        return virsta;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation =new Encapsulation();
        encapsulation.nume="john";
        encapsulation.virsta=24;
        encapsulation.prenume="Tatar";
        System.out.println(encapsulation.nume);
        System.out.println(encapsulation.prenume);
        System.out.println(encapsulation.virsta);

    }
}
