
package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Buddy")
@Entity
public class Buddy {
	
	@Id
	@Column(name = "Buddy_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int buddyId;

	@Column(name = "Buddy_name")
	private String buddyName;
	
	@Column(name ="Buddy_Department")
	private String buddyDepartment;

	public int getBuddyId() {
		return buddyId;
	}

	public void setBuddyId(int buddyId) {
		this.buddyId = buddyId;
	}

	public String getBuddyName() {
		return buddyName;
	}

	public void setBuddyName(String buddyName) {
		this.buddyName = buddyName;
	}

	public String getBuddyDepartment() {
		return buddyDepartment;
	}

	public void setBuddyDepartment(String buddyDepartment) {
		this.buddyDepartment = buddyDepartment;
	}

	@Override
	public String toString() {
		return "Buddy [buddyId=" + buddyId + ", buddyName=" + buddyName + ", buddyDepartment=" + buddyDepartment + "]";
	}
	
	
}
