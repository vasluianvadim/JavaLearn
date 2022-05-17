package Exercitii;

public class Student {
    private String nume;
    private String prenume;
    private String profil;


    public  Student (String Nume,String Prenume,String Profil){
        this.nume=Nume;
        this.prenume=Prenume;
        this.profil=Profil;

    }
    public String getNume(){
        return nume;
    }
    public String getPrenume(){
        return prenume;
    }
    public String getProfil(){
        return profil;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public void setPrenume(String prenume){
        this.prenume=prenume;
    }
    public void setProfil(String profil){
        this.profil=profil;
    }

    @Override
    public String toString() {
        return "Numele: "+nume +";  Prenumele: "+ prenume+";  Profilul " + profil+";";
    }

}
