package com.revature.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Exceptions {
	
	public void checkedExceptionTryCatch() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public void CheckedExceptionThrows() throws FileNotFoundException {
		FileReader fr = new FileReader("file.txt");
	}
	
	public void moreTryCatch() {
		try {
			FileReader fr = new FileReader("file.txt");
			fr.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void throwanException(int i) throws Exception {
		if (i < 10) {
			throw new Exception("i is too big.");
		}
	}
}
