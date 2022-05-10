package Constructori;

public class Constructori {
    public static void main(String[] args) {
Student student =new Student("Numele",3,true,345,"franceza");
        Student student1 =new Student("Numele",3,true,345);
        Student student2 =new Student("Numele",3,true);


    }
}


class Student{
    String nume;
    int anulDeStudii;
    boolean bursa;
    int codPersonal;
    String limbaStraina;


    Student(String numeleStudentului, int anulDeStudii, boolean areBursa, int codPersonal, String limbaStraina){
        nume=numeleStudentului;
        this.anulDeStudii=anulDeStudii;
        this.bursa=areBursa;
        this.codPersonal=codPersonal;
        this.limbaStraina=limbaStraina;
    }

    Student(String numeleStudentului, int anulDeStudii, boolean areBursa, int codPersonal){
        nume=numeleStudentului;
        this.anulDeStudii=anulDeStudii;
        this.bursa=areBursa;
        this.codPersonal=codPersonal;
    }

    Student(String numeleStudentului, int anulDeStudii, boolean areBursa){
        nume=numeleStudentului;
        this.anulDeStudii=anulDeStudii;
        this.bursa=areBursa;
    }


}
