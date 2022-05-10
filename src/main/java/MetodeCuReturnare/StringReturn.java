package MetodeCuReturnare;

public class StringReturn {
    public static void main(String[] args) {
        profesia();
        nume();
        System.out.println("And his name is " + nume());
        System.out.println("His profession is "+ profesia() );
        federatia();
        System.out.println("He is working in " + federatia());
    }
    public static String nume(){
         String nume ="John Cena";
        return nume ;
    }
    public static String profesia(){
       String profesia="Pro Wrestler";
        return profesia;
    }
    public static String federatia(){
        String federatia="WWE Federation";
        return federatia;
    }
}
