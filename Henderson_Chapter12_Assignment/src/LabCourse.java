/*
 * Robert Henderson
 * 02/09/2021
 * Chapter 12 Assignment
 */

public class LabCourse extends CollegeCourse
{
	private double adjFee;
	
	public LabCourse(String department, int courseNumber, double numCredits)
	{
		super(department, courseNumber, numCredits);
		setAdjFee(super.getFee());
	}
	
	@Override
	public void display()
	{
		System.out.println("Department: " + getDepartment() + " | Course Number: " + getCourseNum() + 
				" | Amt of Credits: " + getNumCredits() + " | Fee: $" + getAdjFee());
	}
	
	public double getAdjFee()
	{
		return adjFee;
	}
	
	public void setAdjFee(double f)
	{
		adjFee = (f * numCredits) + 50;
	}
}
