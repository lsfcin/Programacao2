
public class Subclass extends Superclass {
	private String text;
	
	public Subclass() {
		text = "O Mo Bu Gai Fei Di Tal";
	}
	
	protected void print() {
		System.out.println("Este é um objeto da Subclass e o texto dele é: " + text +
						   " e o número é: " + number);
	}
}
