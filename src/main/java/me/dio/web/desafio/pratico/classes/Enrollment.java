package me.dio.web.desafio.pratico.classes;

import me.dio.web.desafio.pratico.enums.EnrollmentStatus;


import java.time.LocalDateTime;
import java.util.Objects;

public class Enrollment {
    Student student;
    Course course;
    LocalDateTime enrollmentDate;
    EnrollmentStatus status;

    public Enrollment(Student student, Course course, LocalDateTime  enrollmentDate, EnrollmentStatus status) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDateTime getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDateTime  enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    public Boolean isEnrolledInCourse(Student student, Course course) {
        if (this.course != null && this.student != null)
            return Objects.equals(this.student.getName(), student.getName()) && Objects.equals(this.course.getName(), course.getName());
        return false;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "student=" + student +
                ", course=" + course +
                ", enrollmentDate=" + enrollmentDate +
                ", status=" + status +
                '}';
    }
}
