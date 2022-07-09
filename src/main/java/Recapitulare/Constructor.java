package Recapitulare;

import org.checkerframework.checker.units.qual.C;

public class Constructor {
    String num;
    String country;

    Constructor(String nume, String country) {
        this.country = country;
        this.num = nume;

    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor("Gerald", "Rivia");
    }
}
