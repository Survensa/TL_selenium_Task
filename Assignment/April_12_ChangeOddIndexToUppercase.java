public class April_12_ChangeOddIndexToUppercase {
    public static void main(String[] args) {
        String test = "changeme";
        char[] characters = test.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (i % 2 != 0) {
                characters[i] = Character.toUpperCase(characters[i]);
            }
        }

        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }
    }
}
