package returnExample;

public class Return {
    public static void main(String[] args) {
        String variabila = metodaAfiseazaText();
        System.out.println(variabila);
//        metodaAfiseazaText();
//        int numarMaxim = afiseazaMaxim(4,7);
//        System.out.println(numarMaxim);
        afiseazaMaxim(4,7);

    }

    public static String metodaAfiseazaText(){
        return "text";
    }

    public static void afiseazaMaxim(int a, int b){
        int max;
        if(a>b)max= a;
        else max= b;
        System.out.println(max);
    }
}
