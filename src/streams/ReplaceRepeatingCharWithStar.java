package streams;

public class ReplaceRepeatingCharWithStar {
    public static void main(String[] args) {
        String str = "ram reddy";

        String finalStr =  str.chars().mapToObj(c -> (char)c).collect(StringBuilder::new, (sb, s) -> {
           if(sb.indexOf(s.toString()) < 0){
              sb.append(s);
           }else{
              sb.append("*");
           }
        }, StringBuilder::append).toString();

        System.out.println(finalStr);
    }
}
