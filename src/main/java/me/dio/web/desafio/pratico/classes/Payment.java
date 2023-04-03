package me.dio.web.desafio.pratico.classes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class Payment {
    private Student student;
    private Set<Course> courses;
    private LocalDateTime date;
    private Double value;

    public Payment() {
    }

    public Payment(Student student, Set<Course> courses, LocalDateTime  date, Double value) {
        this.student = student;
        this.courses = courses;
        this.date = date;
        this.value = value;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Set<Course> getCourse() {
        return courses;
    }

    public void setCourse(Set<Course> courses) {
        this.courses = courses;
    }

    public LocalDateTime  getDate() {
        return date;
    }

    public void setDate(LocalDateTime  date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "student=" + student +
                ", courses=" + courses +
                ", date=" + date +
                ", value=" + value +
                '}';
    }
}
