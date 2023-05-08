package PasswordVerify;

public class Password {
    private String error;
    private Boolean valid;

    public Password() {
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
}
