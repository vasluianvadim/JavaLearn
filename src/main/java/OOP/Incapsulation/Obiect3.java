package OOP.Incapsulation;

public class Obiect3 {
    private String Nume;
    private String Prenume;
    Obiect3(String nume, String prenume) {
            this.Nume = nume;
            this.Prenume = prenume;

        }
        public String getNume(){
        return Nume;
        }
        public void setNume(String nume){
            this.Nume=nume;
        }
        public String getPrenume(){
            return Prenume;
        }
    }
