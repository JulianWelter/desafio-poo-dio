package me.dio.web.desafio.pratico.factories;

import me.dio.web.desafio.pratico.classes.Student;

public class StudentFactory {
    public static Student createStudent(String name, String email, String password, String phone) {
        return new Student(name, email, password, phone);
    }
}
