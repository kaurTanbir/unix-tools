package tanbirka.unixtools.cli;

import tanbirka.unixtools.api.GetUniqLines;
import tanbirka.unixtools.fs.MyFile;

import java.io.IOException;

public class Uniq {
    public static void main(String[] args) throws IOException {
        MyFile myFile = new MyFile();
        GetUniqLines lines = new GetUniqLines();

        String input = myFile.readFile(args[0]);
        lines.getLines(input);

    }
}

