package Technical;

import java.util.Random;

public class PrintRandomNumUsingForEach {
    public static void main(String[] args) {
        Random random = new Random();

        random.ints().limit(10).forEach(System.out::println);

    }
}
