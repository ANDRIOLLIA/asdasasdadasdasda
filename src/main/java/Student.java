import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Student implements Comparable<Student>{

    private String name;
    private int age;
    private String email;
    private long phoneNumber;
    private static TreeSet <Student> setStudents = new TreeSet<>();

    public Student(String name, int age, String email, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        setStudents.add(this);
    }


    public static void removeStudent(long phoneNumberForRemoveStudent){
        Iterator<Student> studentIterator = setStudents.iterator();
        while(studentIterator.hasNext()){
            Student currentStudent = studentIterator.next();
            if(currentStudent.getPhoneNumber() == phoneNumberForRemoveStudent){
                studentIterator.remove();
                System.out.println("Студент " + currentStudent.getName() + " удален");
            }
        }
    }

    public static void printSetStudents(){
        for (Student currentStudent : setStudents){
            System.out.println(currentStudent);
        }
    }
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && phoneNumber == student.phoneNumber && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, phoneNumber);
    }

    @Override
    public int compareTo(Student currentStudent) {
        return this.getEmail().compareTo(currentStudent.getEmail());
    }
}