/**
 * 
 */
package com.tcs.dao;

import java.util.List;

import com.tcs.model.Course;
import com.tcs.model.Professor;
import com.tcs.model.ReportCard;

/**
 * @author springuser21
 *
 */
public interface AdminDao {
	
	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */
	
	public List<Professor> listProfessor();

	public Professor add(Professor professor);

	public ReportCard generateCard(Integer studentId);

	public Course add(Course course);

	public Course delete(Integer courseid);

}
