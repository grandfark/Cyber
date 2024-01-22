package study;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class study12 {
	public static void main(String[] args) {
		File file = new File("member.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			fis.close();
			System.out.println("File Read Success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
