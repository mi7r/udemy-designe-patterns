package patterns.flight;

public class FlightLeg {
    private String flightStart;
    private String flightEnd;
    private boolean delayed;
    private double price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.flightStart = flightLegBuilder.flightStart;
        this.flightEnd = flightLegBuilder.flightEnd;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "flightStart='" + flightStart + '\'' +
                ", flightEnd='" + flightEnd + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {

        private String flightStart;
        private String flightEnd;
        private boolean delayed;
        private double price;

        public FlightLegBuilder (String flightFrom, String flightEnd) {
            this.flightStart = flightFrom;
            this.flightEnd = flightEnd;
            this.delayed = false;
        }

        public FlightLegBuilder setFlightPrice(double price) {
            this.price = price;
            return this;
        }

        public FlightLeg build(){
            return new FlightLeg(this);
        }

    }
}
