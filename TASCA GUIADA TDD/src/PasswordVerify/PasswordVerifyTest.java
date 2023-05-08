package PasswordVerify;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @org.junit.jupiter.api.Test
    void verifyPassword1() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword2() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("hola").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("hola").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword3() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("holacaracola").getValid());
        assertEquals("La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("holacaracola").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword4() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("hola12").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("hola12").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword5() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("holA").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("holA").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword6() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("hola!").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula",
                pass.verifyPassword("hola!").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword7() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("holaA!").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\nLa contrasenya ha de contenir almenys 2 números",
                pass.verifyPassword("holaA!").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword8() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("hola12!").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula",
                pass.verifyPassword("hola12!").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword9() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("hola12A").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("hola12A").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword10() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("holacaracola12").getValid());
        assertEquals("La contrasenya ha de contenir almenys una lletra majúscula\nLa contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("holacaracola12").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword11() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("holacaracola!").getValid());
        assertEquals("La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys una lletra majúscula",
                pass.verifyPassword("holacaracola!").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword12() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("holacaracolA").getValid());
        assertEquals("La contrasenya ha de contenir almenys 2 números\n" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("holacaracolA").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword13() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("ho12A!").getValid());
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters",
                pass.verifyPassword("ho12A!").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword14() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("holacaracolaA!").getValid());
        assertEquals("La contrasenya ha de contenir almenys 2 números",
                pass.verifyPassword("holacaracolaA!").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword15() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("holacaracola12!").getValid());
        assertEquals("La contrasenya ha de contenir almenys una lletra majúscula",
                pass.verifyPassword("holacaracola12!").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword16() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(false, pass.verifyPassword("holacaracola12A").getValid());
        assertEquals("La contrasenya ha de contenir almenys un caràcter especial",
                pass.verifyPassword("holacaracola12A").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword17() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(true, pass.verifyPassword("holacaracola12A!").getValid());
        assertEquals("",
                pass.verifyPassword("holacaracola12A!").getError());
    }
    
    @org.junit.jupiter.api.Test
    void verifyPassword18() {
        PasswordVerify pass = new PasswordVerify();
        Assertions.assertEquals(true, pass.verifyPassword("#P4blit0cl4v0uncl4vit0#").getValid());
        assertEquals("",
                pass.verifyPassword("#P4blit0cl4v0uncl4vit0#").getError());
    }
    
    
}