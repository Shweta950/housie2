package Demo;


	import java.util.ArrayList;

	import java.util.Arrays;

	import java.util.Collections;

	import java.util.HashSet;

	import java.util.List;

	import java.util.Random;

	import java.util.Set;

	import java.util.stream.Collectors;

	import java.util.stream.IntStream;



	public class HousieTicketGenerator {



		static Coupan coupon = new Coupan();

		Random random = new Random();



		// To generate Random Numbers by defining range



		public int generateRandomNumber(int min, int max) {

			return random.nextInt((max - min) + 1) + min;

		}



		// To get non-repeating random numbers

		public int[] getRandomNumbers() {

			// List to store non-repeating Random Numbers

			List<Integer> randomnumberlist = new ArrayList<Integer>();

			int[] randomarray = new int[27];

			int number = 0, count = 0;

			int min = 1; // Initial Range value

			int max = 10; // Last range value



			// To generate 27 random numbers in list

			while (randomnumberlist.size() != 27) {



				// To generate only 3 numbers between the range

				while (count != 3) {



					number = generateRandomNumber(min, max);



					// To check repeating random numbers

					if (!randomnumberlist.contains(number)) {

						randomnumberlist.add(number);

						count++;

					}

				}

				count = 0;

				min = max + 1; // To increase the range

				max = max + 10; //

			}



			// To convert list to array

			randomarray = randomnumberlist.stream().mapToInt(Integer::intValue).toArray();

			Arrays.sort(randomarray);

			return randomarray;

		}



		public void setTicketNumbers() {

			int[] randomnumbers = getRandomNumbers();

			String[][] numbers = coupon.getTicket();

			int k = 0;

			for (int i = 0; i < 9; i++) {

				for (int j = 0; j < 3; j++) {

					numbers[j][i] = "" + randomnumbers[k];

					k++;

				}

			}

			coupon.setTicket(numbers);

			String result = coupon.toString();

			System.out.println(result);

		}



		public void getBlankSpaces() {

			String[][] ticket = coupon.getTicket();

			List<Integer> blankspaces = new ArrayList<Integer>();



			for (int i = 0; i < ticket.length; i++) {

				while (blankspaces.size() < 12) {

					new Random().ints(1, 0, 9).forEach(blankspaces::add);

					for (int j = 0; j < blankspaces.size(); j++) {

						System.out.println(blankspaces.toString());

						System.out.println(

								blankspaces.get(j) + ": " + Collections.frequency(blankspaces, blankspaces.get(j)));

						if (Collections.frequency(blankspaces, blankspaces.get(j)) == 3) {

							System.out.println(blankspaces.get(j) + ":------------- "

									+ Collections.frequency(blankspaces, blankspaces.get(j)));

							blankspaces.remove(blankspaces.get(j));

						}

						break;

					}



				}

			}

			System.out.println("Blank spaces list : " + blankspaces.toString());

			System.out.println("Blank spaces size : " + blankspaces.size());

			setBlankspaces(blankspaces);

		}



		public void setBlankspaces(List<Integer> blankspaces) {

			String[][] ticket = coupon.getTicket();

			int i = 0;

			for (int k = 0; k < 3; k++) {

				for (int j = 0; j < 4; j++) {

					ticket[k][blankspaces.get(i)] = null;

					i++;

				}



			}

			coupon.setTicket(ticket);

			String result = coupon.toString();

			System.out.println(result);

		}

	



//				for (int k = 0; k < spacelist.size(); k++) {

//					int l = spacelist.get(k);

////					int colcount = coupon.getNumberCountForColumn(l);

////					System.out.println("Column count : "+colcount);

//					coupon.setTicketNumber(i, l, " ");

//				}

//			}

//			coupon.setTicket(ticket);

//			String spaceresult = coupon.toString();

//			System.out.println(spaceresult);



//		public int[] getNumbers() {

//			int[] randomarray = new int[27];

//			int randomnumber = 0;

//			while (list.size() != 27) {

//				randomnumber = generateRandomNumber(1, 90);

//				if (!list.contains(randomnumber)) {

//					list.add(randomnumber);

//				}

//			}

//			randomarray = list.stream().mapToInt(Integer::intValue).toArray();

//			Arrays.sort(randomarray);

//			return randomarray;

//		}
}

