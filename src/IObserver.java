public interface IObserver {
void update();
void set_data(float temperature, float pressure, float humidity);
}
