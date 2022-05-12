package ToString;

import OOP.Incapsulation.Obiect;

public class TestObject {
    public static void main(String[] args) {
        ObiectToString obiectToStringparam=new ObiectToString(1,"Nume");
        System.out.println(obiectToStringparam);
obiectToStringparam.setNume("Nume nou");
        obiectToStringparam.setId(2);
        System.out.println(obiectToStringparam);
    }

}
