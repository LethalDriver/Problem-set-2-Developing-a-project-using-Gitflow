public class Calculator {
    public static int Add(int a, int b){
        return a + b;
    }
    public static int Subtract(int a, int b) {
        return a - b;
    }
    public static int Multiply(int a, int b) {
        return a * b;
    }
    public static double Divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Can't divide by zero.");
        }
        return (double) a / b;
    }
}
