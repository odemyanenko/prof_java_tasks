package lesson1_20230310;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends Human {
  private int classNumber;
  private List<Subject> subjects = new ArrayList<>();

  public int getClassNumber() {
    return classNumber;
  }
  public void setClassNumber(int classNumber) {
    this.classNumber = classNumber;
  }

  public Student(String name, int id, int classNumber) {
    super(name, id);
    this.classNumber = classNumber;
  }

  public List<Subject> getSubjects() {
//    return new ArrayList<String>(subjects);
    return Collections.unmodifiableList(subjects);
  }

  public void setSubjects(List<Subject> subjects) {
    this.subjects = subjects;
  }

  @Override
  public void introduceYourself() {
    System.out.println("I'm a student!");
  }

  @Override
  public void play() {
    System.out.println("Student Play");
  }

  @Override
  public String toString() {
    return "Student{" +
            "classNumber=" + classNumber +
            ", subjects=" + subjects +
            '}';
  }

  public void addSubject(Subject subject){
    if (!this.subjects.contains(subject)){
      this.subjects.add(subject);
    }
  }
}
