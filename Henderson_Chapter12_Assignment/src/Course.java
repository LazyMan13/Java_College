/*
 * Robert Henderson
 * 02/09/2021
 * Chapter 12 Assignment
 */

public class Course
{
	String department;
	int courseNumber;
	double credits;
	final int DEPT_LENGTH = 3;
	final int LOW_CNUM = 100;
	final int HIGH_CNUM = 499;
	final double LOW_CREDITS = 0.5;
	final double HIGH_CREDITS = 6;

	public Course(String dept, String num, String creditValue) throws CourseException
	{
		// precondition checks
		if (dept.length() != 3)
			throw new CourseException("Department length should be 3");

		if (Integer.parseInt(num) < LOW_CNUM || Integer.parseInt(num) > HIGH_CNUM)
			throw new CourseException("Course number does not consist of three digits between 100 and 499 inclusive");
		
		if (Double.parseDouble(creditValue) < LOW_CREDITS || Double.parseDouble(creditValue) > HIGH_CREDITS)
			throw new CourseException("Credit values must be in range from 0.5 to 6");

		this.department = dept;
		this.courseNumber = Integer.parseInt(num);
		this.credits = Double.parseDouble(creditValue);

		if(department.equals("BIO") | department.equals("CHM") | department.equals("CIS") | department.equals("PHY"))
		{
			LabCourse course = new LabCourse(department, courseNumber, credits);
			course.display();
		}
		else
			{
			CollegeCourse course = new CollegeCourse(department, courseNumber, credits);
			course.display();
		}
	}

	@Override
	public String toString()
	{
		return "Valid Entry: Course " + department + courseNumber 
				+ " with " + credits + " credits";
	}
}