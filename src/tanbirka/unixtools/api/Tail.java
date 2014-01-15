package tanbirka.unixtools.api;


public class Tail {
    StringBuilder result = new StringBuilder("");
    String[] lines;

    public String getLines(String data, int numOfLines) {
        lines = data.split("\n");
        for (int i = lines.length - numOfLines; i < lines.length ; i++) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }

    public String getLines(String data) {
        lines = data.split("\n");
        for (int i = lines.length-10; i < lines.length; i++) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }
}