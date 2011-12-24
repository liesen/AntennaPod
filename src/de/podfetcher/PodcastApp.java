package de.podfetcher;

import de.podfetcher.feed.FeedManager;
import android.app.Application;

public class PodcastApp extends Application {

	private static PodcastApp singleton;
	
	public static PodcastApp getInstance() {
		return singleton;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		singleton = this;
		
		FeedManager manager = FeedManager.getInstance();
		manager.loadDBData(getApplicationContext());
	}
	
	

}