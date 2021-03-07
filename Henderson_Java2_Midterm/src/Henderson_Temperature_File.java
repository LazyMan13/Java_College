import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Robert Henderson
 * 02/28/2021
 * Midterm Assignment
 */

public class Henderson_Temperature_File
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		Path file = Paths.get("DailyTemperatures.txt");
		OutputStream output = null;
		String day, high, low, fileOut = "", delimiter = ",";
		String checkFile = "";
		char quit = 'n';
		int count = 0;
		double avgHigh, avgLow;
		
	    try
	    {
	    	try
	    	{
		    	file.getFileSystem().provider().checkAccess(file);
		        System.out.print("*****************");
		        System.out.print("   File does exist and can be read.  ");
		        System.out.print("*****************\n\n");
		        checkFile = "good";	        
	    	}
	        catch(Exception e)
	        {
	        	  System.out.println("Message: " + e); 
	        	  checkFile = "bad";	
	        }
	    	
	    	if (checkFile == "good")
	        {
	        	output = new BufferedOutputStream(Files.newOutputStream
	     			  (file, StandardOpenOption.APPEND)); 
	        	
	        }
	        else
	        {
	    	   	output = new BufferedOutputStream(Files.newOutputStream
	  			  (file, StandardOpenOption.CREATE)); 
	    	    System.out.print("The file \'StudentGradesFile.txt\' has been created\n\n");
	        }
	    	
	        BufferedWriter writer = new BufferedWriter
	  			  (new OutputStreamWriter(output)); 
		    
	        do
	        {
		        System.out.println("Enter the day of the week: ");
		        day = kb.next();
		        try
		        {
			        System.out.println("Enter the high for " + day);
			        high = kb.next();
			        System.out.println("Enter the low for " + day);
			        low = kb.next();
			        fileOut = day + delimiter + high + delimiter + low;
		        }
		        catch(InputMismatchException ime)
		        {
		        	System.out.println("ERROR: Enter a numeric value");
		        }
		        try
		        {
		        	System.out.println("Enter another day? y/n ");
		        	quit = kb.next().charAt(0);
		        }
		        catch(InputMismatchException ime)
		        {
		        	System.out.println("Enter y or n");
		        	
		        }
	        }
	        while(quit != 'y' || quit != 'Y');

	    }
	    catch(IOException ioe)
	    {
	    	System.out.print("File cannot be used.");
	    }
	        
/*	        int indexOfDay = dayNames.indexOf(wkDay);
	        if(indexOfDay != -1)
	        {
	        	System.out.print("The temperature for " + dayNames.get(indexOfDay) + " is " + dayTemps.get(indexOfDay) + " degrees.");
	        }
	        else if(wkDay.equals("week"))
	        {
	        	float averageTemp = 0;
	        	for (Integer dayTemp : dayTemps)
	        	{
	        		averageTemp += dayTemp;
	        	}
	        	averageTemp /= dayTemps.size();
	        	System.out.print("The average temperature for the week is " + averageTemp + " degrees");
	        }
	        else
	        {
	        	System.out.println("Wrong entry: " + wkDay);
	        }*/
		      

	    kb.close();  
	    
	}
}
