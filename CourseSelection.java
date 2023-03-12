package ai.ineuron.beans;

public class CourseSelection 
{
	private courses course;
	
	public void setCourse(courses course) {
		this.course = course;
	}
	
	public void selectCourse() {
		boolean flag = course.courseSelection();
		if(flag) {
			System.out.println("course selected successfully");
		}
		else {
			System.out.println("you have made some mistake please find out");
		}
	}
}
