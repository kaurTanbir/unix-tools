package tanbirka.unixtools.cli;

import tanbirka.unixtools.fs.MyFile;
import tanbirka.unixtools.api.HeadOps;

import java.io.IOException;

class Head{
    public static void  main(String args[])throws IOException {
        MyFile myFile = new MyFile();
        HeadOps ob = new HeadOps();

        String input = myFile.readFile(args[0]);
        if (args.length<2)
            ob.getLines(input);
        else {
            int noOfLines = Integer.parseInt(args[1]);
            ob.getLines(input,noOfLines);
        }
    }
}

