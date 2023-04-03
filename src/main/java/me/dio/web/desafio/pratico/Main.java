package me.dio.web.desafio.pratico;

import me.dio.web.desafio.pratico.classes.Course;
import me.dio.web.desafio.pratico.classes.MusicCourseManager;
import me.dio.web.desafio.pratico.classes.Student;
import me.dio.web.desafio.pratico.classes.Teacher;

import java.time.Duration;
import java.util.Random;

import static me.dio.web.desafio.pratico.enums.Specialization.*;
import static me.dio.web.desafio.pratico.factories.CourseFactory.createCourse;
import static me.dio.web.desafio.pratico.factories.StudentFactory.createStudent;
import static me.dio.web.desafio.pratico.factories.TeacherFactory.createTeacher;

public class Main {
    public static void main(String[] args) {
        MusicCourseManager musicCourseManager = new MusicCourseManager();

        createAndSetCourse(musicCourseManager);
//        musicCourseManager.listCourses();
        musicCourseManager.removeCourse("toBeRemoved");
//        System.out.println("");
//        musicCourseManager.listCourses();

        createAndSetStudant(musicCourseManager);
//        musicCourseManager.listStudents();
        musicCourseManager.removeStudent("toBeRemoved");
//        System.out.println("");
//        musicCourseManager.listStudents();

        createAndSetTeacher(musicCourseManager);
//        musicCourseManager.listTeachers();
        musicCourseManager.removeTeacher("toBeRemoved");
//        System.out.println("");
//        musicCourseManager.listTeachers();

        for (Course course: musicCourseManager.getCourses()) {
            musicCourseManager.makeEnrollment(musicCourseManager.getStudents().get(generateRandomNumber()),course);
        }

        musicCourseManager.listStudents();
        musicCourseManager.makePayment(2500.00,"Lucas Silva");
        musicCourseManager.makePayment(1500.00,"Julia Souza");
        musicCourseManager.makePayment(2000.00,"Felipe Santos");
        musicCourseManager.makePayment(3000.00,"Carla Lima");
        musicCourseManager.makePayment(5000.00,"Bob Johnson");
        musicCourseManager.makePayment(1000.00,"Alice Lee");
        musicCourseManager.makePayment(4000.00,"John Doe");
        musicCourseManager.makePayment(2500.00,"Mary Smith");

    }

    private static void createAndSetCourse(MusicCourseManager musicCourseManager) {
        Course piano = createCourse(PIANO);
        Course guitar = createCourse(VIOLAO);
        Course drums = createCourse(BATERIA);
        Course vocals = createCourse(CANTO);
        Course ballroomDance = createCourse(DANCA_DE_SALAO);
        Course contemporaryDance = createCourse(DANCA_CONTEMPORANEA);
        Course theater = createCourse(TEATRO);
        Course musicProduction = createCourse(PRODUCAO_MUSICAL);
        Course toBeRemoved = new Course("toBeRemoved", Duration.ofHours(3), 250.0, "Curso que sera removido.");

        musicCourseManager.addCourse(piano);
        musicCourseManager.addCourse(guitar);
        musicCourseManager.addCourse(drums);
        musicCourseManager.addCourse(vocals);
        musicCourseManager.addCourse(ballroomDance);
        musicCourseManager.addCourse(contemporaryDance);
        musicCourseManager.addCourse(theater);
        musicCourseManager.addCourse(musicProduction);
        musicCourseManager.addCourse(musicProduction);
        musicCourseManager.addCourse(toBeRemoved);
    }

    private static void createAndSetStudant(MusicCourseManager musicCourseManager) {
        Student lucas = createStudent("Lucas Silva", "lucas.silva@gmail.com", "123456", "(11) 99999-8888");
        Student julia = createStudent("Julia Souza", "julia.souza@gmail.com", "abcdef", "(11) 98888-7777");
        Student felipe = createStudent("Felipe Santos", "felipe.santos@gmail.com", "abc123", "(11) 97777-6666");
        Student carla = createStudent("Carla Lima", "carla.lima@gmail.com", "def456", "(11) 96666-5555");
        Student bob = createStudent("Bob Johnson", "bob@gmail.com", "password", "555-9876");
        Student alice = createStudent("Alice Lee", "alice@gmail.com", "qwerty", "555-4321");
        Student john = createStudent("John Doe", "john@gmail.com", "123456", "555-1234");
        Student mary = createStudent("Mary Smith", "mary@gmail.com", "abcdef", "555-5678");
        Student toBeRemoved = createStudent("toBeRemoved", "toBeRemoved@gmail.com", "abcdef", "444-5678");

        musicCourseManager.addStudent(lucas);
        musicCourseManager.addStudent(julia);
        musicCourseManager.addStudent(felipe);
        musicCourseManager.addStudent(carla);
        musicCourseManager.addStudent(bob);
        musicCourseManager.addStudent(alice);
        musicCourseManager.addStudent(john);
        musicCourseManager.addStudent(mary);
        musicCourseManager.addStudent(toBeRemoved);
    }

    private static void createAndSetTeacher(MusicCourseManager musicCourseManager) {
        Teacher pianoTeacher = createTeacher("John Doe", "johndoe@email.com",
                "123456", "999999999", PIANO);
        Teacher violaoTeacher = createTeacher("Maria Silva", "mariasilva@email.com",
                "abcdef", "888888888", VIOLAO);
        Teacher bateriaTeacher = createTeacher("Peter Parker", "peterparker@email.com",
                "ghijkl", "777777777", BATERIA);
        Teacher cantoTeacher = createTeacher("Ana Souza", "anasouza@email.com",
                "mnopqr", "666666666", CANTO);
        Teacher dancaDeSalaoTeacher = createTeacher("Lucas Santos", "lucassantos@email.com",
                "stuvwx", "555555555", DANCA_DE_SALAO);
        Teacher dancaContemporaneaTeacher = createTeacher("Julia Rodrigues", "juliarodrigues@email.com",
                "yzabcd", "444444444", DANCA_CONTEMPORANEA);
        Teacher teatroTeacher = createTeacher("Paulo Oliveira", "paulooliveira@email.com",
                "efghij", "333333333", TEATRO);
        Teacher producaoMusicalTeacher = createTeacher("Mariana Garcia", "marianagarcia@email.com",
                "klmnop", "222222222", PRODUCAO_MUSICAL);
        Teacher toBeRemoved = createTeacher("toBeRemoved", "toBeRemoved@gmail.com", "abcdef", "44444444444444", PRODUCAO_MUSICAL);

        musicCourseManager.addTeacher(pianoTeacher);
        musicCourseManager.addTeacher(violaoTeacher);
        musicCourseManager.addTeacher(bateriaTeacher);
        musicCourseManager.addTeacher(cantoTeacher);
        musicCourseManager.addTeacher(dancaDeSalaoTeacher);
        musicCourseManager.addTeacher(dancaContemporaneaTeacher);
        musicCourseManager.addTeacher(teatroTeacher);
        musicCourseManager.addTeacher(producaoMusicalTeacher);
        musicCourseManager.addTeacher(toBeRemoved);
    }

    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(8);
    }

}
