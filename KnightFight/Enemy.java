/**
 * Shaun Fyffe
 * Enemy Abstract Superclass
 * Accesses / modifies common features of enemies
 */
public abstract class Enemy {
    private String enemyName;
    private int enemyHealth;

    public Enemy(String name, int health) {
        enemyName = name;
        enemyHealth = health;
    }

    public void setName(String name) {
        enemyName = name;
    }

    public String getName() {
        return enemyName;
    }

    public void setHealth(int health) { enemyHealth = health; }

    public int getHealth() {
        return enemyHealth;
    }

    public int takeDamage(int damage) {
        return enemyHealth -= damage;
    }

    public static Enemy getRandomEnemy(int randEnemy) {
        Enemy enemy;
        switch (randEnemy) {
            case 0:
                enemy = new Ogre("Ugly Ogre", 100);
                break;
            case 1:
                enemy = new Troll("Grumpy Old Troll", 100);
                break;
            default:
                enemy = new Sorcerer("Silly Sorcerer", 100);
        }
        return enemy;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nHealth: %d", getName(), getHealth());
    }

    public abstract int fight(int armor);

}