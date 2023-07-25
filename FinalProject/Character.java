
package FinalProject;

public class Character {
    private String name;
    private int health;
    private int damage;
    private boolean isAlive;

    public Character(String name,int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void decreaseHealth(int damage) {
            health -= damage;
            System.out.println(name+" health : "+health);
    }

    public void attack(Character target) {
        int min = 1;
        int max = 20;
        damage = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(name + " attack target for " + damage + " damage!");
        target.decreaseHealth(damage);
    }

    public void heal() {
        int min = 1;
        int max = 10;
        int randomHeal = (int) (Math.random() * (max - min + 1) + min);
        health+=randomHeal;
        System.out.println(name + " heal for " + randomHeal + " HP ");
    }
    public boolean isAlive(){
        return health > 0; 
    }
    public String toString(){
        return "Name : "+name+", Health : "+health;
    }
}
