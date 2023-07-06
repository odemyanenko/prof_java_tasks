package lesson15_20230630.hw;

import java.lang.reflect.Field;
import java.util.Optional;

public class School {
  @StudentInfo(name = "Tom", surname = "Smith", age = 15)
  private Student student1;
  @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
  private Student student2;

  public School() {
    Optional<Student> studentOptional1 = getStudentFromAnnotation("student1");
    Optional<Student> studentOptional2 = getStudentFromAnnotation("student2");

    studentOptional1.ifPresent(student -> student1 = student);
    studentOptional2.ifPresent(student -> student2 = student);
  }

  @Override
  public String toString() {
    return "School{" +
            "student1=" + student1 +
            ", student2=" + student2 +
            '}';
  }

  private Optional<Student> getStudentFromAnnotation(String fieldName) {
    Class<? extends School> schoolClass = getClass();
    try {
      Field fieldStudent1 = schoolClass.getDeclaredField(fieldName);
      fieldStudent1.setAccessible(true);
      StudentInfo annotation = fieldStudent1.getAnnotation(StudentInfo.class);
      return Optional.of(new Student(annotation.name(), annotation.surname(), annotation.age()));
    } catch (NoSuchFieldException e) {
      e.getStackTrace();
      return Optional.empty();
    }
  }
}
