package FinalProject;

public class Enemies {

    private Character[] enemies;

    public Enemies(Character[] enemies) {
        this.enemies = enemies;
    }

    public Character getRandomEnemy() {
        int randEnemy = (int)(Math.random() * enemies.length);
        return enemies[randEnemy];
    }

}
