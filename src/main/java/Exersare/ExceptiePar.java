package Exersare;

public class ExceptiePar {
    public static void numPar(int num) throws NuEsteParEception {
        if(num%2==1){ throw new NuEsteParEception("Numarul este impar");
        }else System.out.println("Numarul este par");
    }

    public static void main(String[] args) throws NuEsteParEception {
        numPar(12);
    }
}
