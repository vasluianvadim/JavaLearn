package ExToString;
// clasa Student (id, nume, prenume, anul, +boolean)
//toti parametrii vor fi private,
// geteri si seteri, constructori (2-3), si acela default
//sa rescrii metoda toString,
//in clasa Test va trebui sa modifici valoarea la parametri (id, nume ...)
//si sa o afisezi (seteri si geteri)
public class Student {
   private String nume;
   private String prenume;
   private int id;
   private int anul;
   private boolean bursa;

   public  Student(String nume,String prenume) {
      this.nume = nume;
      this.prenume = prenume;

   }

   public  Student(String nume,String prenume, int id) {
      this.nume = nume;
      this.prenume = prenume;
      this.id = id;
   }

   public  Student(String nume,String prenume,int anul, int id){
      this.nume=nume;
      this.prenume=prenume;
      this.id=id;
      this.anul=anul;

   }
   public Student(String nume,String prenume,int id,int anul,boolean bursa){
      this.nume=nume;
      this.prenume=prenume;
      this.anul=anul;
      this.id=id;
      this.bursa=bursa;

   }
   public String toString (){
      return "Numele : "+nume  + "\nPrenumele : "+ prenume + "\nAnul de studii : "+ anul + "\nStudent ID : "+ id + "\nBursa : "+  bursa;
   }
   public String getNume(){
      return nume;
   }
   public String getPrenume(){
      return prenume;
   }
   public int getId(){
      return id;
   }
   public int getAnul(){
      return anul;
   }
   public void setNume(String Nume){
      this.nume=Nume;
   }
   public void setPrenume(String Prenume){
      this.prenume=Prenume;
   }
   public void setId(int Id){
      this.id=Id;
   }
   public void setAnul(int Anul){
      this.anul=Anul;
   }
   public void setBursa(boolean Bursa){
      this.bursa=Bursa;
   }
}
