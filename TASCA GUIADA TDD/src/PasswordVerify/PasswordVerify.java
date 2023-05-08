package PasswordVerify;

public class PasswordVerify {
    
    public static boolean verifyPassword(String password) {
        // 8 caracteres
        // 2 numeros
        
        if (password.length() >= 8) {
            int contadornum = 0;
            int capSignos = 0;
            int capCount = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    contadornum++;
                } else if (((Password.charAt(i) > 32 && Password.charAt(i) < 48) || (Password.charAt(i) > 63 && Password.charAt(i) < 65)) {
                    capSignos++;
                } else if ((Password.charAt(i) > 64 && Password.charAt(i) < 91)) {
                    capCount++;
                }
            }
        }
        
        if (contadornum >= 2 && capSignos >= 1 && capCount >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
