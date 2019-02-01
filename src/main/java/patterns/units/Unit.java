package patterns.units;

public abstract class Unit {
    private int hp;
    private int exp;
    private int dmgDone;

    Unit(int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmgDone() {
        return dmgDone;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "hp=" + hp +
                ", exp=" + exp +
                ", dmgDone=" + dmgDone +
                '}';
    }
}
