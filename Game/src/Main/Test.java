package Main;

import java.util.Arrays;

import TicketGenerator.Coupn;

public class Test {

	public static void main(String[] args) {
		
		Coupn c = new Coupn(3,9,5);
		int ticket[][] = c.generateCols();
		//System.out.println(ticket);
	}
}
