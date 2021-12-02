package characterIssue;
import textio.TextIO;

public class CharacterIssue {
	
	public static void main (String[] args) {
		String str;
		char ch;
		
		System.out.println("Input your phrase: ");
		str =TextIO.getln();
		System.out.println("Please kindly input the character you wish to find: ");
		ch = TextIO.getlnChar();
		System.out.println("The number of " + ch + "'s in \"" + str + "\" is " + countChar(str, ch) + ".");
		
		
	}
	
	static int countChar(String str, char ch) {
		ch = Character.toUpperCase(ch);
		str = str.toUpperCase();
		int charCount = 0;
		char ch1;
		
		for (int i = 0; i < str.length(); i++) {
			ch1 = str.charAt(i);
			
			if (ch == ch1) {
				charCount++;
			}
		}
		return charCount;
	}

}
