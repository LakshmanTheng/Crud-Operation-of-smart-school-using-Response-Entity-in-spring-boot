package com.numetry.entity;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SchoolEntity")
public class SchoolEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//automatically generated id as prymary key
	private Long id;
	// Staff Details
	private String Employeeid=UUID.randomUUID().toString().replace("_", "").substring(0,10).toUpperCase();
	private String Employmentstatus;
	private String staffype;
	private String staffDepartment;
	private String EmploymentCategory;
	private String designation;
	private String qualificationtype;
	private String educationqualification;
	private String accesslevel;
	private String trainedas;
	private String ctetqualified;
	//personal details
	private String firstname;
	private String middlename;
	private String lastname;
	private String mobileno;
	private String emergencyno;
	private String gender;
	private Date dob;
	private String email;
	private String permanantaddress;
	private String currentaddress;
	private String religion;
	//other details
	private String adharno;
	private String panno;
	private Date doj;
	private String staffreferancecode=UUID.randomUUID().toString().replace("_", "").substring(0,10).toUpperCase();
	private String salarytype;
	private String govid;
	private String citizenship;
	public SchoolEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SchoolEntity(Long id, String employeeid, String employmentstatus, String staffype, String staffDepartment,
			String employmentCategory, String designation, String qualificationtype, String educationqualification,
			String accesslevel, String trainedas, String ctetqualified, String firstname, String middlename,
			String lastname, String mobileno, String emergencyno, String gender, Date dob, String email,
			String permanantaddress, String currentaddress, String religion, String adharno, String panno, Date doj,
			String staffreferancecode, String salarytype, String govid, String citizenship) {
		super();
		this.id = id;
		Employeeid = employeeid;
		Employmentstatus = employmentstatus;
		this.staffype = staffype;
		this.staffDepartment = staffDepartment;
		EmploymentCategory = employmentCategory;
		this.designation = designation;
		this.qualificationtype = qualificationtype;
		this.educationqualification = educationqualification;
		this.accesslevel = accesslevel;
		this.trainedas = trainedas;
		this.ctetqualified = ctetqualified;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.mobileno = mobileno;
		this.emergencyno = emergencyno;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.permanantaddress = permanantaddress;
		this.currentaddress = currentaddress;
		this.religion = religion;
		this.adharno = adharno;
		this.panno = panno;
		this.doj = doj;
		this.staffreferancecode = staffreferancecode;
		this.salarytype = salarytype;
		this.govid = govid;
		this.citizenship = citizenship;
	}
	@Override
	public String toString() {
		return "SchoolEntity [id=" + id + ", Employeeid=" + Employeeid + ", Employmentstatus=" + Employmentstatus
				+ ", staffype=" + staffype + ", staffDepartment=" + staffDepartment + ", EmploymentCategory="
				+ EmploymentCategory + ", designation=" + designation + ", qualificationtype=" + qualificationtype
				+ ", educationqualification=" + educationqualification + ", accesslevel=" + accesslevel + ", trainedas="
				+ trainedas + ", ctetqualified=" + ctetqualified + ", firstname=" + firstname + ", middlename="
				+ middlename + ", lastname=" + lastname + ", mobileno=" + mobileno + ", emergencyno=" + emergencyno
				+ ", gender=" + gender + ", dob=" + dob + ", email=" + email + ", permanantaddress=" + permanantaddress
				+ ", currentaddress=" + currentaddress + ", religion=" + religion + ", adharno=" + adharno + ", panno="
				+ panno + ", doj=" + doj + ", staffreferancecode=" + staffreferancecode + ", salarytype=" + salarytype
				+ ", govid=" + govid + ", citizenship=" + citizenship + "]";
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmployeeid() {
		return Employeeid;
	}
	
	public void setEmployeeid(String employeeid) {
		Employeeid = employeeid;
	}
	
	public String getEmploymentstatus() {
		return Employmentstatus;
	}
	
	public void setEmploymentstatus(String employmentstatus) {
		Employmentstatus = employmentstatus;
	}
	
	public String getStaffype() {
		return staffype;
	}
	
	public void setStaffype(String staffype) {
		this.staffype = staffype;
	}
	
	public String getStaffDepartment() {
		return staffDepartment;
	}
	
	public void setStaffDepartment(String staffDepartment) {
		this.staffDepartment = staffDepartment;
	}
	
	public String getEmploymentCategory() {
		return EmploymentCategory;
	}
	
	public void setEmploymentCategory(String employmentCategory) {
		EmploymentCategory = employmentCategory;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getQualificationtype() {
		return qualificationtype;
	}
	
	public void setQualificationtype(String qualificationtype) {
		this.qualificationtype = qualificationtype;
	}
	
	public String getEducationqualification() {
		return educationqualification;
	}
	
	public void setEducationqualification(String educationqualification) {
		this.educationqualification = educationqualification;
	}
	
	public String getAccesslevel() {
		return accesslevel;
	}
	
	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
	}
	
	public String getTrainedas() {
		return trainedas;
	}
	
	public void setTrainedas(String trainedas) {
		this.trainedas = trainedas;
	}
	
	public String getCtetqualified() {
		return ctetqualified;
	}
	
	public void setCtetqualified(String ctetqualified) {
		this.ctetqualified = ctetqualified;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getMiddlename() {
		return middlename;
	}
	
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getMobileno() {
		return mobileno;
	}
	
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	public String getEmergencyno() {
		return emergencyno;
	}
	
	public void setEmergencyno(String emergencyno) {
		this.emergencyno = emergencyno;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPermanantaddress() {
		return permanantaddress;
	}
	
	public void setPermanantaddress(String permanantaddress) {
		this.permanantaddress = permanantaddress;
	}
	
	public String getCurrentaddress() {
		return currentaddress;
	}
	
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
	
	public String getReligion() {
		return religion;
	}
	
	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	public String getAdharno() {
		return adharno;
	}
	
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	
	public String getPanno() {
		return panno;
	}
	
	public void setPanno(String panno) {
		this.panno = panno;
	}
	
	public Date getDoj() {
		return doj;
	}
	
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	public String getStaffreferancecode() {
		return staffreferancecode;
	}
	
	public void setStaffreferancecode(String staffreferancecode) {
		this.staffreferancecode = staffreferancecode;
	}
	
	public String getSalarytype() {
		return salarytype;
	}
	
	public void setSalarytype(String salarytype) {
		this.salarytype = salarytype;
	}
	
	public String getGovid() {
		return govid;
	}
	
	public void setGovid(String govid) {
		this.govid = govid;
	}
	
	public String getCitizenship() {
		return citizenship;
	}
	
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	
}
