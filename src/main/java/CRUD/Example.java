package CRUD;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();

        Student student = new Student(1, "nume", "orenunmm", 3, "TIR191");
        Student student2 = new Student(2, "nume2", "orenunmm2", 3, "TIR_192");

        arrayList.add(student);
        arrayList.add(student2);
        // adaugarea unui nou element
        arrayList.add(new Student(3, "nume3", "prenume3", 4, "TIR191"));

        cautaDupaGrypaSiAfiseaza(arrayList, "TIR191");


        // afisarea tuturor elementelor
//        for (Student s:arrayList) {
//            System.out.println(s);
//        }

        // delete
//        arrayList.remove(student2);

        // afisarea tuturor elementelor
//        for (Student s:arrayList) {
//            System.out.println(s);
//        }

        // search si afisarea obiectului gasit

        /*
         * 1. Metoda de afisare totala
         * 2. Delete la element (index)
         * 3. Adaugam un user, detaliile se dau de la tastatura
         * 4. Edit, editam userul dupa id == la urma
         * 5. Gasim userul dupa nume, sau mai multi
         * */
//
//        System.out.println("----Meniu--------");
//        System.out.println("1. Afisarea");
//        System.out.println("2. Delete");
//        System.out.println("3. Cauta. ");

//        System.out.println("Alege functia: ");
//        Scanner scanner = new Scanner(System.in);
//        int numar = scanner.nextInt();
//        switch (numar) {
//            case 1: {
//                afisarea(arrayList);
//                break;
//            }
//            case 2: {
//                break;
//            }
//
//            case 3: {
//                System.out.println("da grupa");
//                String grupa = scanner.nextLine();
//                cautaDupaGrypaSiAfiseaza(arrayList, grupa);
//                break;
//            }
//        }
    }

    public static void afisarea(ArrayList<Student> arrayList) {
        for (Student s : arrayList) {
            System.out.println(s);
        }
    }

    // afisarea dupa grupa (atribut = grupa)
    public static void cautaDupaGrypaSiAfiseaza(ArrayList<Student> arrayList, String grupa) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getGrupa() == grupa) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
