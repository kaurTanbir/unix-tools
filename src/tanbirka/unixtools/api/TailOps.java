package tanbirka.unixtools.api;


public class TailOps {
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
