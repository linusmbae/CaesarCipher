import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherDecryptionTest {
    @Test
    public void decryptData_instantiatesCorrectly_true() {
        CaesarCipher testCaesarCipher = new CaesarCipher("irgvctx",4);
        assertEquals(true, testCaesarCipher instanceof CaesarCipher);
    }
}