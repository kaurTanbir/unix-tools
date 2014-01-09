package tanbirka.unixtools;

import java.io.IOException;

class Tail{
    public static void  main(String args[])throws IOException{
        MyFile myFile = new MyFile();
        TailOps ob = new TailOps();

        String input = myFile.readFile(args[0]);
        if (args.length<2)
            ob.getLines(input);
        else {
            int noOfLines = Integer.parseInt(args[1]);
            ob.getLines(input,noOfLines);
        }
    }
}

class TailOps {
    public String[] lines;
    public void getLines (String data) {
        lines = data.split("\\n");
        display(lines,10);
        return;
    }
    public void getLines (String data,int numOfLines) {
        lines = data.split("\\n");
        display(lines,numOfLines);
        return;
    }

    public void display(String[] lines,int numOfLines){
        int length = lines.length;
        for(int i = length-numOfLines ; i<length; i++ ){
            System.out.println(lines[i]);
        }
    }
}

