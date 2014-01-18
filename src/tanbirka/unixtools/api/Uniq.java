package tanbirka.unixtools.api;

public class Uniq {
    public String getUniqLines(String lines) {

        StringBuilder uniqLines = new StringBuilder();
        String[] result = lines.split("\n");
        int length = result.length - 1;

        int j = 0;

        for (int i = 0; i < length; i++) {
            if (!result[i].equals(result[i + 1])) {
                uniqLines.append(result[i]).append("\n");
                j++;
            }
        }
        uniqLines.append(result[length]);

        return uniqLines.toString();
    }
}
