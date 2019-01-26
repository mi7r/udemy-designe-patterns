package patterns.weather;

import patterns.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    private int windForce;
    private WindDirection windDirection;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public WeatherForecast(int temperature, int pressure, int windForce, WindDirection windDirection) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.windForce = windForce;
        this.windDirection = windDirection;
    }

    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }
    }

    public void updateForecast(int temperature, int pressure, int windForce, WindDirection windDirection) {
        setTemperature(temperature);
        setPressure(pressure);
        setWindForce(windForce);
        setWindDirection(windDirection);
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    private void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getWindForce() {
        return windForce;
    }

    private void setWindForce(int windForce) {
        this.windForce = windForce;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    private void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    public void setRegisteredObservers(Set<Observer> registeredObservers) {
        this.registeredObservers = registeredObservers;
    }
}
