package lesson1_20230310;

public class School {
  public static void main(String[] args) {
//    Teacher teacher = new Teacher("Mr. Thomson", 1, "Maths");
    Teacher teacherMath = new Teacher("Mr. Thomson", 1, Subject.MATH);
    Teacher teacherHistory = new Teacher("Ms. Weise", 2, Subject.HISTORY);
    Student student = new Student("Peter", 2, 5);
    Student student2 = new Student("Kolya", 3, 4);
    Cat cat = new Cat("Murzik");

    teacherMath.sayHello();
    teacherMath.introduceYourself();
    teacherMath.play();

    System.out.println("--------------------------");
    teacherHistory.sayHello();
    teacherHistory.introduceYourself();
    teacherHistory.play();
    System.out.println("--------------------------");

    student.sayHello();
    student.introduceYourself();
    student.play();
    System.out.println("--------------------------");
    student2.sayHello();
    student2.introduceYourself();
    student2.play();

    teacherMath.teach(student);
    teacherHistory.teach(student, student2);

    cat.play();
    System.out.println("-----------------------------------");
    restTime(teacherMath, student, cat);
    System.out.println("-----------------------------------");
    System.out.println(student);
    System.out.println(student2);
  }

  private static void restTime(Playable... players) {
    for (Playable p : players
    ) {
      p.play();
    }
  }
}
