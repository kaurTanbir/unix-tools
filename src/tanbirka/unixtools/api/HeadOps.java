package tanbirka.unixtools.api;

public class HeadOps {
    public String[] lines;
    public void getLines (String data,int numOfLines) {
        lines = data.split("\\n", numOfLines+1);
        display(lines);
        return;
    }
    public void getLines (String data) {
        this.lines = data.split("\\n",11);
        display(lines);
        return;
    }
    public void display(String[] lines){
        for(int i = 0 ;i<lines.length-1;i++ ){
            System.out.println(lines[i]);
        }
    }
}