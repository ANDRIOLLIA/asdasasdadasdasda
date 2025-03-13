import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Student firstStudent = new Student("Владислав", 21, "vladshokolad@gmail.com", 88005553555l);
        Student secondStudent = new Student("Михаил", 20, "shershen2281337@gmail.com", 88121488777l);
        Student thirdStudent = new Student("Артем", 20, "artem1337@gmail.com", 88121488777l);

        Student.removeStudent(88121488777l);
        Student.printSetStudents();
    }
}