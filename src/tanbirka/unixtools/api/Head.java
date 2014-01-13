package tanbirka.unixtools.api;


public class Head {
    public String[] lines;
    public String[] getLines (String data) {
        lines = data.split("\\n");
        lines = display(lines,10);
        return lines;
    }
    public String[] getLines (String data,int numOfLines) {
        lines = data.split("\\n");
        lines = display(lines,numOfLines);
        return lines;
    }
    public String[] display(String[] lines,int numOfLines){
        String[] desiredLine = new String[0];
        for(int i = 0 ;i<numOfLines;i++ ){
            desiredLine[i] = lines[i];
        }
        return desiredLine;
    }
}