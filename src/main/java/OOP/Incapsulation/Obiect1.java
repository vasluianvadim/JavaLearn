package OOP.Incapsulation;

public class Obiect1 {

    private String Nume;
    private String Prenume;
     int Clasa;
    private int Telefon;
    Obiect1(String nume,String prenume,int clasa,int telefon){
        this.Nume=nume;
        this.Prenume=prenume;
        this.Clasa=clasa;
        this.Telefon=telefon;
    }
    public String getNume(){
        return Nume;
    }
    public String getPrenume(){
        return Prenume;
    }
    public int getTelefon(){
        return Telefon;
    }
    public void setTelefon(int telefon){
        this.Telefon=telefon;
    }
}


