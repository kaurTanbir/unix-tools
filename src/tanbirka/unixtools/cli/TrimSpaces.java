package tanbirka.unixtools.cli;

import tanbirka.unixtools.api.ReduceSpaces;
import tanbirka.unixtools.fs.MyFile;

import java.io.IOException;

public class TrimSpaces {
    public static void main(String[] args) throws IOException {
        MyFile myFile = new MyFile();
        ReduceSpaces rs = new ReduceSpaces();

        String fileToRead = args[0];
        String fileToWrite = args[1];

        String fileContent = myFile.readFile(fileToRead);
        String modifiedText = rs.trimSpace(fileContent);

        myFile.writeToFile(fileToWrite,modifiedText);
    }
}

