package org.milan.sbrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentVO {

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "PERCENTAGE")
	private double percentage;

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentVO(int id, String firstName, String lastName, double percentage) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", percentage="
				+ percentage + "]";
	}

}
