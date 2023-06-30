package com.my.power;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class TiklashActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private ImageView imageview1;
	private LinearLayout linear2;
	private Button button1;
	private ImageView imageview2;
	private EditText edittext1;
	private ImageView imageview4;
	private TextView textview1;
	private LinearLayout linear6;
	private Button button2;
	private EditText edittext2;
	
	private SharedPreferences aa;
	private TimerTask d;
	private AlertDialog.Builder di;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tiklash);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		button1 = (Button) findViewById(R.id.button1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		button2 = (Button) findViewById(R.id.button2);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		aa = getSharedPreferences("aa", Activity.MODE_PRIVATE);
		di = new AlertDialog.Builder(this);
		
		button1.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				
				return true;
				}
			 });
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Double.parseDouble(edittext1.getText().toString()) == Double.parseDouble(aa.getString("telefon", ""))) {
					di.setTitle("Parolingiz");
					di.setMessage("4432");
					di.create().show();
				}
				else {
					di.setTitle("Xatolik");
					di.setMessage("Bu telefon raqam bilan roʻyxatdan oʻtish amalga oshirilmagan");
					di.create().show();
				}
				linear5.setVisibility(View.VISIBLE);
				linear4.setVisibility(View.GONE);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Double.parseDouble(edittext2.getText().toString()) == 4432) {
					di.setTitle("Sizning parolingiz");
					di.setMessage(aa.getString("parol", ""));
					di.create().show();
				}
			}
		});
	}
	
	private void initializeLogic() {
		linear5.setVisibility(View.GONE);
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF00ACC1));
		linear6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF00ACC1));
		button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF4CAF50));
		button2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF4CAF50));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}