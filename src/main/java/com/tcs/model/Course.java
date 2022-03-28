/**
 * 
 */
package com.tcs.model;

/**
 * @author springuser21
 *
 */
public class Course {

	private Integer courseid;
	private String  coursename;
	
	public Integer getCourseid() {
		return courseid;
	}



	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}



	public String getCoursename() {
		return coursename;
	}



	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}



	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename+"]";
	}

}
