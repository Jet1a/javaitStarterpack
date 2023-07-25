package FinalProject;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        Character player = new Character("Kratos", 100);

        Character[] enemies = new Character[6];
        enemies[0] = new Character("P'First", 2000000000);
        enemies[1] = new Character("P'Fame", 60);
        enemies[2] = new Character("P'Mark", 50);
        enemies[3] = new Character("P'Tiw", 1);
        enemies[4] = new Character("P'Nine", 80);
        enemies[5] = new Character("P'Game", 70);
        Enemies e1 = new Enemies(enemies);
        // e1.getRandomEnemy();
        Character currentEnemy = e1.getRandomEnemy();
        System.out.println("You are a hunter and your next mission is to defeat " + currentEnemy.getName());
        System.out.println(currentEnemy);
        while (player.isAlive()) {
            System.out.println("------------------------------------");
            System.out.println("Press 1 to attack or 2 to heal");
            System.out.print("Choice : ");
            int choice = sc.nextInt();
            System.out.println("");
            switch (choice) {
                case 1:
                    player.attack(currentEnemy);
                    System.out.println("");
                    break;
                case 2:
                    player.heal();
                    System.out.println("");
                    break;
                default:
                    break;
            }

            if (!player.isAlive()) {
                System.out.println(player.getName() + " Dead!! ----");
                break;
            } else if (!currentEnemy.isAlive()) {
                System.out.println("-------- Enemy Dead!! --------");
                break;
            }
            currentEnemy.attack(player);
        }
    }
}
