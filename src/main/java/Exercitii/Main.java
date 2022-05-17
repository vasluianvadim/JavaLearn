package Exercitii;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


      Student student=new Student("John","Constantin","Religios");
      Student student1=new Student("Reed","Richards","Stiintific");
      Student student2=new Student("Peter","Parker","Stiintific");
      Student student3=new Student("George","Lucas","Cinematografic");
      Student student4=new Student("Thanos","Alarsovici","Genocidic");


        ArrayList<Student> listaStudenti=new ArrayList<Student>();
        listaStudenti.add(student);
        listaStudenti.add(student1);
        listaStudenti.add(student2);
        listaStudenti.add(student3);
        listaStudenti.add(student4);

//        for(int i=0;i<listaStudenti.size();i++){
//            System.out.println(listaStudenti.get(i));
//        }
        for (Student s :listaStudenti) {
            System.out.println(s);
        }
//         Student[]listaStudentilor=new Student[5];
//         listaStudentilor[0]=student;
//         listaStudentilor[1]=student1;
//         listaStudentilor[2]=student2;
//         listaStudentilor[3]=student3;
//         listaStudentilor[4]=student4;
//
//         for (int i=0;i<listaStudentilor.length;i++){
//             System.out.println(listaStudentilor[i]);
//         }

    }



}
