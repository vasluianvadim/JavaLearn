package ObjectConstructor;

public class ObiectulPrincipal {
    public static void main(String[] args) {
        Cars1 cars1 = new Cars1("Bmw","e3","verde",2020);
        Cars1 cars2= new Cars1("Audi","Q7","Gri",2021);
//        System.out.println(cars1.marca);
//        System.out.println(cars2.marca);
        cars2.prezentare();
//        cars1.prezentare();
        cars2.modelulMasinii();
        cars2.anulMasinii();
        cars2.culoareaMasinii();

//
//        Cars car = new Cars();
//        System.out.println("Masina este : ");
//        System.out.println(car.marca);
//        System.out.println(car.anulProducerii);
//        System.out.println(car.culoare);
//        System.out.println(car.model);
//        System.out.println(car.taraProducator);
    }


}
