package TestareJunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumPareTest {


    @Test
    void metoda1() {
        NumPare numPare = new NumPare();
assertEquals("par",numPare.parSauImpar(4));

    }
    @Test
    void metoda2() {
        NumPare numPare = new NumPare();
        assertEquals("impar",numPare.parSauImpar(3));

    }
}