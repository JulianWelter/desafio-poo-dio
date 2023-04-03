package me.dio.web.desafio.pratico.excepitons;

public class NotFoundException extends RuntimeException {
    String element;
    public NotFoundException(String element) {
        super(element);
    }

    @Override
    public String toString() {
        return "Element not founded: " + element;
    }
}
