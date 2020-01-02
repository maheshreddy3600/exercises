package day_7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {


		public static void main(String[] args ){
			try{
				FileInputStream fis = new FileInputStream("D:\\sample\\resume");
				FileOutputStream fos = new FileOutputStream("D:\\sample\\resume2");
				int x;
				while((x=fis.read())!=-1)
				fos.write((char)x);
				fis.close();
				fos.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		
				System.out.println("sucess");
			}
			
		}

	


