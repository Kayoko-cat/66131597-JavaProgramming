package khoata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vidudocchuoi {
  
	public static void main(String[] args) throws IOException{
		
		// khai bao bien doi tuong InputStreamReader
		InputStreamReader ipReader = new InputStreamReader(System.in);
		// khai bao bien doi tuong buffee
		
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		//in ra mot cau huong dan de nguoi dung biet can lam gi
		System.out.print("Nhap 1 chuoi: ");
		
		// Doc du lieu tu ban phim , cat vao 1 bien chuoi
		
		String lineDocDuoc = bufReader.readLine();
		
		// in ra dong doc duoc 
		System.out.print(lineDocDuoc);
		
		}
	
}
