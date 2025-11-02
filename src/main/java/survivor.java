public class survivor {
    private String name;
    private int healht;
    private int ammo;

    public survivor() {
        this.name = "Unknown";
        this.healht = 100;
        this.ammo = 0;
    }

    public survivor(String name, int health, int ammo){
        this.name = name;
        this.healht = health;
        this.ammo = ammo;
    }
    public survivor(survivor other){
        this.name = other.name;
        this.healht = other.healht;
        this.ammo = other.ammo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return healht;
    }

    public void setHealth(int health) {
        this.healht = health;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }
    public int damage(int dmg){
        if (dmg<0) dmg=0;
        healht -= dmg;
        if (healht <0) healht =0;
        return healht;
    }
    public int attack(int bullets){
        if (bullets < 0) bullets = 0;
        if (bullets > ammo) bullets = ammo;
        ammo -= bullets;
        return ammo;
    }
    public static survivor betterState(survivor a, survivor b) {
        int scoreA = a.healht + a.ammo;
        int scoreB = b.healht + b.ammo;
        return (scoreA >= scoreB) ? a : b;
    }
    @Override
    public String toString() {
        return "survivor(name: " + name + ", health: " + healht + ", ammo: " + ammo + ")";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof survivor)) return false;
        survivor o = (survivor) other;
        return this.name.equals(o.name) && this.healht == o.healht && this.ammo == o.ammo;
    }

    @Override
    public int hashCode() {
        int h = 17;
        h = 31 * h + name.hashCode();
        h = 31 * h + healht;
        h = 31 * h + ammo;
        return h;
    }
}
