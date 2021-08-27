package object_oreint_6;

import java.util.Scanner;

public class Tissue implements Manageable{
	String name;
	int nSheet;
	int price;
	
	@Override
	public void read(Scanner scan) {
		// TODO Auto-generated method stub
		name=scan.next();
		nSheet=scan.nextInt();
		price=scan.nextInt();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("%s %dÀå (%d¿ø)\n",
				name,nSheet,price);
	}

	@Override
	public boolean matches(String kwd) {
		// TODO Auto-generated method stub
		if(name.contains(kwd))
			return true;
		if(kwd.contentEquals(""+nSheet))
			return true;
		return false;
	}

}
