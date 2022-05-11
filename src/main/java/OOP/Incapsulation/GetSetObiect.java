package OOP.Incapsulation;
//incapsularea, oop
//creezi o clasa, faci constructore , construiesti obiecte si
// atributele la clasa sa fie private, accesul la atribute sa
// fie permis doar prin intermediul la geteri si seteri
public class GetSetObiect {
    public static void main(String[] args) {
    Obiect obiect=new Obiect("Vadim","Vasluian",2002324439);
Obiect1 obiect1=new Obiect1("Ion","Ivanov",12,223344455);
Obiect2 obiect2=new Obiect2("Peter ","Parker",11);
Obiect3 obiect3= new Obiect3("Reed","Richards");
Obiect4 obiect4=new Obiect4();
obiect3.setNume("Paul");
        System.out.println(obiect3.getNume());
//        obiect1.setTelefon(22334433);
        System.out.println(obiect1.Clasa);
        System.out.println(obiect1.getNume());
        System.out.println(obiect1.getPrenume());
        System.out.println(obiect1.getTelefon());
//        System.out.println(obiect.getNume());
//        System.out.println(obiect.getPrenume());
//        System.out.println(obiect.getIDNP());
//        obiect.setNume("Vasile");
//        obiect.setPrenume("Vasluian");
//        obiect.setIDNP(2003224344);
//        System.out.println(obiect.getNume());
//        System.out.println(obiect.getPrenume());
//        System.out.println(obiect.getIDNP());
    }

}
