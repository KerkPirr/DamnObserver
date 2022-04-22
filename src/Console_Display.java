public class Console_Display implements IObserver {

    private float temperature;
    private float humidity;
    private float pressure;

    public Console_Display(){
        this.humidity = 0;
        this.pressure = 0;
        this.temperature = 0;
    }
    public void print_data(){
        System.out.printf("temperature: %.3f humidity: %f pressure: %f\n", temperature, humidity, pressure);
    }

    @Override
    public void update() {
        print_data();
    }

    @Override
    public void set_data(float temperature, float pressure, float humidity) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
    }
}
