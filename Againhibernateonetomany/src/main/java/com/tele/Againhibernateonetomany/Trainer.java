package com.tele.Againhibernateonetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table
public class Trainer {
 @Id
 @MapKeyJoinColumn
 private int Teacher_Id;
 private String Teacher_Name;
 @OneToMany(cascade=CascadeType.ALL)
 List<Courses> courses= new ArrayList<>();
 public int getTeacher_Id() {
	return Teacher_Id;
}
 public void setTeacher_Id(int teacher_Id) {
	Teacher_Id = teacher_Id;
}
 public String getTeacher_Name() {
	return Teacher_Name;
}
 public void setTeacher_Name(String teacher_Name) {
	Teacher_Name = teacher_Name;
}
 public List<Courses> getCourses() {
	return courses;
}
 public void setCourses(List<Courses> courses) {
	this.courses = courses;
}


}
