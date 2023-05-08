package PasswordVerify;

public class PasswordVerify {
    
    public static boolean verifyPassword(String contrasena) {
        // 8 caracteres
        // 2 numeros
        int contadornum = 0;
        int capSignos = 0;
        int capCount = 0;
        if (contrasena.length() >= 8) {
            for (int i = 0; i < contrasena.length(); i++) {
                if (Character.isDigit(contrasena.charAt(i))) {
                    contadornum++;
                } else if (((contrasena.charAt(i) > 32 && contrasena.charAt(i) < 48) || (contrasena.charAt(i) == 64))) {
                    capSignos++;
                } else if ((contrasena.charAt(i) > 64 && contrasena.charAt(i) < 91)) {
                    capCount++;
                }
            }
        }
    
        return contadornum >= 2 && capSignos >= 1 && capCount >= 1;
    }
}
