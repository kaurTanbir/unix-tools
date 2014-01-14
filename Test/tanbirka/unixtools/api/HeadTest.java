package tanbirka.unixtools.api;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class HeadTest {
    @Test
    public void testGetLines() throws Exception {
        Head ob = new Head();
        String input = "Kunal is\ngreat\nxtsf";
        String expected = "Kunal is\ngreat\n";

        String result = ob.getLines(input,2);

        assertEquals(expected, result);
    }

    @Test
    public void testGetLinesFor5Lines() throws Exception {
        Head ob = new Head();
        String expected = "Kunal\nis\ngreat\nrea\ndsc\n";

        String actual = ob.getLines("Kunal\nis\ngreat\nrea\ndsc\niuedsdcjis",5);

        assertEquals(expected, actual);
    }
    @Test
    public void testGetFirst10Lines() throws Exception {
        String data = "Kunal\nis\ngreat\nrea\ndsq\nswq\nswqswq\nswq\nswq\ndqwqwd\ndqwdw\nkjwkdq\nooo";
        String expected = "Kunal\nis\ngreat\nrea\ndsq\nswq\nswqswq\nswq\nswq\ndqwqwd\n";
        Head ob = new Head();

        String actual = ob.getLines(data);

        assertEquals(expected, actual);
    }
}
