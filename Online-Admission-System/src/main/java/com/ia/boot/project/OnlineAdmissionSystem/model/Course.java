package com.ia.boot.project.OnlineAdmissionSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue
	int courseId;
	
	String courseTitle;
	String courseDuration;
	int courseCredits;
	String courseCode;
	
	public Course() {
		super();
	}
	
	public Course(int courseId, String courseTitle, String courseDuration, int courseCredits, String courseCode) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.courseDuration = courseDuration;
		this.courseCredits = courseCredits;
		this.courseCode = courseCode;
	}
	/**
	 * @return the courseID
	 */
	public int getCourseId() {
		return courseId;
	}
	/**
	 * @param courseID the courseID to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the courseTitle
	 */
	public String getCourseTitle() {
		return courseTitle;
	}
	/**
	 * @param courseTitle the courseTitle to set
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	/**
	 * @return the courseDuration
	 */
	public String getCourseDuration() {
		return courseDuration;
	}
	/**
	 * @param courseDuration the courseDuration to set
	 */
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	/**
	 * @return the courseCredits
	 */
	public int getCourseCredits() {
		return courseCredits;
	}
	/**
	 * @param courseCredits the courseCredits to set
	 */
	public void setCourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseCode == null) ? 0 : courseCode.hashCode());
		result = prime * result + courseCredits;
		result = prime * result + ((courseDuration == null) ? 0 : courseDuration.hashCode());
		result = prime * result + courseId;
		result = prime * result + ((courseTitle == null) ? 0 : courseTitle.hashCode());
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
		Course other = (Course) obj;
		if (courseCode == null) {
			if (other.courseCode != null)
				return false;
		} else if (!courseCode.equals(other.courseCode))
			return false;
		if (courseCredits != other.courseCredits)
			return false;
		if (courseDuration == null) {
			if (other.courseDuration != null)
				return false;
		} else if (!courseDuration.equals(other.courseDuration))
			return false;
		if (courseId != other.courseId)
			return false;
		if (courseTitle == null) {
			if (other.courseTitle != null)
				return false;
		} else if (!courseTitle.equals(other.courseTitle))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseId + ", courseTitle=" + courseTitle + ", courseDuration=" + courseDuration
				+ ", courseCredits=" + courseCredits + ", courseCode=" + courseCode + "]";
	}
	
}
