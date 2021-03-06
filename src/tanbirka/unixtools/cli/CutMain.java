package tanbirka.unixtools.cli;

import tanbirka.unixtools.api.Cut;
import tanbirka.unixtools.fs.MyFile;

import java.io.IOException;

public class CutMain {
    public static void main(String[] args) throws IOException {
        CutMain obj = new CutMain();
        MyFile myfile = new MyFile();
        Cut cut = new Cut();

        String properArgs[] = obj.getProperArgs(args);
        String delimiter = " ";
        String fileData = myfile.readFile(properArgs[0]);
        int fieldNo = Integer.parseInt(properArgs[1].substring(2));

        if(properArgs.length > 2) delimiter = properArgs[2].substring(2);

        String desiredFieldData = cut.getFieldData(fileData, fieldNo, delimiter);
        System.out.println(desiredFieldData);
    }

    String[] getProperArgs(String[] args){
        String options[] = new String[args.length];

        for(int i = 0; i<args.length; i++){
            if(!CutMain.isFileName(args[i])) {
                options[0] = args[i];
            }
            if(CutMain.isfieldNo(args[i])) {
                options[1] = args[i];
            }
            if(CutMain.isDelimiter(args[i])) {
                options[2] = args[i];
            }
        }

        return options;
    }
    static boolean isDelimiter(String arg){
        return arg.matches("-d.*");
    }
    static boolean isfieldNo(String arg){
        return arg.matches("-f.*");
    }
    static boolean isFileName(String arg){
        return arg.matches("-.*");
    }
}

