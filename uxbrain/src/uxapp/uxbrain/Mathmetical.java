package uxapp.uxbrain;

import java.util.Random;

import android.app.Activity;
import android.content.Context;

public class Mathmetical extends Activity {
	Context context;

	public Mathmetical(Context c) {
		context = c;
	}
	
	 public int GenereateRandomNumber()
	 {
		 int temp=0;
		 Random R=new Random();
		 temp=R.nextInt();
		 return temp;
	 }
	 public int GenereateRandomNumber(int min,int max)
	 {
		 int temp=0;
		 Random R=new Random();
		 temp=R.nextInt(max - min + 1) + min;
		 return temp;
	 }	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
