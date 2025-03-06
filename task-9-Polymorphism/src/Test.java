public class Test {
    // static variable
    static int a = 10;
    static int b = 20;
    static int r;

    static void testMethod() {
        System.out.println("This is static method ..");
        a = 20;
        r = a + b;
    }

    static {
        System.out.println("This is static block ..");
        r = a + b;
        System.out.println("The sum in static block ===> " + a + " + " + b + " = " + r);
    }
}
