package switchExample;

public class SwitchExample {
    public static void main(String[] args) {
// dayOfWeek(1);
// dayOfWeek(4);
        workOrRest(4);
        workOrRest(6);
    }

    public static void workOrRest(int numberOfDay){
        switch (numberOfDay){

            case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                System.out.println("work");
                break;
            case 6:
                case 7:
                System.out.println("rest");
                break;
            default:
                System.out.println("default");
        }
    }


    public static void dayOfWeek(int dayNumber){
        switch (dayNumber){

            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 6:
                System.out.println("sambata");
                break;
            case 7 :
                System.out.println("duminica");
                break;
            default:
                System.out.println("nu aveam ");

        }

    }

}
