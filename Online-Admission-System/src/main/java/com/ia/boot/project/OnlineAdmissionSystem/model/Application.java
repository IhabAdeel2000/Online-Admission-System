package com.ia.boot.project.OnlineAdmissionSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application")
public class Application {
	@Id
	@GeneratedValue
	int applicationId;
	int courseId;
	int studentId;
	String status;
	
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Application(int applicationId, int courseId, int studentId, String status) {
		super();
		this.applicationId = applicationId;
		this.courseId = courseId;
		this.studentId = studentId;
		this.status = "Pending";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + applicationId;
		result = prime * result + courseId;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Application other = (Application) obj;
		if (applicationId != other.applicationId)
			return false;
		if (courseId != other.courseId)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", courseId=" + courseId + ", studentId=" + studentId
				+ ", status=" + status + "]";
	}
	
	
}
