import java.util.Scanner;

public class polindrom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a palindrome string: ");
        String str = input.nextLine();

        int length = str.length();
        boolean stringisPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            char startChar = str.charAt(i);
            char endChar = str.charAt(length - 1 - i);

            if (startChar != endChar) {
                 stringisPalindrome = false;
                break;
            }
        }
        if (stringisPalindrome) {
            System.out.println(" string is a palindrome.");
        } else {
            System.out.println(" string is NOT a palindrome.");
        }
    }
}
