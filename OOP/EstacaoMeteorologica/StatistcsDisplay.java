package EstacaoMeteorologica;

public class StatistcsDisplay implements Observer, DisplayElement{

    private float temperature;
    private WeatherData weatherData;
    
    
    public StatistcsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    public void update(java.util.Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }
    public void display(){
        System.out.println((temperature+5)+"Temp max " + temperature+" Current temp " + (temperature-5) + " min temp");
    }
}
