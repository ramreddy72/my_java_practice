package Technical;

public class Test {
    public static void main(String[] args) {
        // foo(null);
        String s1 = "abc";
String s2 = new String("abc");
System.out.println(s2.intern());
System.out.println(s1.intern());
System.out.println(s1 == s2);
	}
	public static void foo(Object o) {
		System.out.println("Object argument");
	}

    public static void foo(String s) {
        System.out.println("String argument");
    }
//     public static void foo(StringBuffer i){
// 	System.out.println("StringBuffer impl");
// }
}
