package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileNotFoundException2 {
	public static void main(String[] args) {
		try {
			FileReader file= new FileReader("G:\\j");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
