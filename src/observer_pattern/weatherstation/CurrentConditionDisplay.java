package observer_pattern.weatherstation;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temperatrue;
    private float humidity;
    private WeatherData weatherData;


    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    // 화면에 표시
    @Override
    public void display() {
        System.out.println("현재 상태: 온도" + temperatrue  + "F, 습도 " + humidity + "%");

    }


    // 변화되면 Update 호출 - temperature , humidity 자동 업데이트

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatrue = temperature;
        this.humidity = humidity;
        display();
    }

}
