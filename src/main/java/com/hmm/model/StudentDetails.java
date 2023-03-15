package com.hmm.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	private String student_firstName;
	private String student_lastName;
	private String student_mailId;
	private String student_contact;
	private Date student_dob;
    private String student_gender;
    private String student_profilePicture;
    private String schoolName;
	private String jrCollegeName;
	private String srCollegeName;
	@OneToMany(cascade=CascadeType.ALL)
	private List<UserPost> userPosts =new ArrayList<>();
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_firstName() {
		return student_firstName;
	}
	public void setStudent_firstName(String student_firstName) {
		this.student_firstName = student_firstName;
	}
	public String getStudent_lastName() {
		return student_lastName;
	}
	public void setStudent_lastName(String student_lastName) {
		this.student_lastName = student_lastName;
	}
	public String getStudent_mailId() {
		return student_mailId;
	}
	public void setStudent_mailId(String student_mailId) {
		this.student_mailId = student_mailId;
	}
	public String getStudent_contact() {
		return student_contact;
	}
	public void setStudent_contact(String student_contact) {
		this.student_contact = student_contact;
	}
	public Date getStudent_dob() {
		return student_dob;
	}
	public void setStudent_dob(Date student_dob) {
		this.student_dob = student_dob;
	}
	public String getStudent_gender() {
		return student_gender;
	}
	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}
	public String getStudent_profilePicture() {
		return student_profilePicture;
	}
	public void setStudent_profilePicture(String student_profilePicture) {
		this.student_profilePicture = student_profilePicture;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getJrCollegeName() {
		return jrCollegeName;
	}
	public void setJrCollegeName(String jrCollegeName) {
		this.jrCollegeName = jrCollegeName;
	}
	public String getSrCollegeName() {
		return srCollegeName;
	}
	public void setSrCollegeName(String srCollegeName) {
		this.srCollegeName = srCollegeName;
	}
	public List<UserPost> getUserPosts() {
		return userPosts;
	}
	public void setUserPosts(List<UserPost> userPosts) {
		this.userPosts = userPosts;
	}
	
	
	@Override
	public String toString() {
		return "StudentDetails [student_id=" + student_id + ", student_firstName=" + student_firstName
				+ ", student_lastName=" + student_lastName + ", student_mailId=" + student_mailId + ", student_contact="
				+ student_contact + ", student_dob=" + student_dob + ", student_gender=" + student_gender
				+ ", student_profilePicture=" + student_profilePicture + ", schoolName=" + schoolName
				+ ", jrCollegeName=" + jrCollegeName + ", srCollegeName=" + srCollegeName + "]";
	}
}
