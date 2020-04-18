import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void encryptCharacter_returnEncryptedCharacter_a() {
        CaesarCipher testCaesarCipher = new CaesarCipher();
        Character expected ='d';
        assertEquals(expected,testCaesarCipher.encryptCharacter('a'));
    }
}