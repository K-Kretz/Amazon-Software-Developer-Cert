import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testStringUtils {


    @ParameterizedTest
    @CsvSource({
            "olleh,hello",
            "tset,test"
    })
    public void testReverseString(String word, String expectedWord){

        StringUtils stringUtilsObject = new StringUtils();
        String result = stringUtilsObject.reverseString(word);

        assertEquals(expectedWord,result);
    }
}
