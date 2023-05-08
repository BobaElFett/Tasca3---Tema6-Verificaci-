package PasswordVerify;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @org.junit.jupiter.api.Test
    void verifyPassword1() {
        PasswordVerify pass = new PasswordVerify();
        assertEquals(false, pass.verifyPassword("").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("").getError());
    }
    @org.junit.jupiter.api.Test
    void verifyPassword2() {
        PasswordVerify pass = new PasswordVerify();
        assertEquals(false, pass.verifyPassword("hola").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("hola").getError());
    }


}