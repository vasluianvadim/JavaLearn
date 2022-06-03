package TestareJunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AdunareTest {
    @Test
    void doiPlusTreiEgalCinci(){
        Adunare adunare=new Adunare();
        assertEquals(5,adunare.adunare(2,3));
    }
    @Test
    void treiPlusTreiEgalSase(){
        Adunare adunare=new Adunare();
        assertEquals(6,adunare.adunare(3,3));
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, -3, 15, Integer.MAX_VALUE})
    void metoda(int num){
        assertEquals(2,num );
    }
}