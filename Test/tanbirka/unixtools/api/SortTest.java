package tanbirka.unixtools.api;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {
    @Test
    public void test_sorts_multiple_lines_with_single_field_in_accending_order(){
        String input = "ddd\naaa\nccc";
        String[] expected = {"aaa","ccc","ddd"};
        Sort sorter = new Sort(input);

        String[] actual = sorter.getSortedLines();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_sorts_multiple_lines_with_single_field_in_descending_order(){
        String input = "ddd\naaa\nccc";;
        String[] expected = {"ddd","ccc","aaa"};
        Sort sorter = new Sort(input);

        String[] actual = sorter.getReverseSortedLines();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_sorts_multiple_lines_with_single_field_numerically(){
        String input = "2\n1\n3";
        String[] expected = {"1","2","3"};
        Sort sorter = new Sort(input);

        String[] actual = sorter.sortNumerically();

        assertArrayEquals(expected, actual);
    }


}
