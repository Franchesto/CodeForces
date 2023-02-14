package EstacaoMeteorologica;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature = -274;
    private float act;
    private WeatherData weatherData;
    
    
    public ForecastDisplay(WeatherData weatherData){    
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    public void update(java.util.Observable obs, Object arg){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.act = temperature;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }
    public void display(){
        if(act==-274){
            System.out.println("First temp");
        }
        else if(act >= temperature && act < temperature + 4 || act <= temperature && act > temperature - 4)
            System.out.println("Forecast: More of the same");
        else if(act > temperature + 4)
            System.out.println("Improving weather on the way");
        else
            System.out.println("Watch out for cooler, rainy weather");
    }   
}
