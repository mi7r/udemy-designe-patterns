package patterns.notification;

import patterns.weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
