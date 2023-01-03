package Practice;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    String firstname;
    String middlename;
    String lastname;
    int id;

    public Student(String firstname, String middlename, String lastname, int id, int marks) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.id = id;
        this.marks = marks;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    int marks;


    @Override
    public int compareTo(Student o) {
        return this.id- o.id;
    }
}
public class ComparableTo{
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("aarti", "R", "Jadhav", 1, 92));
        al.add(new Student("Rashmi", "P", "Patil", 2, 95));
        al.add(new Student("Pratiksh", "Y", "waghmare", 3, 90));

        Collections.sort(al);
        System.out.println("Student details  after sorting");

        for (Student student : al) {
            System.out.println(student.getFirstname() + " " + student.getMiddlename() + " " + student.getLastname() + " " + student.getId() + " " + student.getMarks());
        }
    }
}

