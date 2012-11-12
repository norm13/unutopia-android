package org.francho.unutopia_android.services.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import nl.matshofman.saxrssreader.RssFeed;
import nl.matshofman.saxrssreader.RssItem;
import nl.matshofman.saxrssreader.RssReader;
import android.util.Log;

public class Dummy {

	
	private static final String TAG = "Dummy";

	public void hardWork() {
		Log.d(TAG, "hardwork start");
		long endTime = System.currentTimeMillis() + 5 * 1000;
		
		URL url;
		try {
			url = new URL("http://francho.org/feed");
			RssFeed feed = RssReader.read(url);

			ArrayList<RssItem> rssItems = feed.getRssItems();
			for(RssItem rssItem : rssItems) {
			    Log.i("RSS Reader", rssItem.getTitle());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Log.d(TAG, "hardwordk stop");
	}
}
