package lesson1_20230310;

import java.util.Random;

/*
Superhero battle

- name
- health
- force
- Weapon class - name
			   - force
- Protection class - name
				   - level

методы:
generateRandomSuperHero()
fight()  health =  health - (force1 - force2) / level

* */
public class SuperHero {
  private String name;
  private Double health;
  private int force;
  private Weapon weapon;
  private Protection protection;

  public SuperHero(String name, Double health, int force, Weapon weapon, Protection protection) {
    this.name = name;
    this.health = health;
    this.force = force;
    this.weapon = weapon;
    this.protection = protection;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getHealth() {
    return health;
  }

  public void setHealth(Double health) {
    this.health = health;
  }

  public int getForce() {
    return force;
  }

  public void setForce(int force) {
    this.force = force;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public Protection getProtection() {
    return protection;
  }

  public void setProtection(Protection protection) {
    this.protection = protection;
  }

  @Override
  public String toString() {
    return "SuperHero{" +
            "name='" + name + '\'' +
            ", health=" + health +
            ", force=" + force +
            ", weapon=" + weapon +
            ", protection=" + protection +
            '}';
  }

  public static SuperHero generateRandomSuperHero() {
    Random random = new Random();
    String[] names = {"Batman", "Superman", "Spiderman", "Ivan"};

    return new SuperHero(names[random.nextInt(4)], 100.0, random.nextInt(10),
            new Weapon("Weapon", random.nextInt(20)),
            new Protection("Protection", random.nextInt(1, 6))
            );
  }

  public static void fight(SuperHero hero1, SuperHero hero2) {
    int force1 = hero1.force + hero1.weapon.force;
    int force2 = hero2.force + hero2.weapon.force;
    if (force1 > force2) {
      hero2.health = hero2.health - (force1 - force2)/hero2.protection.level;
      System.out.println(hero1.name + " wins");
      System.out.println(hero2);
    }
    else if (force1 < force2) {
      hero1.health = hero1.health - (force2 - force1)/hero1.protection.level;
      System.out.println(hero2.name + " wins");
      System.out.println(hero1);
    }
    else {
      System.out.println("No one wins. Try again");
    }
  }

  public static class Weapon {
    String name;
    int force;

    public Weapon(String name, int force) {
      this.name = name;
      this.force = force;
    }

    @Override
    public String toString() {
      return "Weapon{" +
              "name='" + name + '\'' +
              ", force=" + force +
              '}';
    }
  }

  public static class Protection {
    String name;
    int level;

    public Protection(String name, int level) {
      this.name = name;
      this.level = level;
    }

    @Override
    public String toString() {
      return "Protection{" +
              "name='" + name + '\'' +
              ", level=" + level +
              '}';
    }
  }
}
