package tanbirka.unixtools.cli;

import tanbirka.unixtools.api.Count;
import tanbirka.unixtools.fs.MyFile;

import java.io.IOException;

class WordCount{
	public static void main(String[] args) throws IOException {
	MyFile myFile = new MyFile();
	Count count = new Count();

    String input = myFile.readFile(args[0]);

    int noOfLines = count.lineCount(input);
    int noOfCharacter = count.charCount(input);
    int noOfWords = count.wordCount(input);

    System.out.println(noOfLines +" "+noOfWords+" "+noOfCharacter+" "+ args[0]);
	}
}

