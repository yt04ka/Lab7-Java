import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexManagerTest {

    @Test
    public void testEmptyCase(){
        RegexManager regexManager = new RegexManager();
        System.out.println(regexManager.deleteWordsWithMoreVowels(""));
        assertEquals(" ",regexManager.deleteWordsWithMoreVowels(""));
    }

    @Test
    public void testRegularCase(){
        RegexManager regexManager = new RegexManager();
        assertEquals("Hello, world, like this do ",regexManager.deleteWordsWithMoreVowels("Hello, world, I like this api, do you?"));
    }

}
