
import java.util.HashMap;

public class HexaString {
    /**
     * Decode hexastring to readable string value
     * @param code to decode
     * @return decoded value
     */
    public String decodeHexaString(String code) {
        if (code.isBlank()) {
            return null;
        }
        HashMap<String, String> binary2Characters = bin2CharacterHashMap();
        String reversedCode = reverse(code);
        String binaryString = hexToBinary(reversedCode);

        StringBuilder decodedStringReversed = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i += 7) {
            String binaryCode = binaryString.substring(i, Math.min(i + 7, binaryString.length()));
            decodedStringReversed.append(binary2Characters.get(binaryCode));
        }
        return reverse(decodedStringReversed.toString());
    }

    /**
     * Decodes hexastring to binary numbers
     * @param hexaString to decode
     * @return string in binary format
     */
    public String hexToBinary(String hexaString) {
        StringBuilder binaryString = new StringBuilder();
        for (int i = 0; i < hexaString.length(); i++) {
            int decimal = Integer.parseInt(hexaString.substring(i, i + 1), 16);
            String binary = String.format("%4s", Integer.toBinaryString(decimal)).replace(' ', '0');
            binaryString.append(binary);
        }
        //remove leading zeros
        return binaryString.toString().replaceFirst("0+", "");
    }
    public String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i --) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }
    public static HashMap<String, String> bin2CharacterHashMap() {
        HashMap<String, String> smsAlphabet = new HashMap<String, String>();
        smsAlphabet.put("0000000", "@");
        smsAlphabet.put("0000001", "£");
        smsAlphabet.put("0000010", "$");
        smsAlphabet.put("0000011", "¥");
        smsAlphabet.put("0000100", "è");
        smsAlphabet.put("0000101", "é");
        smsAlphabet.put("0000110", "ù");
        smsAlphabet.put("0000111", "ì");
        smsAlphabet.put("0001000", "ò");
        smsAlphabet.put("0001001", "Ç");
        smsAlphabet.put("0001010", "LF");
        smsAlphabet.put("0001011", "Ø");
        smsAlphabet.put("0001100", "ø");
        smsAlphabet.put("0001101", "CR");
        smsAlphabet.put("0001110", "Å");
        smsAlphabet.put("0001111", "å");
        smsAlphabet.put("0010000", "∆");
        smsAlphabet.put("0010001", "_");
        smsAlphabet.put("0010010", "Φ");
        smsAlphabet.put("0010011", "£");
        smsAlphabet.put("0010100", "$");
        smsAlphabet.put("0010101", "¥");
        smsAlphabet.put("0010110", "è");
        smsAlphabet.put("0010111", "Ψ");
        smsAlphabet.put("0011000", "Σ");
        smsAlphabet.put("0011001", "Θ");
        smsAlphabet.put("0011010", "Ξ");
        smsAlphabet.put("0011011", " ");
        smsAlphabet.put("0011100", "Æ");
        smsAlphabet.put("0011101", "æ");
        smsAlphabet.put("0011110", "ß");
        smsAlphabet.put("0011111", "É");
        smsAlphabet.put("0100000", " ");
        smsAlphabet.put("0100001", "!");
        smsAlphabet.put("0100010", "\"");
        smsAlphabet.put("0100011", "#");
        smsAlphabet.put("0100100", "¤");
        smsAlphabet.put("0100101", "%");
        smsAlphabet.put("0100110", "&");
        smsAlphabet.put("0100111", "'");
        smsAlphabet.put("0101000", "(");
        smsAlphabet.put("0101001", ")");
        smsAlphabet.put("0101010", "*");
        smsAlphabet.put("0101011", "+");
        smsAlphabet.put("0101100", ",");
        smsAlphabet.put("0101101", "-");
        smsAlphabet.put("0101110", ".");
        smsAlphabet.put("0101111", "/");
        smsAlphabet.put("0110000", "0");
        smsAlphabet.put("0110001", "1");
        smsAlphabet.put("0110010", "2");
        smsAlphabet.put("0110011", "3");
        smsAlphabet.put("0110100", "4");
        smsAlphabet.put("0110101", "5");
        smsAlphabet.put("0110110", "6");
        smsAlphabet.put("0110111", "7");
        smsAlphabet.put("0111000", "8");
        smsAlphabet.put("0111001", "9");
        smsAlphabet.put("0111010", ":");
        smsAlphabet.put("0111011", ";");
        smsAlphabet.put("0111100", "<");
        smsAlphabet.put("0111101", "=");
        smsAlphabet.put("0111110", ">");
        smsAlphabet.put("0111111", "?");
        smsAlphabet.put("1000000", "¡");
        smsAlphabet.put("1000001", "A");
        smsAlphabet.put("1000010", "B");
        smsAlphabet.put("1000011", "C");
        smsAlphabet.put("1000100", "D");
        smsAlphabet.put("1000101", "E");
        smsAlphabet.put("1000110", "F");
        smsAlphabet.put("1000111", "G");
        smsAlphabet.put("1001000", "H");
        smsAlphabet.put("1001001", "I");
        smsAlphabet.put("1001010", "J");
        smsAlphabet.put("1001011", "K");
        smsAlphabet.put("1001100", "L");
        smsAlphabet.put("1001101", "M");
        smsAlphabet.put("1001110", "N");
        smsAlphabet.put("1001111", "O");
        smsAlphabet.put("1010000", "P");
        smsAlphabet.put("1010001", "Q");
        smsAlphabet.put("1010010", "R");
        smsAlphabet.put("1010011", "S");
        smsAlphabet.put("1010100", "T");
        smsAlphabet.put("1010101", "U");
        smsAlphabet.put("1010110", "V");
        smsAlphabet.put("1010111", "W");
        smsAlphabet.put("1011000", "X");
        smsAlphabet.put("1011001", "Y");
        smsAlphabet.put("1011010", "Z");
        smsAlphabet.put("1011011", "Ä");
        smsAlphabet.put("1011100", "Ö");
        smsAlphabet.put("1011101", "Ñ");
        smsAlphabet.put("1011110", "Ü");
        smsAlphabet.put("1011111", "§");
        smsAlphabet.put("1100000", "¿");
        smsAlphabet.put("1100001", "a");
        smsAlphabet.put("1100010", "b");
        smsAlphabet.put("1100011", "c");
        smsAlphabet.put("1100100", "d");
        smsAlphabet.put("1100101", "e");
        smsAlphabet.put("1100110", "f");
        smsAlphabet.put("1100111", "g");
        smsAlphabet.put("1101000", "h");
        smsAlphabet.put("1101001", "i");
        smsAlphabet.put("1101010", "j");
        smsAlphabet.put("1101011", "k");
        smsAlphabet.put("1101100", "l");
        smsAlphabet.put("1101101", "m");
        smsAlphabet.put("1101110", "n");
        smsAlphabet.put("1101111", "o");
        smsAlphabet.put("1110000", "p");
        smsAlphabet.put("1110001", "q");
        smsAlphabet.put("1110010", "r");
        smsAlphabet.put("1110011", "s");
        smsAlphabet.put("1110100", "t");
        smsAlphabet.put("1110101", "u");
        smsAlphabet.put("1110110", "v");
        smsAlphabet.put("1110111", "w");
        smsAlphabet.put("1111000", "x");
        smsAlphabet.put("1111001", "y");
        smsAlphabet.put("1111010", "z");
        smsAlphabet.put("1111011", "ä");
        smsAlphabet.put("1111100", "ö");
        smsAlphabet.put("1111101", "ñ");
        smsAlphabet.put("1111110", "ü");
        smsAlphabet.put("1111111", "à");

        return smsAlphabet;
    }
}
