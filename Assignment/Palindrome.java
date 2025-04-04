public class PalindromeChecker {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number to check Palindrome :");
            return;
        }

        int input = Integer.parseInt(args[0]);
        int output = 0;
        int temp = input;

        for (int i = input; i > 0; i /= 10) {
            int rem = i % 10;
            output = output * 10 + rem;
        }

        if (temp == output) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}
