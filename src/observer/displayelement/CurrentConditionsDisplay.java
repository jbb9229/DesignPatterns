package observer.displayelement;

import observer.observer.Observer;
import observer.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 생성자에 weatherData라는 주제 객체가 전달되며,
     * 그 객체를 써서 디스플레이를 옵저버로 등록한다.
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * update 가 호출되면 기온과 습도를 저장하고 display()를 호출한다.
     * @param temp      온도
     * @param humidity  습기
     * @param perssure  기압
     */
    @Override
    public void update(float temp, float humidity, float perssure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    // 가장 최근에 얻은 기온과 습도를 출력한다.
    @Override
    public void display() {
        System.out.println("현재 온도는: " + temperature + "C 도, 습기: " + humidity + "%");
    }

}
