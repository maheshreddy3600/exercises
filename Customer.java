package day_7;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialversionuid = 1L;
	private int custid;
	private String custname;
	private double commn;
	
	public Customer(int custid, String custname, double commn) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.commn = commn;
	}

	public Customer(){
		
	}
	
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public double getCommn() {
		return commn;
	}

	public void setCommn(double commn) {
		this.commn = commn;
	}

	public static long getSerialversionuid() {
		return serialversionuid;
	}

	public static void main(String[] args) {
	
		
		

	}

}
