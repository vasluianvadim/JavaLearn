package TrainingPackage;

import static javafx.scene.input.KeyCode.I;
import static javafx.scene.input.KeyCode.J;

public class MultidimenisonalArray {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        cars[0][0] = "Tesla";
        cars[0][1] = "BMW";
        cars[0][2] = "Camaro";
        cars[1][0] = "Audi";
        cars[1][1] = "Dacia";
        cars[1][2] = "Auris";
        cars[2][0] = "Mazda";
        cars[2][1] = "Corvet";
        cars[2][2] = "Lada";
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++)
                System.out.print(cars[i][j]+" ");


        }
    }
}
