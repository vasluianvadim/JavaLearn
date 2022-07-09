package Repetare;

public class Main {
    public static void main(String[] args) {
        Planete Pamant=new Planete("Earth","Terestra","5,972E24 kg");
        Planete Jupiter=new Planete("Jupiter","Gas giant","1,898E27 kg");
        Planete Luna=new Planete("Luna","Satelit","7.342×1022 kg ");
        System.out.println(Pamant.toString());
        System.out.println(Jupiter.toString());
        System.out.println(Luna.toString());
    }
}
