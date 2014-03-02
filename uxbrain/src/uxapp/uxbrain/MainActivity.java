package uxapp.uxbrain;

 import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	String STRHeader = "نمونه کتاب";
	Objects obj;
	Mathmetical mathmetical; 
	Notifications notifications;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View MainView = new View(MainActivity.this);
		obj = new Objects(this);
		mathmetical = new Mathmetical(this);
		notifications = new Notifications(this);
		

		
		LinearLayout layout = obj.BuildLinearLayout();

		layout.addView(obj
				.BuildButton(String.valueOf(mathmetical.GenereateRandomNumber(1, 3)), new LayoutParams(100, 100), null));
		layout.addView(obj.BuildTextView(null, new LayoutParams(100, 100),
				null, "simple"));
		MainView = layout;
		setContentView(MainView);
		notifications.NotificationToast("Test").show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
