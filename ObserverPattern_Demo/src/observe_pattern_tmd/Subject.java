package observe_pattern_tmd;

public interface Subject {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	// Notify all observer that status of subject have changed
	public void notifyObservers();

}
