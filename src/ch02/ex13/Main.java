package ch02.ex13;

import java.io.FileReader;
import java.util.Map;
import java.util.Map.Entry;

//javac -cp ./lib/opencsv-5.1.jar:./lib/commons-lang3-3.10.jar -d bin src/ch02/ex13/Main.java
//java -cp ./tmp:./lib/opencsv-5.1.jar:./lib/commons-lang3-3.10.jar ch02.ex13.Main

public class Main {

	public static void main(String[] args) throws Exception {
		Map<String, String> values;
		try {
			com.opencsv.CSVReaderHeaderAware csvReaderHeaderAware = new com.opencsv.CSVReaderHeaderAware(
					new FileReader("./resources/test.csv"));
			values = csvReaderHeaderAware.readMap();
			for (Entry<String, String> entry : values.entrySet()) {
				System.out.println(entry);
			}
			csvReaderHeaderAware.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
