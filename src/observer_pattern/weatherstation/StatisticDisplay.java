package observer_pattern.weatherstation;

public class StatisticDisplay implements Observer, DisplayElement{
    // 최고온도와 최저온도를 업데이트하고 평균 온도를 측정하는 것이 목표
    //상태
    private float temperature;
    private float maxTemp;
    private float minTemp;
    private float meanTemp;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        // 주제를 받아오고 Observer 선언
        weatherData.registerObserver(this);
        this.maxTemp=0;
        this.minTemp=Integer.MAX_VALUE;

    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = "+ meanTemp+"/" + maxTemp +"/" + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        calculateMinTemp();
        calculateMaxTemp();
        meanTemp = (float) ((maxTemp + minTemp)/2.0);
        // 변경 내용을 디스플레이
        display();
    }

    private void calculateMinTemp() {
        if(minTemp > temperature) {
            this.minTemp = temperature;
        }
    }

    private void calculateMaxTemp() {
        if(maxTemp < temperature){
            this.maxTemp = temperature;
        }

    }
}
