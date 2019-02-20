package patterns.flyweight;

public class Rifleman {
    private int x;
    private int y;
    private int hpLeft;
    private UnitStats riflemanUnitStats;

    public Rifleman(int x, int y) {
        this.riflemanUnitStats = UnitStatsRepository.getRiflemanUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = riflemanUnitStats.getHp();
    }
}
