package EstacaoMeteorologica;


public class WeatherStation {
    public static void main(String args[]){
        WeatherData observable = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(observable);
        StatistcsDisplay statistcsDisplay = new StatistcsDisplay(observable);
        ForecastDisplay forecastDisplay = new ForecastDisplay(observable);

        observable.setMeasurements(80, 65, 30.4f);
        observable.setMeasurements(90, 70, 30.4f);
    }
}
