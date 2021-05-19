package observer_pattern_boec_tmd;

public interface Subject {
	
	public void addSubscriber(Observer observer);

	public void removeSubscriber(Observer observer);

	public void notifySubscribers(String tweet);
	
}
