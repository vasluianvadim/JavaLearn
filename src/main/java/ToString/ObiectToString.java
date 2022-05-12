package ToString;



public class ObiectToString {
   private String nume;
   private int id;

    public ObiectToString(int id,String nume){
       this.id=id;
       this.nume=nume;
    }
    public String toString() {
        return "id ul este " + id + " \n Numele este "+ nume;
    }
    public void setNume(String nnume){
        this.nume=nnume;
    }
    public void setId(int idd){
        this.id=idd;
    }

}
