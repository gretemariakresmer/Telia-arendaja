import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexaStringTest {

    @Test
    void decodeHexaString() {
        HexaString hexaString = new HexaString();
        String s = "FC6BB3D6F030";
        s = hexaString.decodeHexaString(s);
        assertEquals("Omniva", s);
    }

    @Test
    void testReverse() {
        HexaString hexaString = new HexaString();
        String s = "987654321";
        s = hexaString.reverse(s);
        assertEquals("123456789", s);
    }
    @Test
    void testHexToBinary() {
        HexaString hexaString = new HexaString();
        String s = "FC6BB3D6F030";
        s = hexaString.reverse(s);
        s = hexaString.hexToBinary(s);
        assertEquals("110000111101101101001110111011011011001111", s);
    }
}