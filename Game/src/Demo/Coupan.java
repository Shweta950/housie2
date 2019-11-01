package Demo;

import java.util.Arrays;

public class Coupan {
	private int couponid;

	private String[][] ticketnumbers;



	public Coupan() {

		ticketnumbers = new String[3][9];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 9; j++) {

				ticketnumbers[i][j] = null;

			}

		}

	}



	public void setTicketNumber(int row, int column, String number) {

//		if (Integer.parseInt(number) == -1) {

//			ticketnumbers[row][column] = null;

//		} else {

			ticketnumbers[row][column] = "" + number;

//		}

	}



	public int getTicketNumber(int row, int column) {

		if (ticketnumbers[row][column] != null) {

			return Integer.parseInt(ticketnumbers[row][column]);

		} else {

			return -1;

		}

	}



	public String[][] getTicket() {

		return this.ticketnumbers;

	}



	public void setTicket(String[][] numbers) {

		if (numbers.length == 3 && numbers[0].length == 9) {

			this.ticketnumbers = numbers;

		}

	}



	public String[] getRowNumbers(int row) {

		if (row < 0 || row >= 3) {

			return null;

		}

		return ticketnumbers[row];

	}



	public String[] getColumnNumbers(int column) {

		if (column < 0 || column >= 9) {

			return null;

		}

		String columnnumbers[] = new String[3];

		columnnumbers[0] = ticketnumbers[0][column];

		columnnumbers[1] = ticketnumbers[1][column];

		columnnumbers[2] = ticketnumbers[2][column];

		return columnnumbers;

	}



	public int getNumberCountForRow(int row) {

		String[] rowNumbers = getRowNumbers(row);

		int count = 0;

		for (int j = 0; j < rowNumbers.length; j++)

			if (rowNumbers[j] != null)

				count++;

		return count;

	}



	public int getNumberCountForColumn(int column) {

		String[] columnNumbers = getColumnNumbers(column);

		int countcol = 0;

		for (int i = 0; i < columnNumbers.length; i++) {

			if (columnNumbers[i] != null) {

				countcol++;

				System.out.println(countcol);

			}

		}

		return countcol;

	}



	public String toString() {



		System.out.println("\n******* Housie Coupon *******\n");

		String output = " Coupon ID : " + this.couponid + "\n\n";

		output += "  ---- ---- ---- ---- ---- ---- ---- ---- ----\n";

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 9; j++) {

				if (ticketnumbers[i][j] == null)

					output += " |   ";

				else if (ticketnumbers[i][j].length() == 1)

					output += " |  " + ticketnumbers[i][j];

				else

					output += " | " + ticketnumbers[i][j];

			}

			output += " |\n  ---- ---- ---- ---- ---- ---- ---- ---- ----\n";

		}

		return output;

	}



	public void getSortedColumn(String[][] ticketNumbers, int row, int column) {

		String[] columnnumbers = getColumnNumbers(column);

		int[] array = new int[columnnumbers.length];

		for (int i = 0; i < columnnumbers.length; i++) {

			array[i] = Integer.parseInt(columnnumbers[i]);

		}

		Arrays.sort(array);

		for (int j = 0; j < array.length; j++) {

			columnnumbers[j] = String.valueOf(array[j]);

		}

		System.out.println(Arrays.toString(columnnumbers));

		for (int k = 0; k < row; k++) {

			ticketNumbers[k][column] = columnnumbers[k];

		}

	}


}
