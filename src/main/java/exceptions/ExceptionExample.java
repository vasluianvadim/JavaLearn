package exceptions;

import ChromeUI_Tests.MyPersonalException;

public class ExceptionExample {

    public static void main(String[] args) throws MyPersonalException {


        afisareElementPar(5);


    }


    public static void afisareElementPar(int numarPar) throws MyPersonalException {
        if (numarPar % 2 == 0) {
            System.out.println(numarPar);
        } else {
            throw new MyPersonalException("numarul este impar");
        }

    }
}
