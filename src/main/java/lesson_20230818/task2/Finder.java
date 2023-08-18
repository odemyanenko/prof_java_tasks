package lesson_20230818.task2;

import java.util.Map;

/*
// На вход дан CSV файл. Требуется написать модуль, который индексирует этот файл и предоставляет метод для поиска
    // индекса по значению
    // RowIndex find(fieldName: String, value: String)
    // , где RowIndex = Integer
* */
public class Finder {
  private final ParsedCsv parsedCsv;

  public Finder(ParsedCsv parsedCsv) {
    this.parsedCsv = parsedCsv;
  }

  public Integer find(String fieldName, String value) {
    Map<String, Integer> map = parsedCsv.getParsedData().get(fieldName);
    if (map != null){
      return map.get(value);
    }
    return null;
  }
}
