package com.tele.Againhibernateonetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Courses {
@Id
 private int Course_Id;
 private String Course_Name;
 public int getCourse_Id() {
	return Course_Id;
}
 public void setCourse_Id(int course_Id) {
	Course_Id = course_Id;
}
 public String getCourse_Name() {
	return Course_Name;
}
 public void setCourse_Name(String course_Name) {
	Course_Name = course_Name;
}
 
}
