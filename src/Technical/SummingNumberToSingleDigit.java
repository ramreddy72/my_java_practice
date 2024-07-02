package Technical;


public class SummingNumberToSingleDigit {
    public static void main(String[] args) {
        System.out.println(summing(5431));
    }

    public static int summing(int num) {
        int sum = String.valueOf(num)
                        .chars()
                        .map(Character::getNumericValue)
                        .reduce((a, b) -> a + b)
                        .getAsInt();

        if (sum < 10) {
            return sum;
        } else {
            return summing(sum);
        }
    }
}
