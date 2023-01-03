package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparator<Student> {
    String firstname;
    String middlename;
    String lastname;

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

    public Student1(String firstname, String middlename, String lastname, int id, int marks) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.id = id;
        this.marks = marks;
    }

    int id;
    int marks;

    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks- o2.marks;
    }
}
class FirstNameComparator implements Comparator<Student1>{


    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.firstname.compareTo(o2.firstname);
    }
}
class MiddleNameComparator<S> implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.middlename.compareTo(o2.middlename);
    }
}
class LastNameComparator<S> implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.lastname.compareTo(o2.lastname);
    }
}
class IdComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.id - o2.id;
    }
}

public class ComparatorExam {
    public static void main(String[] args) {
      List<Student1> l= new ArrayList<>();
      l.add(new Student1("Ritika","Raj","Patil",1,85));
      l.add(new Student1("Pratik","Ram","Yadav",2,91));
      l.add(new Student1("savi","kartik","jadhav",3,90));
      l.add(new Student1("raj","Manish","mahajan",4,87));
      Collections.sort(l, new Comparator<Student1>() {
          @Override
          public int compare(Student1 o1, Student1 o2) {
              return o1.firstname.compareTo(o2.firstname);
          }
      });
      for(Student1 student1 :l){
          System.out.println(student1.firstname);
      }
      Collections.sort(l, new MiddleNameComparator<Student1>() {

          @Override
          public int compare(Student1 o1, Student1 o2) {
              return o1.middlename.compareTo(o2.middlename);
          }
      });
        for(Student1 student1 :l){
            System.out.println(student1.middlename);
        }

        Collections.sort(l, new LastNameComparator<Student1>() {

            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.lastname.compareTo(o2.lastname);
            }
        });
        for(Student1 student1 :l){
            System.out.println(student1.lastname);
        }


    }
}
