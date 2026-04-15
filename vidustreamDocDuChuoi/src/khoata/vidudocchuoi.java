package khoata;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vidudocchuoi {
  
	public static void main(String[] args) throws IOException{
		
		
		FileInputStream fInput = new FileInputStream("baitho.txt");
		// khai bao bien doi tuong InputStreamReader
		
		InputStreamReader ipReader = new InputStreamReader(fInput);
		// khai bao bien doi tuong buffee
		
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		
		
		
		// Doc 1 dong du lieu tu file , cat vao 1 bien chuoi
		
		String line1 = bufReader.readLine();
		
		// in ra dong doc duoc 
		System.out.println(line1);
		
        String line2 = bufReader.readLine();
		
		
		System.out.print(line2);
		}
	
}
