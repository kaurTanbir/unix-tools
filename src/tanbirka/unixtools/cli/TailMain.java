package tanbirka.unixtools.cli;

import tanbirka.unixtools.api.Tail;
import tanbirka.unixtools.fs.MyFile;

import java.io.IOException;

public class TailMain{
    public static void  main(String args[])throws IOException{
        MyFile myFile = new MyFile();
        Tail ob = new Tail();

        String input = myFile.readFile(args[0]);
        if (args.length<2)
            ob.getLines(input);
        else {
            int noOfLines = Integer.parseInt(args[1].substring(1));
            ob.getLines(input,noOfLines);
        }
    }
}

