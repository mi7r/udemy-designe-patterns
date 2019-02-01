package patterns;

import patterns.flight.FlightLeg;

public class Main {
    public static void main(String[] args) {
        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder()
                .setFlightStart("Gdansk")
                .setFlightEnd("Wrocław")
                .setFlightPrice(499.90)
                .build();

        System.out.println(flightLeg);

        FlightLeg flightLeg1 = new FlightLeg.FlightLegBuilder()
                .setFlightStart("Wrocław")
                .setFlightEnd("Gdańsk")
                .setFlightPrice(99.99)
                .setDelayedStatus(true)
                .build();

        System.out.println(flightLeg1);
    }
}
