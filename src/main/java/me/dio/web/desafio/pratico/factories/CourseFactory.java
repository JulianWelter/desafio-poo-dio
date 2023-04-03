package me.dio.web.desafio.pratico.factories;

import me.dio.web.desafio.pratico.classes.Course;
import me.dio.web.desafio.pratico.enums.Specialization;

import java.time.Duration;

public class CourseFactory {
    public static Course createCourse(Specialization specialization) {
        switch (specialization) {
            case PIANO:
                return new Course("Piano", Duration.ofHours(1), 100.0, "Aprenda a tocar piano.");
            case VIOLAO:
                return new Course("Violão", Duration.ofHours(1), 80.0, "Aprenda a tocar violão.");
            case BATERIA:
                return new Course("Bateria", Duration.ofHours(1), 120.0, "Aprenda a tocar bateria.");
            case CANTO:
                return new Course("Canto", Duration.ofHours(1), 90.0, "Aprenda a cantar.");
            case DANCA_DE_SALAO:
                return new Course("Dança de Salão", Duration.ofMinutes(90), 150.0, "Aprenda dança de salão.");
            case DANCA_CONTEMPORANEA:
                return new Course("Dança Contemporânea", Duration.ofMinutes(90), 120.0, "Aprenda dança contemporânea.");
            case TEATRO:
                return new Course("Teatro", Duration.ofHours(2), 200.0, "Aprenda a atuar.");
            case PRODUCAO_MUSICAL:
                return new Course("Produção Musical", Duration.ofHours(3), 250.0, "Aprenda a produzir música.");
            default:
                throw new IllegalArgumentException("Especialização inválida: " + specialization);
        }
    }
}
