package OOP.Incapsulation;

public class Obiect {
    private String Nume;
    private String Prenume;
    private int IDNP;
    Obiect(String nume,String prenume,int idnp){
        this.Nume=nume;
        this.Prenume=prenume;
        this.IDNP=idnp;

    }

    public String getNume(){
        return Nume;
    }
    public String getPrenume(){
        return Prenume;
    }
    public int getIDNP(){
        return IDNP;
    }
 public void setNume( String nume1){
 this.Nume=nume1;
 }
 public void setPrenume(String prenume1){
        this.Prenume=prenume1;
 }
public void setIDNP(int idnp1){
        this.IDNP=idnp1;
}
}
