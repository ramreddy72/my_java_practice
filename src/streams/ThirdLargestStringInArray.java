package streams;


public class ThirdLargestStringInArray {
    public static void main(String[] args) {
        // List<String> arr = Arrays.asList("ram", "reddyfds", "swecha", "mani", "charanyareddy");
        // arr.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).skip(2).forEach(System.out::println);
   
        String[] arr = { "ram", "reddy", "swecha", "mani", "charanyareddy" };

        String first = "", second = "", third = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > first.length()) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i].length() > second.length()) {
                third = second;
                second = arr[i];
            } else if (arr[i].length() > third.length()) {
                third = arr[i];
            }
        }
        System.out.println(third);
    }
}
