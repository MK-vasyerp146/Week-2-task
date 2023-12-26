package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "Intern")
@Entity
public class VasyERP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Vasy_Intern_Id")
	private int VasyInternId;

	@Column(name = "Intern_Name")
	private String internName;

	@Column(name = "Intern_Deparment")
	private String internDepartment;

	@OneToOne
	private Buddy buddyId;

	public Buddy getBuddyId() {
		return buddyId;
	}

	public void setBuddyId(Buddy buddyId) {
		this.buddyId = buddyId;
	}

	public int getVasyInternId() {
		return VasyInternId;
	}

	public void setVasyInternId(int vasyInternId) {
		VasyInternId = vasyInternId;
	}

	public String getInternName() {
		return internName;
	}

	public void setInternName(String internName) {
		this.internName = internName;
	}

	public String getInternDepartment() {
		return internDepartment;
	}

	public void setInternDepartment(String internDepartment) {
		this.internDepartment = internDepartment;
	}

	@Override
	public String toString() {
		return "VasyERP [VasyInternId=" + VasyInternId + ", internName=" + internName + ", internDepartment="
				+ internDepartment + ", buddyId=" + buddyId + "]";
	}

}
