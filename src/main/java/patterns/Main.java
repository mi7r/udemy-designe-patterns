package patterns;

import patterns.units.Rifleman;
import patterns.units.Tank;
import patterns.units.Unit;

public class Main {
    public static void main(String[] args) {
        Unit tank = new Tank(2000, 0, 50);
        Unit rifleman = new Rifleman(200, 1,15);
    }
}
