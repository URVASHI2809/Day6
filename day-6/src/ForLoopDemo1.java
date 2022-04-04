import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ForLoopDemo1 {
	public static void main(String[] args) throws IOException {
//				String file = "output.txt";
		File file = new File("output.txt");
		FileWriter writer = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		int rows = 5;

		String data = "";
		for (int i = rows - 1; i >= 1; i--) {
			for (int column = 0; column < i; column++) {
				data += "*";
			}
			data += "\n";
		}
		bufferedWriter.write(data);
		bufferedWriter.close();
	}

}
