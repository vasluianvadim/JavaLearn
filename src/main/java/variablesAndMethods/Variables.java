package variablesAndMethods;

public class Variables {
    /*
     * modificartori de acces sunt 4 tipuri:
     * public, private, protected, default(package private)
     *
     * 3 tipuri de valori (numeric, string(text), boolean(true/false))
     * PRIMITIVE
     * numeric:
     * tip de numar intreg (e.g. 1, 5, 6, 8885)
     * int
     *
     * tip de numar fractional (floating point number) e.g. 2.6, 5.69
     * double
     *
     * tip de date boolean
     * boolean poate primi doar doua valor : true/false
     *
     *
     * tipul de date char reprezinta doar o singura literea, un caracter
     *
     * e.g. e,a,b,g,t
     *     char primaLiteraMicaDinAlf = 'a';
     *
     * */
    // DE REFERINTA (WRAPPER)
    // String, care reprezinta text
    // diferente dintre String si char este: char poate stoca un singur caracter si se scrie in ''
    // dar String poate stoca texte mari si se scrie in ghilimele

    public static void main(String[] args) {
        int name;
        name = 67;

        int variabila = 5;


        double numarNeFx;
        numarNeFx = 6;

        double secondDouble = 5.6;
        System.out.println(secondDouble);

        char caracterSingle = 'e';


        String stringText;

        stringText = "text di nstring";

        String secondString = "text second";


        afiseazaDeCinciOri();

        int numar = 5;

        afiseazaDeCinciOri();
    }


//methods

    static void afiseazaDeCinciOri() {
        System.out.println("Text");
        System.out.println("Text");
        System.out.println("Text");
        System.out.println("Text");
        System.out.println("Text");
        System.out.println("-------------------");
    }

}
