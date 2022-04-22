public class Main {
    public static void main(String [] args){
        WeatherData weatherData = new WeatherData();
        ISubject subject = weatherData;
        IObserver observer = new Console_Display();

        subject.subscribe(observer);
        subject.notify_all_subscribers();

        subject.remove_subscriber(observer);
        subject.notify_all_subscribers();
    }
}
