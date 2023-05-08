package PasswordVerify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @org.junit.jupiter.api.Test
    void verifyPassword1() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("hola").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters", pass.verifyPassword("hola").getError());
    }
}