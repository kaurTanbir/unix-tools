package tanbirka.unixtools.api;


public class Tail {
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
        int length = lines.length;
        String[] result = new String[numOfLines];
        for(int i = length-numOfLines,j = 0 ; i<length; i++,j++ ){
            result[j] = lines[i];
        }
        return result;
    }
}
