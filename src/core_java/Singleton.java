package core_java;

public class Singleton {

    // private static Singleton instance = null;

    // private Singleton() {    }

    // public static Singleton getInstance() {
    //     if (instance == null) {
    //         instance = new Singleton();
    //     }
    //     return instance;
    // }

    private static class LoadSingleton {
        static final Singleton instance = new Singleton();
    }

    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return LoadSingleton.instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton");
    }

    public static void main(String[] args) {
        Singleton sg = Singleton.getInstance();
        sg.showMessage();
    }
}
