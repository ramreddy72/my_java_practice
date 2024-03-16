package Technical;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        String str = "hello my ram world";
       str = str.replaceAll(" ", "");
        System.out.println(str);
    }
}
