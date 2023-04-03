package me.dio.web.desafio.pratico.classes;

import java.time.Duration;
import java.util.Objects;

public class Course {
    private String name;
    private Duration duration;
    private Double price;
    private String description;

    public Course() {
    }

    public Course(String name, Duration duration, Double price, String description) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", duration=" + duration.toString().replace("PT", "") +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && Objects.equals(duration, course.duration) && Objects.equals(price, course.price) && Objects.equals(description, course.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, price, description);
    }
}
