package patterns.notification;

import patterns.weather.WeatherForecast;

public class RadioNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio News said that tomorrow weather will be:" + weatherForecast.getTemperature() +
                "C, wind force: " + weatherForecast.getWindForce() +
                "KT from: " + weatherForecast.getWindDirection());
    }
}
