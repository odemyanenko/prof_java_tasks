package lesson15_20230630.hw;

/*
Имеется класс Student с полями name, surname, age. Создать аннотацию @StudentInfo и соответствующий инжектор через рефлексию,
чтобы с их помощью иметь возможность инициализировать переменные типа Student. Например:
public class School {
@StudentInfo(name = "Tom", surname = "Smith", age = 15)
private Student student1;
@StudentInfo(name = "Mary", surname = "Jennings", age = 17)
private Student student2;
}
* */

public class SchoolDemo {
  public static void main(String[] args) {
    School school = new School();
    System.out.println(school);
  }
}
