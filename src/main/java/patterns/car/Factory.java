package patterns.car;

abstract public class Factory {
    abstract public BMW createBMW(BMWModel bmwModel);
    abstract public Ford createFord(FordModel fordModel);
}
