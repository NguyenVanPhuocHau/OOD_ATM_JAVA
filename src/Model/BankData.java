package Model;

import java.util.ArrayList;

public class BankData {
	private ArrayList<Acount> data = new ArrayList<Acount>();
	
	public BankData() {
		data.add(new Acount("111 XXX XXX 111", "123456789090701", "NGUYEN VAN XXXX XXX", "090701", 10000000, false));
		data.add(new Acount("222 XXX XXX 222", "987654321060880", "LE THI XXXX", "060880", 12000000, false));
		data.add(new Acount("333 XXX XXX 333", "123456789180106", "NGUYEN THI XXXX XXXXXX", "180106", 1000000, false));
		data.add(new Acount("444 XXX XXX 444", "987654321010173", "NGUYEN MINH XXX", "010173", 7000000, true));
	}

	public ArrayList<Acount> getData() {
		return data;
	}
	
	public Acount findAcount(String numberOfAcount) {
		for (Acount acount : data) {
			if (acount.getNumberOfAcount().equals(numberOfAcount)) {
				return acount;
			}
		}
		return null;
		
	}
	
	

}
