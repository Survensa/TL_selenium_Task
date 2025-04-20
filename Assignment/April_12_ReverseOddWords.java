public class ReverseOddWords {
    public static void main(String[] args) {
        String test = "I am a software tester";
        String[] words = test.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                System.out.print(words[i] + " ");
            } else {
                char[] wordChars = words[i].toCharArray();
                for (int j = wordChars.length - 1; j >= 0; j--) {
                    System.out.print(wordChars[j]);
                }
                System.out.print(" ");
            }
        }
    }
}
