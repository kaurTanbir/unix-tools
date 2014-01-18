package tanbirka.unixtools.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailTest {
    @Test
    public void testGetLines() throws Exception {
        String data = "Kunal\nis\ngreat\nI\n";
        String expected = "is\ngreat\nI\n";
        Tail ob = new Tail();

        String actual = ob.getLines(data,3);

        assertEquals(expected, actual);
    }
    @Test
    public void testGet10Lines() throws Exception {
        String data = "Kunal\nis\ngreat\nI\nam\na\nbig\nfan\nof\nhis\ni\nthink\ntooo";
        String expected = "I\nam\na\nbig\nfan\nof\nhis\ni\nthink\ntooo\n";
        Tail ob = new Tail();

        String actual = ob.getLines(data);

        assertEquals(expected, actual);
    }
}
