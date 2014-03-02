package uxapp.uxbrain;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class UX_Market extends Activity {

	Context context;

	public UX_Market(Context c) {
		context = c;
	}

	public Intent StartInMarket(String PackageName) {
		Intent marketIntent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("market://details?id=" + PackageName));
		marketIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY
				| Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

		return marketIntent;
	}

}
