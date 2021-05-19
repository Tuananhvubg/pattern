package observer_pattern_boec_tmd;

public class Follower implements Observer {

	protected String name;

	public Follower(String name) {
		super();
		this.name = name;
	}

	@Override
	public void notification(String handle, String tweet) {
		System.out.printf("'%s' received notification from Handle: '%s', Message: '%s'\n", name, handle, tweet);
	}

}
