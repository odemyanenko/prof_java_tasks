package lesson_20230818.task2;

public class FinderCreator {
  public Finder createFinder(String filePath) {
    ParsedCsv parsedCsv = CsvReader.readCsvFile(filePath);
    return new Finder(parsedCsv);
  }
}
