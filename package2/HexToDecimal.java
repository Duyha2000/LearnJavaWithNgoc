package package2;

class HexFormatException extends NumberFormatException {
    HexFormatException(String message) {
        super(message);
    }
}

public class HexToDecimal {
    public static void main(String[] args) {
        try {
            System.out.println(parseHex("N5")); // This should throw an exception
        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int parseHex(String hexString) throws HexFormatException {
        if (hexString == null || hexString.isEmpty()) {
            throw new HexFormatException("Input string is null or empty.");
        }

        // Check if the string is a valid hexadecimal
        for (int i = 0; i < hexString.length(); i++) {
            char ch = hexString.charAt(i);
            if (Character.digit(ch, 16) == -1) {
                throw new HexFormatException("Invalid hexadecimal string: " + hexString);
            }
        }
        return Integer.parseInt(hexString, 16);
    }

}