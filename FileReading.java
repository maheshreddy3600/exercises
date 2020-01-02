package day_7;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args ){
		try{
			FileInputStream fis = new FileInputStream("D:\\sample\\resume");
			int x;
			while((x=fis.read())!=-1)
				System.out.println((char)x);
			fis.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
