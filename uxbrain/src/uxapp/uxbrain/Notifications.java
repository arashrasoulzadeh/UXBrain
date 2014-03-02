package uxapp.uxbrain;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class Notifications extends Activity {

	Context context;
	public Notifications (Context c)
	{
		context=c;
	}
	public Toast NotificationToast(String text)
	{
		Toast temp= new Toast(context);
		
		temp.makeText(context, text, Toast.LENGTH_LONG);
		  
		return temp;
	}
}
