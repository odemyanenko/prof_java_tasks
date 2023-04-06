package lesson1_20230310;

import static lesson1_20230310.SuperHero.fight;

public class UseSuperHero {
  public static void main(String[] args) {
    SuperHero superHero1 = SuperHero.generateRandomSuperHero();
    SuperHero superHero2 = SuperHero.generateRandomSuperHero();

    System.out.println(superHero1);
    System.out.println(superHero2);
    System.out.println("=====");
    fight(superHero1,superHero2);
    System.out.println("=====");
    System.out.println(superHero1);
    System.out.println(superHero2);
  }
}
