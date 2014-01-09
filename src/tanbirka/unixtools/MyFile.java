package tanbirka.unixtools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
  public String readFile(String fileName) throws IOException {
    String returnValue = "";
    String line = "";
    File file = new File(fileName);;
    try {
        Scanner fileContent = new Scanner(file);
		while (fileContent.hasNextLine()) {
			line = fileContent.nextLine();
			returnValue += line + "\n";
		}
    }
    catch (FileNotFoundException e) {
		throw new RuntimeException("File not found");
    }
    return returnValue;
  }
}
