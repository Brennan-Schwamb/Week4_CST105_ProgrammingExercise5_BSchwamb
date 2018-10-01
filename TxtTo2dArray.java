//Program: Reading txt file to 2d array program
//File: TxtTo2dArray.java
//Summary: Reads txt file into an array and outputs it as a string by column
//Author: Brennan M. Schwamb
//Date: September 30, 2018

import java.util.Scanner;
import java.io.File;
import java.util.Formatter;
import java.util.Objects;
public class TxtTo2dArray
{
	static String text;
	
	public static void main(String[] args) throws Exception {
		{


//Read text from file
String home = System.getProperty("user.home");
			java.io.File file = new java.io.File(home + File.separator + "Desktop" + File.separator + "2dArray"
					+ ".txt");
		Scanner userInput = new Scanner(file);
		text = userInput.nextLine();
		String regex = "";
		String [] textArray = text.split(regex);
		
		//Create Array
		String[][] outputArray = new String[20][45];
		//Define Variables
		int i=0; //Input text increment
		int c=0; //Column increment
		int r=0; //Row increment
		//Read text into the array
		for(r = 0; r < 20; r++)
		{
			for(c = 0; c < 45; c++)
			{
				if(i < textArray.length)
				{
					outputArray[r][c] = textArray[i];
				
					i++;
				}
				// Add @ if extra space
				else 
				
					outputArray[r][c] = "@";  
				
			 }
		}	
		//Output array by columns
		for(c = 0; c < 45; c++)
				
			for(r = 0; r < 20; r++)
				System.out.print(outputArray[r][c]);
				
			 		
	
}
	}
}
	


