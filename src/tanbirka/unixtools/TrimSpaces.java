package tanbirka.unixtools;

import tanbirka.unixtools.MyFile;

import java.io.IOException;

public class TrimSpaces {
    public static void main(String[] args) throws IOException {
        MyFile myFile = new MyFile();
        ReduceSpaces rs = new ReduceSpaces();

        String fileName = args[0];

        String fileContent = myFile.readFile(fileName);
        System.out.println(fileContent);
        String modifiedText = rs.trimSpace(fileContent);

        myFile.writeFile(fileName,modifiedText);

    }
}

class ReduceSpaces{
    public String trimSpace(String text){
        return text.replaceAll("\\ +", " ").trim();
    }
}