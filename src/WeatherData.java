import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {
    private float temperature;
    private float humidity;
    private float pressure;

    private List<IObserver> obserber_list;

    public WeatherData(){
        this.temperature = 12;
        this.humidity = 76;
        this.pressure = 765;
        this.obserber_list = new ArrayList<>();
    }

    @Override
    public void subscribe(IObserver iObserver) {
        obserber_list.add(iObserver);
    }

    @Override
    public void remove_subscriber(IObserver iObserver) {
        obserber_list.remove(iObserver);

    }

    @Override
    public void notify_all_subscribers() {
        for (IObserver iObserver: obserber_list){
            iObserver.set_data(temperature,humidity,pressure);
            iObserver.update();
        }
    }
}
