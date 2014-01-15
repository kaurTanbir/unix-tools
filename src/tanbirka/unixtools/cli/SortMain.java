package tanbirka.unixtools.cli;


import tanbirka.unixtools.api.Sort;
import tanbirka.unixtools.fs.MyFile;

import java.io.IOException;

public class SortMain {
    Sort sorter;

    public SortMain(String text) {
        this.sorter = new Sort(text);
    }

    public Sort getSorter() {
        return sorter;
    }
    public static class MyArray {
        String[] lines;

        public MyArray(String[] lines) {
            this.lines = lines;
        }

        public String join(String delimeter) {
            StringBuilder sb = new StringBuilder("");
            for (String line : lines) {
                sb.append(line).append(delimeter);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException{
        if (args.length < 1) {
            System.err.println("Arguments not found....");
            System.err.println("Usage:  SortMain    File Name  [Option]");
            System.exit(1);
        }
        MyFile file = new MyFile();
        String input = file.readFile(args[0]);

        Sort sorter = new SortMain(input).getSorter();

        String[] sortedLines;
        if (args.length > 1 && "-r".equals(args[1]))
            sortedLines = sorter.getReverseSortedLines();
        else
            sortedLines = sorter.getSortedLines();

        String sortedText;
        sortedText = new MyArray(sortedLines).join("\n");
        System.out.println(sortedText);
    }
}
