package EstacaoMeteorologica;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData observable;

    public CurrentConditionsDisplay(WeatherData observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(java.util.Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
    public void display(){
        System.out.println("Current Conditions: " + temperature + "F degree and " + humidity +
         "% humidity");
    }
}
