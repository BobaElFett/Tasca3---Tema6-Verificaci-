package PasswordVerify;

public class Password {
    private String contrasena;
    private String error;
    private Boolean valid;

    public Password(String contrasena) {
        this.contrasena = contrasena;
        this.error = "";
        this.valid = false;
    }

    public void actualizarError(String errorNou) {
        if (this.error.equals("")) {
            this.error = errorNou;
        } else {
            this.error += "\n" + errorNou;
        }
    }

    public String getError() {
        return this.error;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
    
    public boolean getValid() {
        return this.valid;
    }

    @Override
    public String toString() {
        return "Password{" +
                "error='" + error + '\'' +
                ", valid=" + valid +
                '}';
    }
}
