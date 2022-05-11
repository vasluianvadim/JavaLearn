package OOP.Incapsulation;
//creezi o metoda care primeste numarul lunii si la ecran se afiseaza numele lunii :
//        exempleu = primeste unmarul 2 la ecran se afiseaza februarie
public class Switch2 {
    public static void main(String[] args) {
        lunileAnului(8);
        lunileAnului(4);
        lunileAnului(13);
        lunileAnului(2);
    }
    public static void lunileAnului(int nrLunii){
        switch (nrLunii){
            case 1:
                System.out.println("ianuarie");
                break;
            case 2:
                System.out.println("februarie");
                break;
            case 3:
                System.out.println("martie");
                break;
            case 4:
                System.out.println("aprilie");
                break;
            case 5:
                System.out.println("mai");
                break;
            case 6:
                System.out.println("iunie");
                break;
            case 7:
                System.out.println("iulie");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("septembrie");
                break;
            case 10:
                System.out.println("octombrie");
                break;
            case 11:
                System.out.println("noiembrie");
                break;
            case 12:
                System.out.println("decembrie");
                break;
            default:
                System.out.println("nu exista asa luna a anului");

        }
    }
}
