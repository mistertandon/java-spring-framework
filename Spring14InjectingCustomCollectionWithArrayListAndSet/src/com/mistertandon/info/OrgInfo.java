package com.mistertandon.info;

import java.util.List;
import java.util.Set;

import com.mistertandon.model.Student;

public class OrgInfo {

	private Student studentArr[] = new Student[2];

	private List<Student> studentList;

	private Set<Student> studentSet;

	public Student[] getStudentArr() {
		return studentArr;
	}

	public void setStudentArr(Student[] studentArr) {
		this.studentArr = studentArr;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Set<Student> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}

}
