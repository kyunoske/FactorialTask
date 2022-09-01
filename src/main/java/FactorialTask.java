public class FactorialTask {

    public static void main(String[] args) {
        int number = 5;

        System.out.println("Factorial of " + number + " will be " + factorialFor(number));
    }
    public static long factorialFor(int number) {
        int factorial = 1;
        for (int i = 2; i < number; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }

}
