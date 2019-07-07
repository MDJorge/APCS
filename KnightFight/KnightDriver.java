/**
 * Shaun Fyffe
 * Driver Class for Knight Fight game
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class KnightDriver {

    public static void main(String[] args) {
        Knight userKnight;
        Enemy enemy;
        Scanner kB = new Scanner(System.in);

        Random r = new Random();
        String userName;
        int userWeapon, userArmor, userHealth, numEnemies, damage;
        boolean playAgain;
        boolean userTurn = true;
        int enemyCount;

        playAgain = true;

        welcome();

        while (playAgain) {
            System.out.printf("Enter the name of your knight: ");
            userName = kB.nextLine();

            userWeapon = userWeaponChoice(kB);
            while (userWeapon < 1 || userWeapon > 4) {
                System.out.println("\nInvalid option. Please re-enter your selection.");
                userWeapon = userWeaponChoice(kB);
            }

            userArmor = userArmorChoice(kB);
            while (userArmor < 1 || userArmor > 5) {
                System.out.println("\nInvalid option. Please re-enter your selection.");
                userWeapon = userWeaponChoice(kB);
            }

            userHealth = 100;
            enemyCount = 0;


            userKnight = new Knight(userName, userWeapon, userArmor, userHealth);

            System.out.printf("%n%s", "How many enemies do you wish to battle? ");
            numEnemies = kB.nextInt();

            for (int i = 0; i < numEnemies; i++) {
                int rEnemy = r.nextInt(3);
                enemy = Enemy.getRandomEnemy(rEnemy);
                System.out.println("\nYour Knight's Details:");
                System.out.println(userKnight.toString(enemyCount));

                System.out.println("\nYour Enemy's Details:");
                System.out.println(enemy.toString());

                int startHealth = userKnight.getHealth();

                preFightPause();

                while (enemy.getHealth() > 0 && userKnight.getHealth() > 0) {
                    if (userTurn) {
                        damage = userKnight.fight(userWeapon);
                        // enemy.takeDamage(damage);
                        try {
                            if (damage >= 0) {
                                System.out.printf("%s received %d damage%n", enemy.getName(), (enemy.getHealth() - enemy.takeDamage(damage)));
                            } else {
                                throw new InvalidDamageException("Damage received cannot be negative.");
                            }
                        } catch (InvalidDamageException e) {
                                System.out.println(e.toString());
                        }
                        if (enemy.getHealth() < 0) {
                            System.out.printf("%s has %d health remaining%n%n", enemy.getName(), 0);
                        } else {
                            System.out.printf("%s has %d health remaining%n%n", enemy.getName(), enemy.getHealth());
                        }
                        userTurn = false;
                    } else {
                        damage = enemy.fight(userArmor);
                        // userKnight.takeDamage(damage);
                        try {
                            if (damage >= 0) {
                                System.out.printf("Sir %s received %d damage%n", userKnight.getName(), (userKnight.getHealth() - userKnight.takeDamage(damage)));
                            } else {
                                throw new InvalidDamageException("Damage received cannot be negative.");
                            }
                        } catch (InvalidDamageException e) {
                            System.out.println(e.toString());
                        }
                        if (userKnight.getHealth() < 0) {
                            System.out.printf("Sir %s has %d health remaining%n%n", userKnight.getName(), 0);
                        } else {
                            System.out.printf("Sir %s has %d health remaining%n%n", userKnight.getName(), userKnight.getHealth());
                        }
                        userTurn = true;
                    }
                }

                enemyCount++;

                if (userKnight.getHealth() > 0 && enemyCount != numEnemies) {
                    System.out.printf("Sir %s has won this round!%n%n", userKnight.getName());
                    System.out.println("Damage received this round: " + (startHealth - userKnight.getHealth()));
                } else if (userKnight.getHealth() > 0 && enemyCount == numEnemies) {
                    System.out.printf("Sir %s has defeated all of his enemies%n%n", userKnight.getName());
                    System.out.println("Summary of results:");
                    System.out.println(userKnight.toString(enemyCount));
                } else {
                    System.out.printf("Sir %s has perished.%n%n", userKnight.getName());
                    System.out.println("Summary of results:");
                    System.out.println(userKnight.toString(enemyCount));
                    break;
                }
            }

            kB.nextLine();

            playAgain = userPlayAgain(kB);
        }
    }

    public static void welcome()
    {
        System.out.printf("%s%n%n", "Welcome to KnightFight! Prepare for battle!");
    }

    private static int userWeaponChoice(Scanner kB) {
        int userWeapon;
        System.out.println("\nPlease select your weapon for battle. (Choose number)");
        System.out.println("1) Long Sword\n2) Battle Axe\n3) Spear\n4) Warhammer");
        System.out.printf("Make your choice my liege: ");
        userWeapon = kB.nextInt();
        return userWeapon;
    }

    private static int userArmorChoice(Scanner kB) {
        int userArmor;
        System.out.println("\nPlease select the armor you wish to wear in battle. (Choose number)");
        System.out.println("1) Cloth\n2) Leather\n3) Metal\n4) Dragon Skin\n5) Spider Silk");
        System.out.printf("Make your choice my liege: ");
        userArmor = kB.nextInt();
        return userArmor;
    }

    private static void preFightPause() {
        System.out.println("Press ENTER when you are ready to fight your enemy!!");
        try {
            BufferedReader begin = new BufferedReader(new InputStreamReader(System.in));
            begin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static boolean userPlayAgain(Scanner kB) {
        boolean playAgain;
        System.out.printf("Would you like to play again? (yes / no): ");
        String nextGame = kB.nextLine().toLowerCase();
        while (!nextGame.equals("yes") && !nextGame.equals("no")) {
            System.out.println("Invalid entry. Please enter yes or no");
            System.out.printf("Would you like to play again? (yes / no): ");
            nextGame = kB.nextLine().toLowerCase();
        }
        if (nextGame.equals("no")) {
            playAgain = false;
            System.exit(0);
        } else {
            playAgain = true;
        }
        return playAgain;
    }

}