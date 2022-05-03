package variablesAndMethods;

public class Methods {
    public static void main(String[] args) {

        int numar = 2;

        int numarDoi = sumaEgalCuPatru();
        System.out.println(numarDoi);


    }


    // toate metodele care au return type diferit de void trebuie sa contina cuvantul
    // return, care arata ce valoare Finala returneaza
    static int sumaEgalCuPatru() {
        int a = 2;
        int b = 2;
        int suma = a + b;
        return suma;
    }

    static void sumaEgalCuPatruVoid() {
        int a = 2;
        int b = 2;
        int suma = a + b;
        System.out.println(suma);
    }

}
