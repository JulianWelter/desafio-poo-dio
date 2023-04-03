package me.dio.web.desafio.pratico.classes;

import java.util.HashSet;
import java.util.Set;

public class Student extends User{
    private Set<Course> courses = new HashSet<>();

    public Student(){
    }

    public Student(String name, String email, String password, String phone, Set<Course> courses) {
        super(name, email, password, phone);
        this.courses = courses;
    }

    public Student(String name, String email, String password, String phone) {
        super(name, email, password, phone);
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", course=" + courses +
                '}';
    }
}
