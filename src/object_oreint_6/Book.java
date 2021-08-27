package object_oreint_6;

import java.util.ArrayList;

import java.util.Scanner;

public class Book implements Manageable {
	// 자료구조 생틍출판 1001 2003 천인국 공용해 하상호 0 15000
	String title;
	String pub;
	int isbn;
	int year;
	ArrayList<String> authors = new ArrayList<>();
	int price;
	@Override
	public void read(Scanner scan) {
		title=scan.next();
		pub=scan.next();
		isbn=scan.nextInt();
		year=scan.nextInt();
		String tmp;
		while(true) {
			tmp=scan.next();
		if(tmp.contentEquals("0"))
			break;
		authors.add(tmp);
	}
		price=scan.nextInt();
}
	void printBookType() {
		System.out.println("[일반책]");
	}
	@Override
	public void print() {
		printBookType();
		System.out.printf("%s %s (%d/%d년) [%d원] ,저자:",
				title,pub,isbn,year,price);
		for(String a:authors)
			System.out.printf("%s",a);
		System.out.println();
	}
	@Override
	public boolean matches(String kwd) {
		// TODO Auto-generated method stub4
		if(title.contains(kwd))
			return true;
		if(pub.contains(kwd))
			return true;
		if(kwd.equals(""+isbn))
			return true;
		if(kwd.equals(""+year))
			return true;
		for(String a:authors)
			if(kwd.contentEquals(a))
				return true;
		return false;
	}
}
