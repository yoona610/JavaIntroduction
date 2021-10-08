package chapter17;

import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException  {
		/*FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの障害が発生しました");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}*/

		/*try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました。");
		}*/

		/*Person p = new Person();
		p.setAge(-24);*/

		/*try {
			throw new UnsupportedMusicFileException("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("--スタックトレース(ここから)--");
			e.printStackTrace();
			System.out.println("--スタックトレース(ここまで)--");
		}*/

		/*try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました");
		}*/

		System.out.println("プログラムが起動しました");
		throw new IOException();
	}
}
