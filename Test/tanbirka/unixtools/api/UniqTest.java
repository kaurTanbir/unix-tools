package tanbirka.unixtools.api;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UniqTest {
    @Test
    public void getUniueLinesWhenLast2LinesAreSame(){
        String input = "aaa\naaa\nbbb\nccc\nccc";
        String expected = "aaa\nbbb\nccc";

        Uniq uniq = new Uniq();

        String uniqLines = uniq.getUniqLines(input);
        assertEquals(expected, uniqLines);
    }
    @Test
    public void getUniueLinesWhenLast2LinesAreNotSame(){
        String input = "aaa\naaa\nbbb\nccc\nccc\nddd";
        String expected = "aaa\nbbb\nccc\nddd";

        Uniq uniq = new Uniq();

        String uniqLines = uniq.getUniqLines(input);
        assertEquals(expected, uniqLines);
    }
    @Test
    public void getUniueLinesWhenLastLineIsEmpty(){
        String input = "aaa\naaa\nbbb\nccc\nccc\n";
        String expected = "aaa\nbbb\nccc";

        Uniq uniq = new Uniq();

        String uniqLines = uniq.getUniqLines(input);
        assertEquals(expected, uniqLines);
    }
}
