import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherEncryptTest {
    @Test
    public void encryptData_whenEncrypted_true() {
        CaesarCipher testEncryption=new CaesarCipher("encrypt", 4);
        assertEquals(true,testEncryption instanceof CaesarCipher);
    }
}