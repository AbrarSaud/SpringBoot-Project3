import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, World!");
        Math m = new Math();
        System.out.println("This is Method 1 = " + m.sum(10, 20));
        System.out.println("This is Method 2 = " + m.sum(10, 20, 30));
        System.out.println("This is Method 3 = " + m.multiply(50, 4.5));
        System.out.println("This is Method 4 = " + m.sum(4.0, 50));

        // ----------
        System.out.println("\n \n");
        Animal animal = new Cat();
        System.out.println(animal.toString());
        A clasB = new B();
        clasB.print();
        A clasC = new C();
        clasC.print();
        // ------------------
        System.out.println("\n \n");
        Test.testMethod();
        System.out.println("The sum in Main ===> "+Test.a + " + " + Test.b + " = " + Test.r);


    }

    ///  # Method Overloading
    ///  # use Inheritance and Abstraction
    ///  # static Keyword :
    // 1.Blocks
    //2.Variables
    //3.Methods
    //4.Classes


    public void printName(A clasA) {
        System.out.println(
                clasA
        );
    }
}