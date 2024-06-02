package Technical;

public class BinaryNumberToDigit {
    public static void main(String[] args) {
        String binaryNumber = "101010";
        int decimalNumber = Integer.parseInt(binaryNumber,2);

        System.out.println("binary : " + binaryNumber);
        System.out.println("decimal : " + decimalNumber);
        String binaryString = decimalToBinary(42);
        System.out.println(binaryString);
    }
    
    public static String decimalToBinary(int number) {
        StringBuilder binary = new StringBuilder();

        while (number > 0) {
            int reminder = number % 2;
            binary.insert(0, reminder);
            number = number / 2;
        }
        if (binary.length() == 0) {
            binary.append("0");
        }
        return binary.toString();
    }
}
