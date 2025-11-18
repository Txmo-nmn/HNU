package Tut3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeradeZahlTest {

    @Test
    public void geradeZahlTest(){
        boolean v1 = GeradeZahl.istZahlGerade(3);
        assertFalse(v1);
    }
}