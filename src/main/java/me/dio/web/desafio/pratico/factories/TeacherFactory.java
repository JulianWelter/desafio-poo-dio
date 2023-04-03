package me.dio.web.desafio.pratico.factories;

import me.dio.web.desafio.pratico.classes.Teacher;
import me.dio.web.desafio.pratico.enums.Specialization;

import java.util.HashSet;
import java.util.Set;

public class TeacherFactory {
    public static Teacher createTeacher(String name, String email, String password, String phone, Specialization specialization) {
        Teacher teacher = new Teacher(name, email, password, phone);
        Set<Specialization> specializations = new HashSet<>();
        switch(specialization) {
            case PIANO:
                specializations.add(Specialization.PIANO);
                break;
            case VIOLAO:
                specializations.add(Specialization.VIOLAO);
                break;
            case BATERIA:
                specializations.add(Specialization.BATERIA);
                break;
            case CANTO:
                specializations.add(Specialization.CANTO);
                break;
            case DANCA_DE_SALAO:
                specializations.add(Specialization.DANCA_DE_SALAO);
                break;
            case DANCA_CONTEMPORANEA:
                specializations.add(Specialization.DANCA_CONTEMPORANEA);
                break;
            case TEATRO:
                specializations.add(Specialization.TEATRO);
                break;
            case PRODUCAO_MUSICAL:
                specializations.add(Specialization.PRODUCAO_MUSICAL);
                break;
            default:
                throw new IllegalArgumentException("Invalid specialization: " + specialization);
        }
        teacher.setSpecializations(specializations);
        return teacher;
    }
}
