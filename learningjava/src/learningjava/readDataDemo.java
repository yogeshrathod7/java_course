package learningjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readDataDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\Java_Programs\\learningjava\\src\\learningjava\\testDemo.properties");
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\\\src\\\\learningjava\\\\testDemo.properties");

		Properties p = new Properties();
		p.load(fis);
		System.out.println(p.getProperty("name"));

	}
}
