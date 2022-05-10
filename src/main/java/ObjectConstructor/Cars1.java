package ObjectConstructor;

public class Cars1 {
    String marca;
    String model;
    String culoare;
    int anulProducerii;


    Cars1(String marca, String model, String culoare, int anulProducerii){
       this.marca=marca;
       this.anulProducerii=anulProducerii;
       this.culoare=culoare;
       this.model=model;
    }
     void prezentare(){
        System.out.println("Numele masinii este : "+ this.marca);
    }
     void modelulMasinii(){
        System.out.println("Masina este de modelul :" + this.model);
    }
    void culoareaMasinii(){
        System.out.println("Masina e de culoarea :" + this.culoare);
    }
    void anulMasinii(){
        System.out.println("Masina este din anul : " + this.anulProducerii);
    }
}
