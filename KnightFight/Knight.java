/**
 * Shaun Fyffe
 * Knight Class
 * Sets and gets knights' attributes, displays attributes, and determines amount of damage inflicted
 */

import java.util.Random;

public class Knight {

    private static String knightName;
    private static int knightWeapon, knightArmor, knightHealth;
    private static Random r = new Random();

    public Knight(String name, int weapon, int armor, int health) {
        knightName = name;
        knightWeapon = weapon;
        knightArmor = armor;
        knightHealth = health;
    }

    public void setName(String name)
    {
        knightName = name;
    }

    public void setWeapon(int weapon) { knightWeapon = weapon; }

    public void setArmor(int armor) { knightArmor = armor; }

    public void setHealth(int health) { knightHealth = health; }

    public String getName()
    {
        return knightName;
    }

    public int getWeapon()
    {
        return knightWeapon;
    }

    public int getArmor()
    {
        return knightArmor;
    }

    public int getHealth()
    {
        return knightHealth;
    }

    public int takeDamage(int damage) {
        knightHealth -= damage;
        return knightHealth;
    }

    public String healthToString() {
        String stringHealth;
        if (getHealth() >= 0) {
            stringHealth = "Health: " + getHealth();
        } else {
            stringHealth = "Health: " + 0;
        }
        return stringHealth;
    }

    public String weaponToString(int weapon) {
        String stringWeapon;
        switch(weapon) {
            case 1:
                stringWeapon = "Long Sword";
                break;
            case 2:
                stringWeapon = "Battle Axe";
                break;
            case 3:
                stringWeapon = "Spear";
                break;
            case 4:
                stringWeapon = "Warhammer";
                break;
            default:
                stringWeapon = "Bare Hands";
        }
        return stringWeapon;
    }

    public String armorToString(int armor) {
        String armorString;
        switch(armor) {
            case 1:
                armorString = "Cloth";
                break;
            case 2:
                armorString = "Leather";
                break;
            case 3:
                armorString = "Metal";
                break;
            case 4:
                armorString = "Dragon Skin";
                break;
            case 5:
                armorString = "Spider Silk";
                break;
            default:
                armorString = "No armor";
        }
        return armorString;
    }

    public String winCountStr(int enemies) {
        String winCountStr;
        if (getHealth() > 0) {
            winCountStr = "Number of Enemies Defeated: " + enemies;
        } else {
            winCountStr = "Number of Enemies Defeated: " + (enemies - 1);
        }
        return winCountStr;
    }

    // Uncomment negative damage to test InvalidDamageException
    public int fight(int weapon) {
        int damage;
        switch (weapon) {
            case 1:
                damage = r.nextInt((7 - 2) + 1) + 2;
                // damage = -10;
                break;
            case 2:
                damage = r.nextInt((12 - 7) + 1) + 7;
                // damage = -10;
                break;
            case 3:
                damage = r.nextInt((10 - 5) + 1) + 5;
                // damage = -10;
                break;
            case 4:
                damage = r.nextInt((15 - 10) + 1) + 10;
                // damage = -10;
                break;
            default:
                damage = 0;
            }
        return damage;
    }

    public String toString(int enemies) {
        return String.format("Name: Sir %s%n%s%nWeapon: %s%nArmor: %s%n%s", getName(),
                healthToString(), weaponToString(getWeapon()), armorToString(getArmor()), winCountStr(enemies));
    }
}