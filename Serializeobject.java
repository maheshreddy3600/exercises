package day_7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializeobject {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(101,"deloitte",5000);
		Customer customer2 = new Customer(102,"nexwave",7000);
		try {
			FileOutputStream fos = new FileOutputStream("D:\\sample\\customer");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(customer1);
			oos.writeObject(customer1);
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ok");
		
	}

}
