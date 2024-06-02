package Technical;

public class TransformStringTo1234SoOnStrings {

    //input: String str = "ramreddyhyderabadBangalore";
    //output: r am red ddyh ydera badBang alore

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        String str = "ramreddyhyderabadBangalore";
        transform(str, 0, 1);
        System.out.println(sb.toString());
    }

    //O(n) time complexity
    public static void transform(String str, int start, int counter)
    {
        if(start + counter <= str.length())
        {
            sb.append(str, start, start + counter);
            sb.append(" ");
            transform(str, start + counter, counter +1);
        } else {
            sb.append(str.substring(start));
        }
    }
    
    //substring has the time complexity of O(n) which is called n times in the worst case
    //So, the time complexity of this code is O(n^2)
    public static void transform(String str, int counter)
    {
        if (str.length() > counter) {
            sb.append(str.substring(0, counter) + " ");
            counter++;
            transform(str.substring(counter-1), counter);
        } else {
            sb.append(str);
        }
    }
    
}
