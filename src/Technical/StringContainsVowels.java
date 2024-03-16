package Technical;

public class StringContainsVowels {
    public static void main(String[] args) {
        String str = "ramreddy";
        System.out.println(containsVowels(str));
    }
    
    public static boolean containsVowels(String str)
    {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
    
}
