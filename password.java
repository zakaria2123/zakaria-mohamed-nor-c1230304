import java.util.Scanner;

public class password {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            boolean lengthValid = isLengthValid(password);

            boolean hasUppercase = hasUppercase(password);
            boolean hasLowercase = hasLowercase(password);

            boolean hasDigit = hasDigit(password);
            boolean hasSpecialChar = hasSpecialChar(password);

            if (lengthValid && hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
                System.out.println("Password is strong.");
            } else {
                System.out.println("Password is weak. Please ensure it meets all the following conditions:");
                if (!lengthValid) System.out.println(" At least 8 characters long");


                if (!hasUppercase) System.out.println(" at least one uppercase letter");
                if (!hasLowercase) System.out.println(" at least one lowercase letter");






                if (!hasDigit) System.out.println("at least one digit");
                if (!hasSpecialChar) System.out.println(" at least one special character");
            }

            scanner.close();
        }

        public static boolean isLengthValid(String password) {
            return password.length() >= 8;
        }

        public static boolean hasUppercase(String password) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    return true;
                }
            }
            return false;
        }

        public static boolean hasLowercase(String password) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    return true;
                }
            }
            return false;
        }

        public static boolean hasDigit(String password) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    return true;
                }
            }
            return false;
        }

        public static boolean hasSpecialChar(String password) {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return true;
                }
            }
            return false;
        }
    }

