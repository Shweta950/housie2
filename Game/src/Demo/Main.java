package Demo;

public class Main {
	public static void main(String[] args) {

		Coupan coupon = new Coupan();

		HousieTicketGenerator generator = new HousieTicketGenerator();

//		int [] array = generator.getRandomNumbers();

//		String[][] ticket = coupon.getTicket();

//		int k = 0;

//		for(int i = 0; i < 9; i++) {

//			for(int j = 0; j < 3; j++) {

//				ticket[j][i] = ""+array[k];

//				k++;

//			}

//		}

		generator.setTicketNumbers();

		generator.getBlankSpaces();

//		coupon.setTicketNumber(0, 0, 15);

//		coupon.setTicketNumber(1, 0, 5);

//		coupon.setTicketNumber(2, 0, 20);

//		System.out.println(coupon.getNumberCountForColumn(0));

//		System.out.println("Row "+coupon.getNumberCountForRow(0));

//		String[][] ticket = coupon.getTicket();

//		System.out.println(Arrays.deepToString(ticket));

//		coupon.getSortedColumn(ticket, 3, 0);

//		String result = coupon.toString();

//		System.out.println(result);



	}
}
