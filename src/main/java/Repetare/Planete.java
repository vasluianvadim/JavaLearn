package Repetare;

public class Planete {
    String name;
    String categorie;
    String masa;

    Planete(String nume,String categorie,String masa){
this.name=nume;
this.masa=masa;
this.categorie=categorie;

    }
    public String toString(){
return "Nume: "+name+"; Categorie:  "+categorie+";  Masa: "+masa+";";
    }
}
