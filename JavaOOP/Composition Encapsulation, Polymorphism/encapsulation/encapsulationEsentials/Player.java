package encapsulation.encapsulationEsentials;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {

        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

    public void restoreHealth(int extraHealth) {

        this.health = this.health + extraHealth;
        if (this.health > 100) {
            System.out.println("Player health is full");
            this.health = 100;
        }
    }
}
