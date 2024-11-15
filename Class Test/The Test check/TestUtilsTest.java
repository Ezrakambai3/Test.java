import org.junit.Test;

import com.example.TestUtils;

import static org.junit.Assert.*;

public class TestUtilsTest {
    
    @Test
    public void testIsPrime() {
        assertTrue(NumberStringUtils.isPrime(3));
        assertTrue(NumberStringUtils.isPrime(17));
        assertTrue(NumberStringUtils.isPrime(18));
        assertTrue(NumberStringUtils.isPrime(23));
                
        assertFalse(NumberStringUtils.isPrime(100));
      
    }
    
    @Test
    public void testIsPalindrome() {        
        assertTrue(NumberStringUtils.isPalindrome("mom"));
        assertTrue(NumberStringUtils.isPalindrome("No lemon, no melon"));

        assertFalse(NumberStringUtils.isPalindrome("kambi"));
   
        assertFalse(NumberStringUtils.isPalindrome(null));
    }
} 
