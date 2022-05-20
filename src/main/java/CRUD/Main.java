package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listaStudent = new ArrayList<Student>();

        listaStudent.add(new Student(11, "Robert", "Pattinson", 2, "Btm22"));
        listaStudent.add(new Student(12, "Bill", "Murray", 2, "Gbs90"));
        listaStudent.add(new Student(13, "Chris", "Evans", 3, "Cam41"));
        listaStudent.add(new Student(14, "Sebastian", "Stan", 3, "Cam41"));

        Scanner scanner = new Scanner(System.in);
        int numar;

        do {
            System.out.println("------MENIU------");
            System.out.println("Tasteaza 1 pentru afisare element");
            System.out.println("Tasteaza 2 pentru eliminare element");
            System.out.println("Tasteaza 3 pentru adaugare element");
            System.out.println("Tasteaza 4 pentru cautae element");
            System.out.println("----------------------------------");
            System.out.print("Introdu numarul: ");
            numar = scanner.nextInt();

            switch (numar) {
                case 1: {
                    afiseazaLista(listaStudent);
                    System.out.println("----------------------------------");
                    break;
                }

                case 2: {
                    stergeLista(listaStudent);
                    System.out.println("----------------------------------");
                    break;
                }

                case 3: {
                    adaugaElement(listaStudent);
                    System.out.println("----------------------------------");
                    break;
                }

                case 4: {
                    gasimStudent(listaStudent);
                    System.out.println("----------------------------------");
                    break;
                } default:
                    System.out.println("nu are asa functie");

            }

        } while (numar != 0);
    }

    public static void afiseazaLista(ArrayList<Student> listaStud) {
        for (Student i : listaStud)
            System.out.println(i);
    }

    public static void stergeLista(ArrayList<Student> listaStud) {
        System.out.println("Dati indexul elementului ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        listaStud.remove(index);
//        for (Student i : listaStud) {
//            System.out.println(i);
//        }
    }

    public static void adaugaElement(ArrayList<Student> listaStud) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int id;
        System.out.println("Da id");
        id = scanner.nextInt();

        String nume;
        System.out.println("Da nume");
        nume = scanner1.nextLine();

        String prenume;
        System.out.println("Da prenume");
        prenume = scanner1.nextLine();

        int anul;
        System.out.println("Da anul");
        anul = scanner.nextInt();

        String grupa;
        System.out.println("Da grupa");
        grupa = scanner1.nextLine();

        listaStud.add(new Student(id, nume, prenume, anul, grupa));

//        for (Student i : listaStud)
//            System.out.println(i);
    }

    public static void gasimStudent(ArrayList<Student> listaStudent) {

        String nume;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti nume pentru cautare ");
        nume = scanner.nextLine();
        System.out.println("----------------------------------");
        for (int i = 0; i < listaStudent.size(); i++){
        if (nume == null ? listaStudent.get(i).getNume() == null : nume.equals(listaStudent.get(i).getNume()))
                System.out.println(listaStudent.get(i));
        else System.out.println("Nu exista asa Element");
        }

    }

    public static void editeazaLista(ArrayList<Student> listaStudent) {
        Scanner scanner = new Scanner(System.in);
        String nume;
        nume = scanner.nextLine();
        for (int i = 0; i < listaStudent.size(); i++) ;


    }
}

