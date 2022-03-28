/**
 * 
 */
package com.tcs.model;


/**
 * @author springuser21
 *
 */
public class Professor {
	
	private Integer pid;
	private String pname;
	private String pemail;
	private Integer pphone;
	
	
	
	
	public Integer getPid() {
		return pid;
	}




	public void setPid(Integer pid) {
		this.pid = pid;
	}




	public String getPname() {
		return pname;
	}




	public void setPname(String pname) {
		this.pname = pname;
	}




	public String getPemail() {
		return pemail;
	}




	public void setPemail(String pemail) {
		this.pemail = pemail;
	}




	public Integer getPphone() {
		return pphone;
	}




	public void setPphone(Integer pphone) {
		this.pphone = pphone;
	}




	@Override
	public String toString() {
		return "Professor [pid=" + pid + ", pname=" + pname + ", pphone=" + pphone +", pemail=" + pemail + "]";
	}

}
