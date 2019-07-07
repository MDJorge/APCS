/**
 * Shaun Fyffe
 * Ogre subclass
 * Calls Enemy superclass and creates Ogre Enemy object
 */

import java.util.Random;

public class Ogre extends Enemy {

    private int ogreDamage;
    private int ogreWeapon;
    Random r = new Random();

    public Ogre (String name, int health) {
        super(name, health);
        setOgreWeapon(r.nextInt(3) + 1);
    }

    public void setOgreWeapon(int weapon) {
        ogreWeapon = weapon;
    }

    public int getOgreWeapon() {
        return ogreWeapon;
    }

    public String weaponToString(int weapon) {
        String stringWeapon;
        switch(weapon) {
            case 1:
                stringWeapon = "Stink Breath";
                break;
            case 2:
                stringWeapon = "Ogre Cleaver";
                break;
            case 3:
                stringWeapon = "Ogre Bludgeoner";
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
                switch (getOgreWeapon()) {
                    case 1:
                        ogreDamage = r.nextInt((3 - 1) + 1) + 1;
                        break;
                    case 2:
                        ogreDamage = r.nextInt((8 - 3) + 1) + 3;
                        break;
                    case 3:
                        ogreDamage = r.nextInt((14 - 7) + 1) + 7;
                        break;
                    default:
                        ogreDamage = 0;
                }
                break;
            case 2:
                switch (getOgreWeapon()) {
                    case 1:
                        ogreDamage = r.nextInt((2 - 1) + 1) + 1;
                        break;
                    case 2:
                        ogreDamage = r.nextInt((8 - 3) + 1) + 3;
                        break;
                    case 3:
                        ogreDamage = r.nextInt((12 - 6) + 1) + 6;
                        break;
                    default:
                        ogreDamage = 0;
                }
                break;
            case 3:
                switch (getOgreWeapon()) {
                    case 1:
                        ogreDamage = r.nextInt((2 - 1) + 1) + 1;
                        break;
                    case 2:
                        ogreDamage = r.nextInt((5 - 2) + 1) + 2;
                        break;
                    case 3:
                        ogreDamage = r.nextInt((10 - 5) + 1) + 5;
                        break;
                    default:
                        ogreDamage = 0;
                }
                break;
            case 4:
                switch (getOgreWeapon()) {
                    case 1:
                        ogreDamage = r.nextInt((2 - 1) + 1) + 1;
                        break;
                    case 2:
                        ogreDamage = r.nextInt((4 - 2) + 1) + 2;
                        break;
                    case 3:
                        ogreDamage = r.nextInt((7 - 3) + 1) + 3;
                        break;
                    default:
                        ogreDamage = 0;
                }
                break;
            case 5:
                switch (getOgreWeapon()) {
                    case 1:
                        ogreDamage = r.nextInt((1) + 1);
                        break;
                    case 2:
                        ogreDamage = r.nextInt((2 - 1) + 1) + 1;
                        break;
                    case 3:
                        ogreDamage = r.nextInt((3 - 2) + 1) + 2;
                        break;
                    default:
                        ogreDamage = 0;
                }
                break;
            default:
                ogreDamage = 0;
        }
        return ogreDamage;
    }

    @Override
    public String toString() {
        return String.format("%s\nWeapon: %s%n", super.toString(), weaponToString(getOgreWeapon()));
    }
}