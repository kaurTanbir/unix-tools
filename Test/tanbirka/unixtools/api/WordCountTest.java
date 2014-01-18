package tanbirka.unixtools.api;

import org.junit.Test;
import tanbirka.unixtools.api.WordCount;

import static junit.framework.Assert.assertEquals;


public class WordCountTest {
    @Test
    public void testLineCount() throws Exception {
        WordCount count = new WordCount();
        int noOfLines = count.lineCount("hello\n how\n are\n you");
        assertEquals(4,noOfLines );
    }

    @Test
    public void testWordCount() throws Exception {
        WordCount count = new WordCount();
        int noOfWords = count.wordCount("hello how are you");
        assertEquals(4,noOfWords );
    }

    @Test
    public void testCharCount() throws Exception {
        WordCount count = new WordCount();
        int noOfCharacters = count.charCount("hello how are you");
        assertEquals(18, noOfCharacters);
    }
}
