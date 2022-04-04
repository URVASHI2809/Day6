
public class ForLoopDemo {
	/**
	 * int row taking an input
	 * the output is in decremented way.
	 * @param args
	 */
	public static void main(String args[]) {
		int rows = 5;
//		to handle exception if the input 
		if(rows<=0)
		{
			throw new IllegalArgumentException("invalid value");
		}
		
		for (int i = rows - 1; i >= 0; i--) {
			for (int column = 0; column <= i; column++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
