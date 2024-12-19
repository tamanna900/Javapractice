
class Adder {
    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }
    // Method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static double add(double a,double b,double c){return a + b + c;}
}
public class methodoverload {
    public static void main(String[] args) {

        System.out.println(Adder.add(11, 11)); // Output: 22



        System.out.println(Adder.add(11, 11, 11)); // Output: 33
        System.out.println(Adder.add(11.4,45.3,21));
    }
}

