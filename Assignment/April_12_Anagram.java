import java.util.Arrays;

public class April_12_Anagram {
    public static void main(String[] args) {
        String text1 = "stops";
        String text2 = "potss";

        if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
            return;
        }

        char[] array1 = text1.toCharArray();
        char[] array2 = text2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }
    }
}
