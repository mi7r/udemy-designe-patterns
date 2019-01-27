package patterns;

import patterns.house.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildWalls("6walls")
                .buildRoof("1roof")
                .buildWindows("4windows")
                .buildRooms("2rooms")
                .build();

        System.out.println(house);
    }
}
