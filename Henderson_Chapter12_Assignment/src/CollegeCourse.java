/*
 * Robert Henderson
 * 02/09/2021
 * Chapter 12 Assignment
 */

public class CollegeCourse
{
	private String department;
	private int courseNumber;
	protected double numCredits;
	protected static final int FEE = 120;
	
	public CollegeCourse(String department, int courseNumber, double numCredits)
	{
		setDepartment(department);
		setCourseNum(courseNumber);
		setNumCredits(numCredits);
	}
	
	public void display()
	{
	   System.out.println("Department: " + getDepartment() + " | Course Number: " + getCourseNum() + 
			   " | Amt of Credits: " + getNumCredits() + " | Fee: $" + getNumCredits() * FEE);
	}
	
	public String getDepartment()
	{
		return department;
	}
	public int getCourseNum()
	{
		return courseNumber;
	}
	public double getNumCredits()
	{
		return numCredits;
	}
	
	public int getFee()
	{
		return FEE;
	}
	
	public void setDepartment(String d)
	{
		department = d;
	}
	public void setCourseNum(int n)
	{
		courseNumber = n;
	}
	public void setNumCredits(double c)
	{
		numCredits = c;
	}
}
