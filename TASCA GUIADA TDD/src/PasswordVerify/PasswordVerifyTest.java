package PasswordVerify;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {
    @org.junit.jupiter.api.Test
    void verifyPassword() {
        assertEquals(0, PasswordVerify.verifyPassword(""));
    }

}