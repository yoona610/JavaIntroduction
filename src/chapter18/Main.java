package chapter18;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		/*FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		while (input != -1) {
			System.out.print((char)input);
			input = fr.read();
		}
		fr.close();*/
		FileWriter fw = new FileWriter("data.txt");
		fw.write('そ');
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		fw.close();
	}
}
