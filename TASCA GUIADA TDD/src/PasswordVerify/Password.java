package PasswordVerify;

public class Password {
    private String error;
    private Boolean valid;

    public Password(String error, Boolean valid) {
        this.error = error;
        this.valid = valid;
    }

    public void actualizarError(String errorNou) {
        this.error += "\n" + errorNou;
    }
}
