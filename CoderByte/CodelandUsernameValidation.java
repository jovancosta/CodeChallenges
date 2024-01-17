public class Main {
    public static void main(String[] args) {
        System.out.println(CodelandUsernameValidation("aa_"));  // Output: false
        System.out.println(CodelandUsernameValidation("u__hello_world123"));  // Output: true
    }

    public static String CodelandUsernameValidation(String str) {
        // Check if the length is between 4 and 25 characters.
        if (!(str.length() >= 4 && str.length() <= 25)) {
            return "false";
        }

        // Check if it starts with a letter.
        if (!Character.isLetter(str.charAt(0))) {
            return "false";
        }

        // Check if it contains only letters, numbers, and underscores.
        if (!str.matches("^[a-zA-Z0-9_]+$")) {
            return "false";
        }

        // Check if it doesn't end with an underscore.
        if (str.endsWith("_")) {
            return "false";
        }

        return "true";
    }
}
