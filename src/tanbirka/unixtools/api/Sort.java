package tanbirka.unixtools.api;

 import java.util.Arrays;
 import java.util.Collections;

public class Sort {

        String text;

        public Sort(String text) {
            this.text = text;
        }

        public String[] getSortedLines() {
            String[] lines = text.split("\n");
            Collections.sort(Arrays.asList(lines));
            return lines;
        }

        public String[] getReverseSortedLines() {
            String[] sortedLines = getSortedLines();
            Collections.reverse(Arrays.asList(sortedLines));
            return sortedLines;
        }

        public String[] sortNumerically() {
            String[] lines = text.split("\n");
            Collections.sort(Arrays.asList(lines));
            return lines;
        }

}
