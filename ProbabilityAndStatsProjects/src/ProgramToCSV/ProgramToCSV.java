package ProgramToCSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * 
 * @author ryannguyen
 * Outputs the values x and y for the function y = 2x + 5
 * to be later turned into a CSV file to be uploaded to excel
 * 
 * x range 1-50
 */

public class ProgramToCSV {
	
	
	
	public ArrayList<String> getValues(){
		
		ArrayList<String> numList = new ArrayList<String>();
		
		for(int i = 1; i <= 50; i++) {
		
			Integer xValue = i;
			Integer yValue = (i*2)+5;
			numList.add(xValue.toString());
			numList.add(yValue.toString());
			
		
		}
		
		System.out.println(numList);
		
		return numList;
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		ArrayList<String> finalList = new ArrayList<String>();
		ProgramToCSV test = new ProgramToCSV();
		File csvFile = new File("numbers.csv");
		PrintWriter out = new PrintWriter(csvFile);
		
		finalList = (test.getValues());
		out.println(finalList);
		
		
	}
	
	
	
}
