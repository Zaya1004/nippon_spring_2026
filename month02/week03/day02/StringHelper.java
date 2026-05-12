package month02.week03.day02;

public class StringHelper {
    static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    static boolean isPalindrome(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed.equals(text);
    }

    static void countChar(String word1, char letter) {

        int count = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println(letter + "=" + count);

    }

    static String repeat(String s, int times){
        String result = "";
        for (int i = 0; i < times; i++){
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("hello"));
        countChar("mississippi", 's');
        System.out.println(repeat("ha", 4));
    }

}
