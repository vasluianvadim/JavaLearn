public class WhileClass {

    public static void main(String[] args) {
//        methodWhile();
        methodDoWhile();

    }


    public static void methodWhile() {
        int numberForStart = 1;
        int numberForStop = 5;

        while (numberForStart <= numberForStop) {
            System.out.println(numberForStart);
            numberForStart++;
        }
    }


    public static void methodDoWhile() {
        int numberForStart = 6;
        int numberForStop = 5;
        do {
            System.out.println(numberForStart);
            numberForStart++;
        }
        while (numberForStart <= numberForStop);

    }


}
