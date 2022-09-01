public class FactorialTask {

    public static void main(String[] args) {
        int number = 10;

        System.out.println("For loop - factorial of " + number + " will be " + factorialFor(number));
        System.out.println("While loop - factorial of " + number + " will be " + factorialWhile(number));
    }
    public static long factorialFor(int number) {
        int factorial = 1;
        for (int i = 1; i < number; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }

    public static long factorialWhile(int number) {
        int factorial = 1;
        int i = 1;
        while (i < number) {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }

}
