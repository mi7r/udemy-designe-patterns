package patterns;

import patterns.notification.InternetNews;
import patterns.notification.RadioNews;
import patterns.notification.TvNews;
import patterns.weather.WeatherForecast;
import patterns.weather.WindDirection;

public class Main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(19, 1020, 25, WindDirection.WEST);
        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(internetNews);
        weatherForecast.unregisterObserver(tvNews);

        weatherForecast.updateForecast(22, 1022, 35, WindDirection.WEST);
    }
}
