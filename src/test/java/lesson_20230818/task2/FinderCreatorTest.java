package lesson_20230818.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FinderCreatorTest {
  private static final FinderCreator finderCreator = new FinderCreator();

  @Test
  void shouldFindNothingInEmptyFile() {
    //given
    Finder finder = finderCreator.createFinder("src/test/resources/empty.csv");
    //when
    Integer index = finder.find("name", "123");
    //then
    Assertions.assertNull(index);
  }

  @Test
  void shouldFindIndexInCatalogFile() {
    //given
    Finder finder = finderCreator.createFinder("src/test/resources/catalog.csv");
    //when
    Integer index = finder.find("FACTORY", "Lays#3");
    //then
    Assertions.assertEquals(2, index);
  }

  @Test
  void shouldNotFindIndexInCatalogFile() {
    //given
    Finder finder = finderCreator.createFinder("src/test/resources/catalog.csv");
    //when
    Integer index = finder.find("FACTORY", "Lays#10");
    //then
    Assertions.assertNull(index);
  }
}