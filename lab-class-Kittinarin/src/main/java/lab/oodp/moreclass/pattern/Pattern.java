package lab.oodp.moreclass.pattern;

public class Pattern {

	private int numberOfCharacter;
	private char character;
	
	public  Pattern(int n, char c) {
		numberOfCharacter = n ;
		 character = c ;
	}
	public int getNumberOfCharacters() {
		return numberOfCharacter;
	}
	public void setNumberOfCharacters(int n ) {
		this.numberOfCharacter = n;
	}
	public String toString() {
		//numberOfCharacter = 5;
		//character = '*';
		String s = "";
		for(int i=0; i < numberOfCharacter;i++) {
			s+=character;
		}
		return s ;
	}
}
