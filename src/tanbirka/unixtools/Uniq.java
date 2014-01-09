package tanbirka.unixtools;

import tanbirka.unixtools.MyFile;

import java.io.IOException;

public class Uniq {
    public static void main(String[] args) throws IOException {
        MyFile myFile = new MyFile();
        GetUniqLines lines = new GetUniqLines();

        String input = myFile.readFile(args[0]);
        lines.getLines(input);

    }
}

class GetUniqLines{
    public void getLines(String lines){
        String[] result = lines.split("\n");
        System.out.println(result.length);
        for(int i=0; i< result.length-1; i++){
            if(0 != result[i].compareTo(result[i + 1]))
                System.out.println(result[i]);
        }
    }

}