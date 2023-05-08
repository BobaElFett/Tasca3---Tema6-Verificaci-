package PasswordVerify;

public class PasswordVerify {
    public static void main(String[] args) {

    }

    public static boolean verifyPassword(String password) {
        // 8 caracteres
        // 2 numeros

        if (password.length() >= 8) {
            int contador = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    contador++;
                }
            }

            if (contador >= 2) {
                return true;
            }
        } else {

        }

        return false;
    }
}
