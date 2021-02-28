/*
 * Robert Henderson
 * 02/09/2021
 * Chapter 12 Assignment
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ThrowCourseException 
{
	static ArrayList<String> displayList = new ArrayList<String>();
	
    public static void main(String[] args) 
    {
        
        String[] cour = {"CIS", "200", "6", "MATH", "220", "6", "CST", 
        		"230", "6", "PNG", "99", "3", "BIO", "450", "03", "PSY", "200", "7.0"};
        
        displayList.addAll(Arrays.asList(cour));
        
        	for(int i = 0; i < displayList.size(); i++)
        	{
        		if(i%3 == 0)
        		{
        			try
        			{
        				Course course = new Course(displayList.get(i), displayList.get(i+1), displayList.get(i+2));
        				System.out.println(course);
        				System.out.println();
        			}
        			catch (CourseException e)
        			{
        				System.out.println(e);
        				System.out.println("Invalid Entry");
        				System.out.println();
        			}
        		}
        	}
        
    }
}