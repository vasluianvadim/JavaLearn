package TestareJunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumPareTest1 {
    @Test
    void test() {
        NumPare numPare = new NumPare();
        assertEquals(numPare.NumePareTest1(4), true);
    }

    @Test
    void test1() {
        NumPare numPare1 = new NumPare();
        assertEquals(numPare1.NumePareTest1(4), false);
    }

    @Test
    void test2() {
        NumPare numPare2 = new NumPare();
        assertEquals(numPare2.NumePareTest1(3), false);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})//de ce Integermax
    void test3(int num) {
        NumPare numPare2 = new NumPare();
        assertEquals(numPare2.NumePareTest1(num), true);
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})

    void test4(int num) {
        NumPare numPare1 = new NumPare();
       assertEquals(numPare1.parSauImpar(num),"par");
    }

}