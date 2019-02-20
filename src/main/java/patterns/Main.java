package patterns;

import patterns.flyweight.Destroyer;
import patterns.flyweight.Rifleman;
import patterns.flyweight.Tank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<Object>();

        for (int i = 0; i < 1000000; i++) {
            activeUnits.add(new Rifleman(0, 0));
            activeUnits.add(new Tank(0, 0));
            activeUnits.add(new Destroyer(0, 0));
        }

        System.out.println(activeUnits);
    }
}
