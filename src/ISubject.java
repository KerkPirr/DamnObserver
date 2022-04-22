public interface ISubject {
    void subscribe(IObserver iObserver);
    void remove_subscriber(IObserver iObserver);
    void notify_all_subscribers();
}
