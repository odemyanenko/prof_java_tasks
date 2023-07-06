package lesson11_20230602;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuildingServiceTest {
  private static BuildingService service;
  private static BuildingRepository repository;

  @BeforeAll
  public static void init() {
//        service = new BuildingService(new BuildingRepositoryImpl());
//    MockitoAnnotations.openMocks(this);
    repository = Mockito.mock(BuildingRepository.class);
    Building building1 = new Building("Farm", 1000);
    Building building2 = new Building("Library", 2000);
    Mockito.when(repository.findAll()).thenReturn(Arrays.asList(building1, building2));
    service = new BuildingService(repository);
  }


  @Test
  public void getAllBuildings() {
    List<Building> result = service.getAllBuildings();
    assertEquals(2, result.size());
    assertEquals("Farm", result.get(0).getName());
    assertEquals("Library", result.get(1).getName());
  }

  @Test
  public void removeFarm(){
    service.removeFarm();
    Mockito.verify(repository).deleteByName("Farm");
//        Mockito.verify(repository).deleteByName(any());
  }


  @Test
  public void increaseCost() {
    int amount = 100;
    service.increaseCost(amount);
    List<Building> result = service.getAllBuildings();
    assertEquals(1100, result.get(0).getCost());
    assertEquals(2100, result.get(1).getCost());
    Mockito.verify(repository, Mockito.times(2)).save(Mockito.any(Building.class));
  }
}