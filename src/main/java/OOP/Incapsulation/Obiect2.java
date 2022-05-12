package OOP.Incapsulation;

public class Obiect2 {


        private String Nume;
        private String Prenume;
        int Clasa;

        Obiect2(String nume,String prenume,int clasa){
            this.Nume=nume;
            this.Prenume=prenume;
            this.Clasa=clasa;

        }
        public String getNume(){
            return Nume;
        }
        public String getPrenume(){
            return Prenume;
        }
}
