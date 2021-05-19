package observer_pattern_boec_tmd;

public class ObserverPattern_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicFigure TMD = new PublicFigure("ThinhMD", "TMD");
		PublicFigure CMD = new PublicFigure("CaMapCon", "CMD");

		Follower vta = new Follower("AnhVT");
		Follower tdt = new Follower("TienTD");
		Follower lat = new Follower("TuanLA");
		Follower pmh = new Follower("HieuPM");

		TMD.addSubscriber(vta);
		TMD.addSubscriber(tdt);
		TMD.addSubscriber(lat);
		CMD.addSubscriber(pmh);

		CMD.addSubscriber(vta);
		CMD.addSubscriber(tdt);
		CMD.addSubscriber(lat);
		CMD.addSubscriber(pmh);

		TMD.tweet("Hello Friends!");
		CMD.tweet("Zau Zau!");
		TMD.removeSubscriber(pmh);
		TMD.tweet("Stay Home! Stay Safe!");
	}

}
