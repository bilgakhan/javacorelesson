public class PassCheck {
    public static void main(String[] args) {
        String pass = "asdfg%123"; // Parolni o'zgartiring kerak bo'lsa
        boolean strong = checkPass(pass);

        if (strong) {
            System.out.println("Parol haqiqiy");
        } else {
            System.out.println("Parol noto'g'ri");
        }
    }

    public static boolean checkPass(String pass) {
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;
        boolean isSpecialCharacter = false;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);

            if (Character.isUpperCase(ch)) {
                isUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                isLowerCase = true;
            } else if (Character.isDigit(ch)) {
                isDigit = true;
            } else if (isSpecialCharacter(ch)) {
                isSpecialCharacter = true;
            }
        }

        return isLowerCase && isUpperCase && isDigit && isSpecialCharacter;
    }

    public static boolean isSpecialCharacter(char ch) {
        // Maxsus belgilar ro'yxati
        String specialCharacters = "@#$%&*";

        return specialCharacters.contains(String.valueOf(ch));
    }
}