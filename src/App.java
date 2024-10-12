
// import package

public class App {
    public static void main(String[] args) throws Exception {
        func3();
    }

    public static void func1() {
        System.out.println("Function1");
    }

    public static void func2() {
        func1();
        System.out.println("Function2");
    }

    public static void func3() {
        func2();
        System.out.println("Function3");
    }
}
