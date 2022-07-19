package week2;

import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		char c = ' ';
		System.out.println("Enter a character:");
		try {
			c = (char)System.in.read();
		} catch (IOException e) {
			// TODO: handle exception
		}
		System.out.println("Your character of inputing is:" + c);
	}
}
