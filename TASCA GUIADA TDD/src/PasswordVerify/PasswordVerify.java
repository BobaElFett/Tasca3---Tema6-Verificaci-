package PasswordVerify;

public class PasswordVerify {
    
    public PasswordVerify() {
    }
    
    public Password verifyPassword(String contrasena) {

        Password pass = new Password();

        int contadornum = 0, capSignos = 0, capCount = 0;
        if (contrasena.length() < 8) {
            pass.actualizarError("La contrasenya ha de tenir almenys 8 caràcters");
        }

        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isDigit(contrasena.charAt(i))) {
                contadornum++;
            } else if (((contrasena.charAt(i) > 32 && contrasena.charAt(i) < 48) || (contrasena.charAt(i) == 64))) {
                capSignos++;
            } else if ((contrasena.charAt(i) > 64 && contrasena.charAt(i) < 91)) {
                capCount++;
            }
        }

        if (contadornum < 2) {
            pass.actualizarError("La contrasenya ha de contenir almenys 2 números");
        }

        if (capCount < 1) {
            pass.actualizarError("La contrasenya ha de contenir almenys una lletra majúscula");
        }

        if (capSignos < 1) {
            pass.actualizarError("La contrasenya ha de contenir almenys un caràcter especial");
        }

        if (pass.getError().equals("")) {
            pass.setValid(true);
        }

        return pass;
    }
}