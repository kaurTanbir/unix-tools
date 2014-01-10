package tanbirka.unixtools.cli;

import tanbirka.unixtools.api.ReduceSpaces;
import tanbirka.unixtools.fs.MyFile;

import java.io.IOException;

public class TrimSpaces {
    public static void main(String[] args) throws IOException {
        MyFile myFile = new MyFile();
        ReduceSpaces rs = new ReduceSpaces();

        String fileName = args[0];

        String fileContent = myFile.readFile(fileName);
        String modifiedText = rs.trimSpace(fileContent);

        myFile.writeFile(fileName,modifiedText);
    }
}

