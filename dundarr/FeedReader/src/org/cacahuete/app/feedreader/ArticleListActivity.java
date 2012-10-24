package org.cacahuete.app.feedreader;

import org.cacahuete.app.feedreader.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;



/**
* Splash screen activity
*
*/
public class ArticleListActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.article_list);
		
		
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.article_list, menu);
        return true;
    }
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.aboutscreen:
	            this.showAboutScreen();
	            return true;
	        
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	private void showAboutScreen() {
		Context context = this;
		Intent intent = new Intent(context, AboutScreenActivity.class);
		startActivity(intent);
	}

}


