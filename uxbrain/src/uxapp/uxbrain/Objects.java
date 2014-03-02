package uxapp.uxbrain;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Relation;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Objects extends Activity {
	Context context;

	public Objects(Context c) {
		context = c;
	}
	//layouts
	public LinearLayout BuildLinearLayout()
	{
		
		LinearLayout temp= new LinearLayout(context);
		 
		return temp;
	}
	public RelativeLayout BuildRelativeLayou()
	{
		RelativeLayout temp = new RelativeLayout(context);
		
		return temp;
	}
	//controls
	public Button BuildButton(String text,LayoutParams layoutparms,OnClickListener event)
	{
		Button temp=new Button(context);
		temp.setText(text);
		temp.setLayoutParams(layoutparms);
		temp.setOnClickListener(event);
		
		return temp;
	}
	public TextView BuildTextView(String defaulttext,LayoutParams layoutparms,OnClickListener event,String texthint)

	{
		TextView temp=new TextView(context);
		temp.setText(defaulttext);
		temp.setLayoutParams(layoutparms);
		temp.setOnClickListener(event);
		temp.setHint(texthint);
		

		return temp;
		
	}
	
	
	
	
	
	
}
