/**
 * 
 */
package com.tcs.restcontroller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dao.AdminDao;
import com.tcs.model.Course;
import com.tcs.model.Professor;
import com.tcs.model.ReportCard;

/**
 * @author springuser21
 *
 */
@RestController
public class AdminController {
	
	@Autowired //The meaning of @Autowired is put the dependency injection at the Dao layer
	private AdminDao admindao;

	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/professors")
		@ResponseBody
		public List getProfessors() {
			return admindao.listProfessor();
	}
	

		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/professor")
		@ResponseBody
		public ResponseEntity ProfessorList(@RequestBody Professor professor) {

			professor=admindao.add(professor);
			return new ResponseEntity(professor, HttpStatus.OK);
		}
		
		
		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/courses")
		@ResponseBody
		public ResponseEntity addCourse(@RequestBody Course course) {

			course=admindao.add(course);
			return new ResponseEntity(course, HttpStatus.OK);
		}
		
		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/delete/course/{courseid}")
		@ResponseBody
		public ResponseEntity deleteCourse(@PathVariable("courseid") Integer courseid) {

			if (null==admindao.delete(courseid)) {
				return new ResponseEntity("No student found for CourseID " + courseid, HttpStatus.NOT_FOUND);
			}

			return new ResponseEntity("Deleted Successfully" + " : " + courseid, HttpStatus.OK);

		}
		
		@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/reportcard/{studentId}")
		@ResponseBody
		public ResponseEntity getReport(@PathVariable("studentId")  Integer studentId) {

			ReportCard student = admindao.generateCard(studentId);

			if (student == null){
				return new ResponseEntity("No Report found for ID " + studentId, HttpStatus.NOT_FOUND);
			} else
				return new ResponseEntity(student, HttpStatus.NOT_FOUND);

		}

		


}
