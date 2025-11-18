package Tut3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RechnenTest {

    @Test
    public void addieren() {
        double v1 = Rechnen.addieren(1,2);
        assertEquals(3,v1);
    }

    @Test
    public void subtrahieren() {
        double v1 = Rechnen.subtrahieren(5,2);
        assertEquals(3,v1);
    }
}