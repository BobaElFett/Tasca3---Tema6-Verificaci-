package PasswordVerify;

public class PasswordVerify {
    
    public static boolean verifyPassword(String contrasena) {
        // 8 caracteres
        // 2 numeros
        
        if (password.length() >= 8) {
            int contadornum = 0;
            int capSignos = 0;
            int capCount = 0;
            for (int i = 0; i < contrasena.length(); i++) {
                if (Character.isDigit(contrasena.charAt(i))) {
                    contadornum++;
                } else if (((contrasena.charAt(i) > 32 && contrasena.charAt(i) < 48) || (contrasena.charAt(i) > 63 && contrasena.charAt(i) < 65)) {
                    capSignos++;
                } else if ((contrasena.charAt(i) > 64 && contrasena.charAt(i) < 91)) {
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
