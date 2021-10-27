
public class Combinator {
	
	public int fatorial (int n) {
		int result = n;
		
		for(int m = n - 1; m > 1; m -=1) {
			result *= m;
		}
		
		return result;
	}
	
	public int combine (int n, int r) {
		int result = 0;
		// roda combinação com base no método fatorial
		return result;
	}
	
	public String polinomies(int n) {
		String result = "";
		
		int i = n;
		int j = 0; 
		for(int m = 0; m < n; m++)
		{
			result = "" + this.combine(n,j) + "(a^" + i + "b^" + j + ") + ";
			i--;
			j++;
		}
		
		return result;
	}
}
