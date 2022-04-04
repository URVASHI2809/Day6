
import java.io.IOException;

public class WhileLoopDemo {

	public static void main(String[] args) throws IOException {

		int row = 5;

		while (row >= 1) {
			String showRow = "";
			int column = 0;
			while (column < row) {
				showRow += "*";
				column++;
			}
			row--;
			System.out.println(showRow);
		}

	}

}
