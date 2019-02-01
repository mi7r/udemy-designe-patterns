package patterns.car;

public class CommonwealthFactory extends Factory {

    public BMW createBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case M3:
                return new BMW(2.8, "gasoline", 2016, "LEFT");
            case X5:
                return new BMW(3.0, "diesel", 2016, "LEFT");
            case E36:
                return new BMW(3.6, "LPG", 2016, "LEFT");
            default:
                throw new UnsupportedOperationException("unknown BMW model");
        }

    }

    public Ford createFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX:
                return new Ford(2.5, "gasoline", 2012, "LEFT");
            case FOCUS:
                return new Ford(1.6, "LPG", 2012, "LEFT");
            case TRANSIT:
                return new Ford(2.8, "diesel", 2012, "LEFT");
            default:
                throw new UnsupportedOperationException("unknown Ford model");
        }
    }
}
