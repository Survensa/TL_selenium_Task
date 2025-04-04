public class FibonacciSeries {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the range as a command-line argument.");
            return;
        }

        int range = Integer.parseInt(args[0]);

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print("Fibonacci Series up to " + range + ": " + firstNumber + ", " + secondNumber);

        for (int i = 2; i < range; i++) {
            int nextNumber = firstNumber + secondNumber;
            if (nextNumber > range) {
                break;
            }
            System.out.print(", " + nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
