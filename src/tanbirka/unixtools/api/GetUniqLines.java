package tanbirka.unixtools.api;


public class GetUniqLines{
    public void getLines(String lines){
        String[] result = lines.split("\n");
        for(int i=0; i< result.length-1; i++){
            if(0 != result[i].compareTo(result[i + 1]))
                System.out.println(result[i]);
        }
    }

}
