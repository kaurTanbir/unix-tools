package tanbirka.unixtools;

import tanbirka.unixtools.MyFile;

import java.io.IOException;

class Head{
    public static void  main(String args[])throws IOException{
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

class HeadOps {
    public String[] lines;
    public void getLines (String data,int numOfLines) {
        lines = data.split("\\n", numOfLines);
        display(lines);
        return;
    }
    public void getLines (String data) {
        this.lines = data.split("\\n",10);
        display(lines);
        return;
    }
    public void display(String[] lines){
        for(int i = 0 ;i<lines.length;i++ ){
            System.out.println(lines[i]);
        }
    }
}