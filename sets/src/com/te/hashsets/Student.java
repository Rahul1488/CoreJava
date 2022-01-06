package com.te.hashsets;

import java.util.Objects;

public class Student {
int id;
String name;
int marks;
public Student(int id, String name, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}
@Override
public int hashCode() {
	return Objects.hash(id, marks, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return id == other.id && marks == other.marks && Objects.equals(name, other.name);
}

}
