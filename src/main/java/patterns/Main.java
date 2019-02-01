package patterns;

import patterns.flight.FlightLeg;

public class Main {
    public static void main(String[] args) {
        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder("Wrocław", "Gdańsk")
                .setFlightPrice(499.90).build();

        System.out.println(flightLeg);

        FlightLeg flightLeg1 = new FlightLeg.FlightLegBuilder("Gdańsk", "Wrocław")
                .setFlightPrice(99.99).build();

        System.out.println(flightLeg1);
    }
}
