/**
 * Shaun Fyffe
 * Sorcerer subclass
 * Calls Enemy superclass and creates Sorcerer Enemy object
 */

import java.util.Random;

public class Sorcerer extends Enemy {

    private int sorcererDamage;
    private int sorcererWeapon;
    Random r = new Random();

    public Sorcerer (String name, int health) {
        super(name, health);
        setSorcererWeapon(r.nextInt(3) + 1);
    }

    public void setSorcererWeapon(int weapon) {
        sorcererWeapon = weapon;
    }

    public int getSorcererWeapon() {
        return sorcererWeapon;
    }

    public String weaponToString(int weapon) {
        String stringWeapon;
        switch(weapon) {
            case 1:
                stringWeapon = "Dagger";
                break;
            case 2:
                stringWeapon = "Short Spear";
                break;
            case 3:
                stringWeapon = "Black Magic";
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
                switch (getSorcererWeapon()) {
                    case 1:
                        sorcererDamage = r.nextInt((9 - 6) + 1) + 6;
                        break;
                    case 2:
                        sorcererDamage = r.nextInt((12 - 9) + 1) + 9;
                        break;
                    case 3:
                        sorcererDamage = r.nextInt((18 - 12) + 1) + 12;
                        break;
                    default:
                        sorcererDamage = 0;
                }
                break;
            case 2:
                switch (getSorcererWeapon()) {
                    case 1:
                        sorcererDamage = r.nextInt((7 - 5) + 1) + 5;
                        break;
                    case 2:
                        sorcererDamage = r.nextInt((10 - 8) + 1) + 8;
                        break;
                    case 3:
                        sorcererDamage = r.nextInt((13 - 10) + 1) + 10;
                        break;
                    default:
                        sorcererDamage = 0;
                }
                break;
            case 3:
                switch (getSorcererWeapon()) {
                    case 1:
                        sorcererDamage = r.nextInt((6 - 4) + 1) + 4;
                        break;
                    case 2:
                        sorcererDamage = r.nextInt((8 - 6) + 1) + 6;
                        break;
                    case 3:
                        sorcererDamage = r.nextInt((10 - 8) + 1) + 8;
                        break;
                    default:
                        sorcererDamage = 0;
                }
                break;
            case 4:
                switch (getSorcererWeapon()) {
                    case 1:
                        sorcererDamage = r.nextInt((4 - 2) + 1) + 2;
                        break;
                    case 2:
                        sorcererDamage = r.nextInt((6 - 4) + 1) + 4;
                        break;
                    case 3:
                        sorcererDamage = r.nextInt((7 - 5) + 1) + 5;
                        break;
                    default:
                        sorcererDamage = 0;
                }
                break;
            case 5:
                switch (getSorcererWeapon()) {
                    case 1:
                        sorcererDamage = r.nextInt((1) + 1);
                        break;
                    case 2:
                        sorcererDamage = r.nextInt((2 - 1) + 1) + 1;
                        break;
                    case 3:
                        sorcererDamage = r.nextInt((3 - 2) + 1) + 2;
                        break;
                    default:
                        sorcererDamage = 0;
                }
                break;
            default:
                sorcererDamage = 0;
        }
        return sorcererDamage;
    }

    @Override
    public String toString() {
        return String.format("%s\nWeapon: %s%n", super.toString(), weaponToString(getSorcererWeapon()));
    }
}