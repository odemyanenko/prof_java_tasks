Tasks
---
Имеется класс Student с полями name, surname, age. Создать аннотацию @StudentInfo и соответствующий инжектор через рефлексию,
чтобы с их помощью иметь возможность инициализировать переменные типа Student. Например:
public class School {
@StudentInfo(name = "Tom", surname = "Smith", age = 15)
private Student student1;
@StudentInfo(name = "Mary", surname = "Jennings", age = 17)
private Student student2;
}