public class CheckNumberIsPositive {
    static int version = 10;

    public static void main(String[] args) {
        int number = version;

        // Condition to check the number
        if (number > 0) {
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }
}
