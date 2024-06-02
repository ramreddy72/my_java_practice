package Technical;

public class GenericsExample {
    
    public static <T, U, V> void displayType(T t, U u, V v) {
        System.out.println("Type of first parameter : " + t.getClass().getName());
        System.out.println("Type of second parameter : " + u.getClass().getName());
        System.out.println("Type of third parameter : " + v.getClass().getName());
        System.out.println(t.getClass().getSimpleName() +" and "+ t.getClass().getCanonicalName());
    }

    public static void main(String[] args) {
        String str = "ram";
        Integer num = 72;
        Double dub = 68.0;
        displayType(str, num, dub);
    }
}
