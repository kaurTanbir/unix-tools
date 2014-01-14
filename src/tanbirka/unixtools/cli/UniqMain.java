package tanbirka.unixtools.cli;

import tanbirka.unixtools.api.Uniq;
import tanbirka.unixtools.fs.MyFile;

import java.io.IOException;

public class UniqMain {
    public static void main(String[] args) throws IOException {
        MyFile myFile = new MyFile();
        Uniq lines = new Uniq();

        String input = myFile.readFile(args[0]);
        String[] uniqLines =  lines.getUniqLines(input);

        for (String uniqLine : uniqLines) {
            System.out.println(uniqLine);
        }
    }
}

