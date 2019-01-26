package patterns.notification;

import patterns.weather.WeatherForecast;

public class InternetNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet said that tomorrow weather will be:" + weatherForecast.getTemperature() +
                "C, wind force: " + weatherForecast.getWindForce() +
                "KT from: " + weatherForecast.getWindDirection());
    }
}
