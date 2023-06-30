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
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class PageActivity extends AppCompatActivity {
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear9;
	private LinearLayout sol;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear10;
	private ImageView imageview1;
	private TextView textview1;
	private TextView textview13;
	private LinearLayout linear3;
	private WebView webview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview8;
	private LinearLayout linear7;
	private LinearLayout solar;
	private LinearLayout collector;
	private ImageView imageview3;
	private TextView textview7;
	private ImageView imageview4;
	private TextView textview6;
	private LinearLayout wind;
	private ImageView imageview5;
	private TextView textview10;
	private LinearLayout water;
	private ImageView imageview6;
	private TextView textview11;
	private LinearLayout bio;
	private ImageView imageview7;
	private TextView textview12;
	
	private SharedPreferences aa;
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.page);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		sol = (LinearLayout) findViewById(R.id.sol);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview13 = (TextView) findViewById(R.id.textview13);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		solar = (LinearLayout) findViewById(R.id.solar);
		collector = (LinearLayout) findViewById(R.id.collector);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview6 = (TextView) findViewById(R.id.textview6);
		wind = (LinearLayout) findViewById(R.id.wind);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview10 = (TextView) findViewById(R.id.textview10);
		water = (LinearLayout) findViewById(R.id.water);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview11 = (TextView) findViewById(R.id.textview11);
		bio = (LinearLayout) findViewById(R.id.bio);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview12 = (TextView) findViewById(R.id.textview12);
		aa = getSharedPreferences("aa", Activity.MODE_PRIVATE);
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview2.setTextColor(0xFF4CAF50);
				textview3.setTextColor(0xFFC8E6C9);
				textview4.setTextColor(0xFFC8E6C9);
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview3.setTextColor(0xFF4CAF50);
				textview2.setTextColor(0xFFC8E6C9);
				textview4.setTextColor(0xFFC8E6C9);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("file:///android_res/raw/yillik");
				textview4.setTextColor(0xFF4CAF50);
				textview3.setTextColor(0xFFC8E6C9);
				textview2.setTextColor(0xFFC8E6C9);
			}
		});
		
		solar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SolarActivity.class);
				startActivity(i);
			}
		});
		
		collector.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), CollectorActivity.class);
				startActivity(i);
			}
		});
		
		wind.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WindActivity.class);
				startActivity(i);
			}
		});
		
		water.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), WaterActivity.class);
				startActivity(i);
			}
		});
		
		bio.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), BioenergyActivity.class);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		webview1.loadUrl("file:///android_res/raw/kun");
		textview1.setText(aa.getString("ism", ""));
		sol.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		solar.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF757575));
		collector.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF757575));
		wind.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		water.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		bio.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
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