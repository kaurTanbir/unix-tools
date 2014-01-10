package tanbirka.unixtools.api;


public class Count{
	public int lineCount(String text) {
		int count = 0;
		String[] lines = text.split("\n");
		return lines.length;
	}

	public int wordCount(String text) {
		int count = 0;
		String[] words = text.split("\\s");
		return words.length;
	}

	public int charCount(String text) {
		int count = 0;
		String[] characters = text.split("");
		return characters.length;
	}
}
