package me.dio.web.desafio.pratico.classes;

import me.dio.web.desafio.pratico.enums.Specialization;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Teacher extends User {
    private Set<Specialization> specializations = new HashSet<>();

    public Teacher() {
    }

    public Teacher(Set<Specialization> specializations) {
        this.specializations = specializations;
    }

    public Teacher(String name, String email, String password, String phone) {
        super(name, email, password, phone);
    }

    public Teacher(String name, String email, String password, String phone, Set<Specialization> specializations) {
        super(name, email, password, phone);
        this.specializations = specializations;
    }

    public Set<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(Set<Specialization> specializations) {
        this.specializations = specializations;
    }

    public void addSpecialization(Specialization specialization) {
        if (specializations == null) {
            specializations = new HashSet<>();
        }
        specializations.add(specialization);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", specializations=" + specializations +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(specializations, teacher.specializations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specializations);
    }
}
