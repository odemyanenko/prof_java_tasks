package lesson1_20230310;

import java.util.List;

public class Teacher extends Human implements Teachable {
  private Subject subject;

  public Teacher(String name, int id, Subject subject) {
    super(name, id);
    this.subject = subject;
  }

  public Subject getSubject() {
    return subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  @Override
  public void introduceYourself() {
    System.out.println("I'm a teacher!");
  }

  public void teach(Student student){
    List<Subject> subjects = student.getSubjects();
    student.addSubject(this.subject);
    System.out.println("Teacher " + this.getName() + " teach student " + student.getName() + " -> subject " + this.subject);
  }

  @Override
  public void teach(Student... students) {
    for (Student s : students
    ) {
      this.teach(s);
    }
  }

  @Override
  public void play() {
    System.out.println("Teacher Play!");
  }
}
