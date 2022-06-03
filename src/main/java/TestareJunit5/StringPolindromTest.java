package TestareJunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static TestareJunit5.StringPolindrom.strPolindr;
import static org.junit.jupiter.api.Assertions.*;

class StringPolindromTest {
    @Test
    void VerificaStringPolindrom() {
        StringPolindrom stringPolindrom = new StringPolindrom();
        assertEquals("Este polindrom", strPolindr("mom"));
    }

    @Test
    void VerificaStringPolindrom1() {
        StringPolindrom stringPolindrom = new StringPolindrom();
        assertEquals("Nu este Polindrom", strPolindr("man"));
    }

    @Test
    void VerificaStringPolindrom2() {
        StringPolindrom stringPolindrom = new StringPolindrom();
        assertEquals("Este polindrom", strPolindr("mam"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"man", "mom","dad","cat","edfwef"})
    void VerificaStringPolindrom3(String str) {
        assertTrue(strPolindr(str),"nu este polindrom");

    }


}