package OOP.Incapsulation;
//  o metoda primeste un int, daca numarul este de la 1 pana la 5 la ecran se
//        afiseaza textul “mai mic sau egal ca 5”, daca este de la 5 la 10 se
//        afiseaza “de la cinci la zece” si plus adaugi valoare default
public class Switch1 {
    public static void main(String[] args) {
        micMare(5);
        micMare(9);
        micMare(11);

    }
    public static void micMare(int number){
        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("mai mic sau egal cu 5");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("de la 5 la 10");
                break;
            default:
                System.out.println("nu apartine sirului");
        }
    }
}
