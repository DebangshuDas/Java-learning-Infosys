package com.infy.course;

public class CourseRegistration {
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;
	
	public CourseRegistration(String studentName, int registrationId, float qualifyingMarks, int courseId, boolean hostelRequired) {
		super();
		this.studentName = studentName;
		this.registrationId = registrationId;
		this.qualifyingMarks = qualifyingMarks;
		this.courseId = courseId;
		this.hostelRequired = hostelRequired;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public boolean isHostelRequired() {
		return hostelRequired;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void calculateCourseFee() {
		if(this.validateCourseId()) {
			float discount;
			if(this.qualifyingMarks>=85) {
				discount = .15f;
			}
			else if(this.qualifyingMarks>=70) {
				discount = .10f;
			}
			else
				discount = .05f;
			switch(this.courseId) {
			case 1001:
				this.courseFee = 55000*(1-discount);
				break;
			
			case 1002:
				this.courseFee = 35675*(1-discount);
				break;
			
			case 1003:
				this.courseFee = 28300*(1-discount);
				break;
				
			case 1004:
				this.courseFee = 22350*(1-discount);
				break;
				
			case 1005:
				this.courseFee = 115000*(1-discount);
				break;
				
			default:
				System.out.println("Go to hell");
			}
		}
	}
	public boolean validateCourseId() {
		if(this.validateMarks()) {
			boolean isValid = false;
			if(this.courseId < 1006 && this.courseId > 1000) {
				isValid = true;
			}
			return isValid;
		}
		return false;
		
	}
	public boolean validateMarks() {
		if(this.qualifyingMarks > 100) {
			System.out.println("Invalid Marks");
			return false;
		}
		if(this.qualifyingMarks < 65) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		if(this.validateMarks()) {
			if(this.validateCourseId()) {
				return "*******Course Allocation Details*******"
					+"\nStudent Name                 :"+this.getStudentName()
					+"\nCourse Id                    :"+this.getCourseId()
					+"\nQualifying Marks             :"+this.getQualifyingMarks()
					+"\nStudent's Registration Id    :"+this.getRegistrationId()
					+"\nTotal course fee             :"+this.getCourseFee()
					+"\nHostel Required              :"+this.isHostelRequired();
			}
			return "Invalid Course Id. Please try again.";
		}
		return "Marks is less than 65. You are not eligible for admission";
	}

}
