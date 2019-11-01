package TicketGenerator;

import java.util.HashSet;

public class Cell {
	private int value;
	private String blank;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
		HashSet<Integer> set=new HashSet<Integer>();

    	set.add(value);

	for(Integer i1:set) {

    		System.out.print(i1+" | ");

    	}
		
	}
	public String getBlank() {
		return blank;
	}
	public void setBlank(String blank) {
		this.blank = blank;
	}



}
