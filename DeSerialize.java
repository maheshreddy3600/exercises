package day_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis= new FileInputStream("D:\\sample\\customer");
			try {
				ois = new ObjectInputStream(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Object obj;
			try {
				while((obj=ois.readObject())!=null){
					Customer cust = (Customer) obj;
					System.out.println(cust.getCustid()+cust.getCustname()+cust.getCommn());
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			ois.close();
			fis.close();
			System.out.println("done");
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
