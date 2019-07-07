/**
 * Shaun Fyffe
 * Troll subclass
 * Calls Enemy superclass and creates Troll Enemy object
 */

import java.util.Random;

public class Troll extends Enemy {

    private int trollDamage;
    private int trollWeapon;
    Random r = new Random();

    public Troll (String name, int health) {
        super(name, health);
        setTrollWeapon(r.nextInt(3) + 1);
    }

    public void setTrollWeapon(int weapon) {
        trollWeapon = weapon;
    }

    public int getTrollWeapon() {
        return trollWeapon;
    }

    public String weaponToString(int weapon) {
        String stringWeapon;
        switch (weapon) {
            case 1:
                stringWeapon = "Restrung Voodoo Bow";
                break;
            case 2:
                stringWeapon = "Talonblade";
                break;
            case 3:
                stringWeapon = "Hexbelcher Rifle";
                break;
            default:
                stringWeapon = null;
        }
        return stringWeapon;
    }

    @Override
    public int fight(int armor) {
        switch(armor) {
            case 1:
                switch (getTrollWeapon()) {
                    case 1:
                        trollDamage = r.nextInt((6 - 3) + 1) + 3;
                        break;
                    case 2:
                        trollDamage = r.nextInt((10 - 6) + 1) + 6;
                        break;
                    case 3:
                        trollDamage = r.nextInt((15 - 10) + 1) + 10;
                        break;
                    default:
                        trollDamage = 0;
                }
                break;
            case 2:
                switch (getTrollWeapon()) {
                    case 1:
                        trollDamage = r.nextInt((5 - 3) + 1) + 3;
                        break;
                    case 2:
                        trollDamage = r.nextInt((9 - 5) + 1) + 5;
                        break;
                    case 3:
                        trollDamage = r.nextInt((10 - 7) + 1) + 7;
                        break;
                    default:
                        trollDamage = 0;
                }
                break;
            case 3:
                switch (getTrollWeapon()) {
                    case 1:
                        trollDamage = r.nextInt((4 - 3) + 1) + 3;
                        break;
                    case 2:
                        trollDamage = r.nextInt((8 - 4) + 1) + 4;
                        break;
                    case 3:
                        trollDamage = r.nextInt((9 - 5) + 1) + 5;
                        break;
                    default:
                        trollDamage = 0;
                }
                break;
            case 4:
                switch (getTrollWeapon()) {
                    case 1:
                        trollDamage = r.nextInt((3 - 2) + 1) + 2;
                        break;
                    case 2:
                        trollDamage = r.nextInt((7 - 3) + 1) + 3;
                        break;
                    case 3:
                        trollDamage = r.nextInt((8 - 4) + 1) + 4;
                        break;
                    default:
                        trollDamage = 0;
                }
                break;
            case 5:
                switch (getTrollWeapon()) {
                    case 1:
                        trollDamage = r.nextInt((1) + 1);
                        break;
                    case 2:
                        trollDamage = r.nextInt((2 - 1) + 1) + 1;
                        break;
                    case 3:
                        trollDamage = r.nextInt((3 - 2) + 1) + 2;
                        break;
                    default:
                        trollDamage = 0;
                }
                break;
            default:
                trollDamage = 0;
        }
        return trollDamage;
    }

    @Override
    public String toString() {
        return String.format("%s\nWeapon: %s%n", super.toString(), weaponToString(getTrollWeapon()));
    }
}