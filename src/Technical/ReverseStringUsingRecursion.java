package Technical;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String str = "ramreddy";
        reverse(str);

        System.out.println("\n" + reverse2(str));
    }
    
    public static void reverse(String str)
    {
        if ((str == null) || (str.length() < 1))
            return;
        //    System.out.println(str);
        else {
            System.out.print(str.charAt(str.length() - 1));
            reverse(str.substring(0, str.length() - 1));
        }
    }
    
    public static String reverse2(String sentence) {
        if (sentence.isEmpty())
        return sentence;

        return reverse2(sentence.substring(1)) + sentence.charAt(0);
    }

}
