package ExToString;

public class TestStudent {
    public static void main(String[] args) {
        Student student2=new Student("Tony","Stark");
        Student student3=new Student("Bruce","Wayne",2244);
        Student student= new Student("John","Constatin",2232,2);
        Student student1=new Student("John","Cena",2233,4,true);

       student1.setNume("Steve");
       student1.setPrenume("Rogers");
       student1.setId(1123);
       student1.setAnul(3);
       student1.setBursa(false);
       System.out.println(student1.toString());
    }
}
