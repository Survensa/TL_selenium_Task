public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";
        String[] words = text.split(" ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = "";
                    count++;
                }
            }
        }

        if (count > 0) {
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals("")) {
                    System.out.print(words[i] + " ");
                }
            }
        }
    }
}
