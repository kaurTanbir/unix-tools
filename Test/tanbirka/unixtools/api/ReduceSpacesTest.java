package tanbirka.unixtools.api;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class ReduceSpacesTest {
    @Test
    public void testTrimSpace() throws Exception {
        String input = "aa    bbb     ccc";
        String expected = "aa bbb ccc";

        ReduceSpaces reducer = new ReduceSpaces();
        String reducedString =  reducer.trimSpace(input);

        assertEquals(expected,reducedString);

    }
    @Test
    public void testTrimSpaceWithNewLines() throws Exception {
        String input = "aa    bbb     cc\n  c  sss c";
        String expected = "aa bbb cc\n c sss c";

        ReduceSpaces reducer = new ReduceSpaces();
        String reducedString =  reducer.trimSpace(input);
        assertEquals(expected,reducedString);

    }
}
