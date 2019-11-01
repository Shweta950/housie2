package TicketGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Coupn {

	int rows, columns;
	Cell cell[][]  ;
	int cellsPerRow;

	public Coupn(int rows,int columns,int cellsPerRow) {
		this.rows = rows;
		this.columns = columns;
		this.cell = cell;
		this.cellsPerRow = cellsPerRow;
	}

	public int[][] generateCols() {
		//Random rand = new Random();
		int cell[][] = new int[3][9];
        generateBlankSpaces(cell, cellsPerRow);

		 //sortByColumn(array,rows,columns);
		for(int i=0;i<columns;i++) {

			int[] sCol = new int[rows];

			int min = i*10+1;
			int max = i*10+10;
			

			for(int j=0;j<rows;j++) {
		          // generateBlankSpaces(cell, cellsPerRow);

					int a = ThreadLocalRandom.current().nextInt(min,max);
					for(int k=0;k<rows;k++) {

					if(a==cell[k][i]) {
						a = ThreadLocalRandom.current().nextInt(min,max);
						k=-1;
					}
				}
				//int a = cell[(rand.nextInt())]
				cell[j][i] = a;
				sCol[j] = cell[j][i];

			}
			Arrays.sort(sCol);
			for (int k = 0; k < rows; k++) {
				cell[k][i] = sCol[k];
			}

		}
		/*
		 * public int[] generateUniqueValues(){ List<Integer> list = new
		 * ArrayList<Integer>(); int randomNo[] = new int[27] }
		 */
		
		 
		for(int i=0; i<rows;i++) {

			System.out.println("-------------------------------------------");

			for(int j=0;j<columns;j++){

				int val=cell[i][j];

				Cell cs=new Cell();

				cs.setValue(val);

				
				cs.getValue();
				//getBlankSpaces();

			}

			System.out.println("-------------------------------------------");

		} 
		return cell;
	}

	
	
	  public int[][] generateBlankSpaces(int cell[][],int cellsPerRow){ 
		  int blankSpace = columns - cellsPerRow; 
		  for(int i=0;i<cell.length;i++) {
	  //blankSpace = cell[i].length;
	  
	  for(int j=0; j<blankSpace;j++) { 
		  while(blankSpace!=5) {
			  int a = ThreadLocalRandom.current().nextInt(0,9);
			  cell[i][j] = a;

		  }
	  System.out.println(Arrays.deepToString(cell));
	  } 
	  } 
		  return cell;
	  
	  
	  }
	 	
	public int[][] getBlankSpaces(){
		Random rand = new Random();
		int[][] cell = new int[3][9];

		
		 for(int i = 0;i < rows;i++) { 

		String noOfSpace = "444";
		 
		 int  Space = Character.getNumericValue(noOfSpace.charAt(rand.nextInt(noOfSpace.length())));
		 System.out.println("spaces" +noOfSpace);
		 int rowIndex =0;
		 
		 for(int k=0; k<Space;k++) {
			 int columnIndex = rand.nextInt(9);
	
			 if(rowIndex != columnIndex || k == 0) { 
				  if(i==0 && cell[1][columnIndex] == 0 && cell[2][columnIndex] == 0) {
					  k--; 
				  }
				  else if(i==1 && cell[0][columnIndex] == 0 && cell[2][columnIndex] == 0) { 
					  k--;
				  } 
				  else if(i==2 && cell[0][columnIndex]== 0 && cell[1][columnIndex] == 0) { 
					  k--; 
				  } 
				  else {
			  System.out.println(i+" newIndex "+columnIndex);
			  rowIndex = columnIndex;
			  cell[i][columnIndex] = 0; 
			  } } 
			  else { 
				  k--; 
				  } } }
		 return cell;
	 
		 }
}
		 

	
	
	
	
	
	
	
	
	
	

	
	
	
		

	
	
	
	
