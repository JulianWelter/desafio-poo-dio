package me.dio.web.desafio.pratico.classes;

import me.dio.web.desafio.pratico.enums.EnrollmentStatus;
import me.dio.web.desafio.pratico.excepitons.NotFoundException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MusicCourseManager {
    Set<Course> courses = new HashSet<>();
    List<Student> students = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();
    List<Payment> payments = new ArrayList<>();
    List<Enrollment> enrollments = new ArrayList<>();

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public void addCourse(Course course) {
        if (courses == null) courses = new HashSet<>();
        courses.add(course);
    }

    public void removeCourse(String name) {
        courses.removeIf(element -> element.getName().equals(name));
    }

    public void listCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void addStudent(Student student) {
        if (students == null) students = new ArrayList<>();
        students.add(student);
    }

    public void removeStudent(String name) {
        students.removeIf(element -> element.getName().equals(name));
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addTeacher(Teacher teacher) {
        if (teachers == null) teachers = new ArrayList<>();
        teachers.add(teacher);
    }

    public void removeTeacher(String name) {
        teachers.removeIf(element -> element.getName().equals(name));
    }

    public void listTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void makePayment(Double incomePayment, String name) {
        Student student = findStudent(name);
        if (student == null) throw new NotFoundException(name);
        if (!student.getCourses().isEmpty()) {
            Double sumPrices = 0D;
            for (Course course : student.getCourses()) {
                sumPrices += course.getPrice();
            }
            System.out.println("sumPrices = " + sumPrices + " incomePayment = " + incomePayment + " name = " + name);
            if (incomePayment >= sumPrices) {
                if (payments == null) payments = new ArrayList<>();
                payments.add(new Payment(student, student.getCourses(), LocalDateTime.now(), incomePayment));
            } else {
                throw new RuntimeException("It was not possible to process the payment.");
            }
        }
    }

    public void makePayment(Double incomePayment, Student student) {
        if (student == null) throw new NotFoundException("");
        if (!student.getCourses().isEmpty()) {
            Double sumPrices = 0D;
            for (Course course : student.getCourses()) {
                sumPrices += course.getPrice();
            }
            if (incomePayment >= sumPrices) {
                if (payments == null) payments = new ArrayList<>();
                payments.add(new Payment(student, student.getCourses(), LocalDateTime.now(), incomePayment));
            } else {
                throw new RuntimeException("It was not possible to process the payment.");
            }
        }
    }

    public void listPayments() {
        for (Payment payment : payments) {
            System.out.println(payment);
        }
    }

    public void makeEnrollment(Student student, Course course) {
        student.getCourses().add(course);
        if (enrollments == null) enrollments = new ArrayList<>();
        enrollments.add(new Enrollment(student,course, LocalDateTime.now(), EnrollmentStatus.ACTIVE));
    }

    public void listEnrollments() {
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }

    private Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name))
                return student;
        }
        return null;
    }
}
